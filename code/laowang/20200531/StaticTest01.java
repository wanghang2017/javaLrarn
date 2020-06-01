


// 1. 使用static关键字可以定义: 静态代码块
// 2. 社么时候执行静态代码块？
//   类加载时执行  并且只执行一次
//   静态代码块在类加载时执行，并且在main方法之前执行

// 3. 静态代码块从上往下执行
// 4. 作用?
//   第一: 静态代码块不常用
//   第二: 代码块语法机制实际上是SUN公司给程序员的一个特殊时机（类加载时机）
public class StaticTest01 {
    static {
        System.out.println("hello1");
    }
    static{
        System.out.println("hello2");
    }
    static int a = 100;

    static{
        System.out.println(a);
    }
    // static int a = 100;
    public static void main(String[] args){
        System.out.println("hahahaha");
        new StaticTest01();
    }
    static{
        System.out.println("hello3");
    }
    private int c;

    {
        System.out.println(c);
    }

    public StaticTest01(){
        c = 100;
        System.out.println(c);
    }

}