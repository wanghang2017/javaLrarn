## continue
> 1.continue语句后面可以指定循环吗？
> 可以的，见ContinueTest01.java


## 方法
> 1. 方法定义后怎么调用
>  类名.方法名(实际参数列表);
>  实参需要和形参一一对应，个数也要一一对应
>  类名什么时候可以省略?
>  在同一个类中的方法相互调用时 可以省略


## 内存结构
> 1. JVM （java虚拟机）  
> 主要三块内存区域 栈内存  堆内存  方法区   (当然还有其他的)
> 2. 程序运行过程的内存变化
> 2.1 先把代码加载到方法区
> 2.2 代码从上到下执行，当方法执行的时候,就会压栈 分配内存空间
> 2.3 该方法的局部变量 都会在属于该方法的栈内开辟内存空间
> 2.4 方法执行完  弹栈  释放内存空间
> 2.5 知道main函数弹出   程序结束
### 方法区
> 1. 类加载器classloader 将硬盘上的xxx.class字节码文件装在到JVM的时候，会将字节码文件存放到方法区中，也就是说方法区中存储的时代码片段
> 2. 因为类需要加载  所以方法区最先有数据
> 3. 主要存放代码code


### 栈(stack)内存
> 1. 在方法被调用的时候，该方法需要内存空间在栈中分配
> 2. 

### 堆区  堆内存


### 栈数据结构
> 1. 数组、链表、图、二叉树、栈、队列。。。。



### 方法的重载
> 1. 条件: 1. 同一个类中  2. 类名相同  3. 形参列表不同
>  tips： 与返回值类型无关  与修饰符列表无关


### 递归
> 1.在实际开发中，假设真的遇到StackOverflowError 解决方案
> 第一步: 先检查递归的结束条件对不对，修改正确为止
> 第二步: 递归条件没问题 手动调整JVM内存初始化的大小  调大点
> 第三步: 继续调大内存   java -X


## 面向对象
### 术语
> 1. OOA 面向对象分析 
     OOD 面向对象设计
     OOP 面向对象编程
### 面向对象的 三大特征
> 1. 封装 
> 2. 继承
> 3. 多态

### 编译过程
> 1. A类使用了不同文件的B类 正常情况下 应该先手动编译B类 再编译A类，但是jvm 在编译A类的时候是会默认去寻找用到的B.class 文件，找到了直接用，没找到找 B.java文件 找到了 自动编译 成B.class文件


### 创建对象的内存变化

> 1. 方法区: 存储代码片段
> 2. 栈内存: 局部变量
> 3. 堆内存: 凡是通过new运算符创建的对象，都存储在堆内存中，new运算符的作用就是在堆内存中开辟一块空间，用于存储对象以及对象的实例变量

> 4. 不能直接通过类名访问实例变量

### 对象和引用的区别
> 1. 对象是通过new出来的，在堆内存中存储
> 2. 引用是:但凡是变量，并且该变量中保存了 内存地址 （指向了堆内存中的对象） 


### tips
> 1. java中GC机制 垃圾回收器主要针对堆内存当中的垃圾数据(没有任何引用指向时)



### 构造方法
> 1. 当一个类中没有提供任何构造方法，系统默认提供一个
> 2. 实例变量会默认赋系统值 在(new)实例化的时候赋值


### 封装
> 1. 属性私有化(私用private关键字进行修饰)
> 2. 对外提供简单的操作入口


### static （静态的）
> 带有static的方法 和 没有static的方法 分别怎么调用?
> 带有static的方法  类名.方法名  
> 不带有的static的方法(实例方法)  实例.方法名  
> 所有static修饰的  都是类相关的 类级别的
> 所有static修饰的 都是采用"类名." 的方式访问。
> static修饰的变量: 静态变量
> static修饰的方法: 静态方法
> 静态变量再类加载时初始化，不需要new对象，静态变量空间就开出来了
> 静态变量存在方法区

> tips: 实例变量: 一定需要使用 "引用."来访问
        静态的: 建议使用"类名." 来访问， 但使用"引用."也行
        空引用访问静态变量不会报空指针异常
        访问实例变量会报错

> 能够访问实例变量的肯定是实例方法  

### 静态代码块

 
