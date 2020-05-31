
// package code.laowang.20200530;
import java.util.Scanner;

public class IfTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("请输入您的年龄:");

        int age = s.nextInt();

        if (age >= 0 & age <= 5) {
            System.out.println("您当前正处于婴幼儿阶段！");
        } else if (age >= 6 & age <= 10) {
            System.out.println("您当前正处于少年阶段！");
        }

    }
}