// package code.laowang.20200530;

public class OperatorTest {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        System.out.println(a > b && a > b++);
        System.out.println(b);

        int c = 10;
        int d = 11;

        System.out.println(c > d & c > d++);
        System.out.println(d);

    }
}