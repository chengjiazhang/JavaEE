import java.awt.*;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;


    @Override
    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", color=" + color +
//                '}';
        StringBuilder sb = new StringBuilder();
        sb.append("名字：" + name + "\n");
        sb.append("年龄：" + age + "\n");
        sb.append("重量：" + weight + "\n");
        sb.append("颜色：" + color + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {//利用属性来判断猫咪是否相同
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Double.compare(cat.weight, weight) == 0 &&
                name.equals(cat.name) &&
                color.equals(cat.color);
    }

    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, color);
    }
}

class Test07 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Java", 12, 21, Color.BLACK);
        Cat cat2 = new Cat("C++", 12, 21, Color.WHITE);
        Cat cat3 = new Cat("Java", 12, 21, Color.BLACK);
        System.out.println("猫咪1号：" + cat1);
        System.out.println("猫咪2号：" + cat2);
        System.out.println("猫咪3号：" + cat3);

        System.out.println("猫咪1号是否与猫咪2号相同：" + cat1.equals(cat2));//比较是否相同
        System.out.println("猫咪1号是否与猫咪3号相同：" + cat1.equals(cat3));//比较是否相同

        System.out.println("=============================");
        System.out.println("猫咪1号的哈希码：" + cat1.hashCode());
        System.out.println("猫咪2号的哈希码：" + cat2.hashCode());
        System.out.println("猫咪3号的哈希码：" + cat3.hashCode());

        System.out.println("====================");


    }


}