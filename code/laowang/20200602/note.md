## this
> 1. this 是一个关键字 是一个引用 保存内存地址指向自身
> 2. this可以使用在实例方法中 也可以使用在构造方法中
> 3. this不能使用在静态方法中
> 4. 区分局部变量和实例变量时不能省略this
> 5. this()这种语法只能出现在构造方法第一行，表示当前构造函数调用本类的其它函数，目的时代码复用


###  总结
> 类体{
    实例变量;
    实例方法;

    静态变量;
    静态方法;

    构造方法;

    静态代码块;
    实例代码块;

    方法(){
        局部变量;
    }
}

> 2. 所有的实例相关的都是先创建对象
> 3. 所有的静态相关的都是直接采用"类名."来访问 （也可以对象.来访问 不推荐）
> 4. 同类总  this.可以省略   类名.可以省略



## 继承

### 继承的基本作用:
> 1. 子类继承父类，代码可以得到复用
> 2. 继承是方法覆盖 和多态的基础
### 继承的相关特性
> 1. B类继承A类 A类称之为 超类 父类 基类 B类称之为子类 派生类 扩展类
> 2. java中只支持单继承
> 3. 可以间接继承 C继承B  B继承A  C间接继承A
> 4. java中规定,子类继承父类，除构造方法不能继承外,剩下都可以继承，但是私有的属性无法在子类中直接访问
> 5. 如果一个类没有显式的继承任何类，则默认继承Object类
> 6. 继承也存在缺店  子类和父类耦合度很高 父类改变 直接影响到子类