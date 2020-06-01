public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("姓名: " + user.name);
        System.out.println("姓别: " + user.sex);
        System.out.println("年龄: " + user.age);
        System.out.println("地址: " + user.addr);
        Address addr = new Address();
        user.addr = addr;
        user.name = "张三";
        user.sex = '男';
        user.age = 12;
        System.out.println("姓名: " + user.name);
        System.out.println("姓别: " + user.sex);
        System.out.println("年龄: " + user.age);
        System.out.println("地址: " + user.addr.street + " " + user.addr.home + " " + user.addr.no);
        addr.street = "管庄";
        addr.home = "四惠小区";
        addr.no = 101;
        System.out.println("地址: " + user.addr.street + " " + user.addr.home + " " + user.addr.no);
    }
}

class User {
    String name;
    char sex;
    int age;
    Address addr;
}

class Address {
    String street;
    String home;
    int no;
}