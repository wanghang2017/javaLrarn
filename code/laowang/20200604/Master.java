public class Master {
    public void feed(Pet a) {
        // Dog d = (Dog)a;
        a.eat();
        // if (a instanceof Dog) {
        //     Dog d = (Dog) a;
        //     d.eat();
        // } else if (a instanceof Cat) {
        //     Cat c = (Cat) a;
        //     c.eat();
        // } else if (a instanceof YingWu) {
        //     YingWu y = (YingWu) a;
        //     y.eat();
        // }
    }

    public static void main(String[] args){
        Master m = new Master();
        Cat c = new Cat();
        Dog d = new Dog();
        YingWu y = new YingWu();
        m.feed(c);
        m.feed(d);
        m.feed(y);
    }
}