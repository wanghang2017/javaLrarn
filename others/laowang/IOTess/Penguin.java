
public class Penguin extends Animal {
    public static void main(String[] args) {
        Penguin p = new Penguin("小黄", 1);
        Mouse m = new Mouse("小灰", 1);
        SmallMouse s = new SmallMouse("小黑", 2);
        p.introduce();
        m.introduce();
        s.introduce();
        s.name = "hahaah";
        s.introduce();
    }

    public Penguin(String _name, int _id) {
        super(_name, _id);
    }
}

class Animal {
    protected String name;
    protected int id;

    public Animal(String _name, int _id) {
        name = _name;
        id = _id;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public void introduce() {
        System.out.println("name: " + name + "  id:" + id);
    }
}

class Mouse extends Animal {
    // private String name;
    // private int id;

    public Mouse(String _name, int _id) {
        super(_name, _id);
    }

    public void introduce() {
        System.out.println("name: " + this.name + "  id:" + this.id);
    }

}

class SmallMouse extends Mouse {
    // private String name;
    // private int id;

    public SmallMouse(String _name, int _id) {
        super(_name, _id);
    }

    public void introduce() {
        System.out.println("name: " + this.name + "  id:" + this.id);
    }

}