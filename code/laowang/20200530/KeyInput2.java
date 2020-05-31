import java.util.Scanner;
public class KeyInput2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("您输入的是："+i);
        System.out.print("请输入您的名字:");
        String ss = s.next();
        System.out.println(ss+",欢迎您");
    }
}