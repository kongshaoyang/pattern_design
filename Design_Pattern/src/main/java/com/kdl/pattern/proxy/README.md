java文件会编译成class文件
class 文件是一组 8位的二进制字节流
class 文件中会有interfaces_count和methods_count，
这是判断接口数量和方法数量的，这两个都是占了两个字节，数量又是从1开始计算的，
所以最大数为65535