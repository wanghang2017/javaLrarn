// package code.laowang.20200530;
/*
1. 输出信息到控制台
    System.out.println(..);
2、在java中怎么接收键盘输入
   1. java.util.Scanner s = new java.util.Scanner(System.in);
   2. 接收一个整数:
    int i = s.netxInt();
   3. 接收一个字符串
    String ss = s.next();
*/


public class KeyInput {
    public static void main(String[] args){
        // 创建一个键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        // 接收用户的输入，从键盘上接收一个int类型的数据

        // 代码执行到这里 会暂停下来
        // 等待用户输入，用户可以从键盘上输入一个整数，然后回车，回车之后
        // i变量就有值了 并且i变量中保存的这个值是用户输入的数字
        int i = s.nextInt();
        


    }
}