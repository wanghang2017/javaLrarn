public class OverridTest {
    public static int a = 10;

    public static void main(String[] args) {
        Super super1 = new Super();
        System.out.println(super1.getI());
        Sub sub = new Sub();
        System.out.println(sub.getI());

    }

}

class Super {
    private static int i = 10;

    public static int getI() {
        return i;
    };

    public static void setI(int _i) {
        i = _i;
    }
}

class Sub extends Super {

    public static int getI() {
        return Super.getI();
    }

}