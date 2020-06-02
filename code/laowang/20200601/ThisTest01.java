
public class ThisTest01 {
    static int a = 10;
    static {
        System.out.println("ThisTest01的静态属性a=" + a);
        System.out.println("main函数的所属类加载了");
    }
    public static void main(String[] args) {
        System.out.println("main方法开始执行了");
        TestThis tt = new TestThis("haha");
    }
}
class TestThis {
    {
        System.out.println(this);
        // System.out.println(xx);
        // System.out.println(xx.name);
        System.out.println("代码块");
        System.out.println(this.b);
    }
    static int a = 1;
    String name = "haha";
    private TestThis xx = this;
    static {
        TestThis t = new TestThis("aaa");
        System.out.println("静态代码块");
        // System.out.println(b);

    }
    static int b = 12;
    TestThis() {
    }
    TestThis(String a) {
        xx.name = a;
        System.out.println("构造函数");
    }
}