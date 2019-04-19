package com.kdl.pattern.sigleton;


import com.kdl.pattern.sigleton.container.ContainerSingleton;
import com.kdl.pattern.sigleton.enumsig.EnumSingleton;
import com.kdl.pattern.sigleton.hunger.HungerSingleton;
import com.kdl.pattern.sigleton.inner.InnerSingleton;
import com.kdl.pattern.sigleton.seriable.SeriableSingleton;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class SingletonTest {
    @Test
    public  void lazyTest() {
      Thread th1 = new Thread(new ThreadTest());
        Thread th2 = new Thread(new ThreadTest());
        Thread th3 = new Thread(new ThreadTest());
        th1.start();
        th2.start();
        th3.start();
    }
    @Test
    public  void hungerTest() {
        HungerSingleton h1 = HungerSingleton.getInstance();
        HungerSingleton h2 = HungerSingleton.getInstance();
        System.out.println(h1 == h2);
    }

    @Test
    public void innerTest(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                InnerSingleton innerSingleton1 = InnerSingleton.getInstance();
                System.out.println(innerSingleton1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                InnerSingleton innerSingleton2 = InnerSingleton.getInstance();
                System.out.println(innerSingleton2);
            }
        });
        t1.start();
        t2.start();
    }


    @Test
    public void enumSingletonTest() {
        Object instance1 = EnumSingleton.getInstance();
        Object instance2 = EnumSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void containnerSingletonTest() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ContainerSingleton instance =
                        (ContainerSingleton)ContainerSingleton.getInstance("com.kdl.pattern.sigleton.container.ContainerSingleton");
                System.out.println(instance);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ContainerSingleton instance =
                        (ContainerSingleton)ContainerSingleton.getInstance("com.kdl.pattern.sigleton.container.ContainerSingleton");
                System.out.println(instance);
            }
        });
        thread1.start();
        thread2.start();
    }

    @Test
    public void serialzableSingletonTest() {
        SeriableSingleton instance = SeriableSingleton.getInstance();
        try (FileOutputStream fileOutputStream = new FileOutputStream("serialzableSingletonTest");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            System.out.println(instance);
            objectOutputStream.writeObject(instance);
            FileInputStream fileInputStream = new FileInputStream("serialzableSingletonTest");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
