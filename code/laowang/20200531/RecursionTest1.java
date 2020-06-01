
public class RecursionTest1 {
    public static void main(String[] args) {
        int num = add(10);
        int num2 = digui(10);
        int num3 = jiecheng(3);
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num);
    }

    public static int add(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static int digui(int n) {
        if (n <= 0) {
            return n;
        }
        return n + digui(--n);
    }

    public static int jiecheng(int n) {
        if (n <= 1) {
            return n;
        }
        return n * jiecheng(--n);
    }

}
