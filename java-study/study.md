# java study  

局部变量必须手动初始化  
创建包的语句只能用于第一行  
多态性通过覆盖和重载实现  
>多态
>>一种功能有多种实现。通过方法的重载和覆盖可以实现多态。  
>>子类对象可以当作父类对象使用  
>>父类对象不能当作子类对象使用  
>>用 instanceof 操作符测试一个对象是否是一个类的实例  

## 重载与覆盖

重载用于在同一个类中，可以定义多个方法，它们具有相同的名称但具有不同的参数列表（类型、顺序、数量）。  

```java  
public class MyClass {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 可能有其他参数类型或数量的 add 方法
}
```  

覆盖指的是子类重新实现（提供自己的实现）了父类中的某个方法，使得子类对象可以使用自己的方法实现。  

```java

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
```  

## final

修饰类：不能被继承  
修饰方法：不能被覆盖  
修饰属性：不能重新赋值  
修饰常量：不能重新赋值  

## 抽象类

抽象类：用abstract修饰的类。  
只能用于继承，不能用于创建对象  
抽象方法：用abstract修饰的方法只有方法头没有方法体。
抽象方法只能定义在抽象类中  

## 接口  

Java中的接口可以多重继承、接口只能继承接口，不能继承类
接口定义与类定义相似，但只能包含 静态常量(public static final)和抽象方法(public abstract)。  

```java
package inter;
public interface IEatable {
     void eat();
}
public abstract class Fruit {
     String color;
     public void show() {
           System.out.println("color is "+color);
     }
}
public class Apple extends Fruit implements IEatable{
     @Override
     public void eat() {
           System.out.println("apple can be eaten");
           
     }
     public static void main(String[] args) {
          
     }
}
```
