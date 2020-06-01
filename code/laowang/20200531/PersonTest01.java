
public class PersonTest01 {

    public static void main() {
        Person p1 = new Person();

    }

}

class Person {
    // private表示私有的,被这个关键字修饰之后，该数据只能在本类中访问
    // 出了这个类，age属性就无法访问了。私有的
    private int age;
    // 对外提供简单的访问入口
    // 外部程序只能通过调用以下的代码来完成访问
    // 写操作 get
    // 读操作 set

    public void setAge(int _age) {
        if(_age<0&&age>150){
            System.out.println("年龄不合法");
            return;
        }
        age = _age;
    }

    public int getAge() {
        return age;
    }

}