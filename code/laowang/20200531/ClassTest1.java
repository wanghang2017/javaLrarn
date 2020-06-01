
public class ClassTest1 {
    public static void main(String[] args){
        Student s= new Student();
        System.out.println(s.sex);
    }
}

class Student {
    // 属性  成员变量
    private int no;
    char sex;
    String addres;
    String name;
}