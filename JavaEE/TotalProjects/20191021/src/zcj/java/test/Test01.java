/*
多态
 */
package zcj.java.test;

public class Test01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);

        Animal dog = new Dog();//自动向上转型，本质上还是dog
        animalCry(dog);

        Cat cat = new Cat();
        animalCry(cat);
    }

    static void animalCry(Animal a) {
        a.shout();
    }

}

class Animal {
    public void shout() {
        System.out.println("叫了一声");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("wangwangwang");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}