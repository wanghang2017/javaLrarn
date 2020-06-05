
public class Pet {
    public void eat() {
        System.out.println("宠物在吃东西");
    }
}

class Dog extends Pet {
    public void eat() {
        System.out.println("狗在吃东西");
    }
}

class Cat extends Pet {
    public void eat() {
        System.out.println("猫在吃东西");
    }
}

class YingWu extends Pet {
    public void eat() {
        System.out.println("鹦鹉在吃东西");
    }
}