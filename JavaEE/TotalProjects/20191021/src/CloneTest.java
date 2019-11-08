/*
假克隆
 */

public class CloneTest {

    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Employee employee1=new Employee();
        employee1.setAge(30);
        employee1.setName("张三");

        System.out.println("员工1的信息：");
        System.out.println(employee1);

        System.out.println("克隆之后：=====");
        Employee employee2=employee1;
        employee2.setName("李四");
        employee2.setAge(20);
        System.out.println("员工2的信息：");
        System.out.println(employee2);

    }



}
class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
