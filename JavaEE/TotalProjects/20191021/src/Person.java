public class Person {
    private String name;
    private String gender;
    private int age;

    public Person() {
        System.out.println("使用无参构造方法创建对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

class Test06{
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person("明日科技","男",11);
        System.out.println("员工1的信息：");

        System.out.println("员工姓名："+person1.getName());
        System.out.println("员工性别："+person1.getGender());
        System.out.println("员工年龄："+person1.getAge());

        System.out.println("员工2的信息：");

        System.out.println("员工姓名："+person2.getName());
        System.out.println("员工性别："+person2.getGender());
        System.out.println("员工年龄："+person2.getAge());

    }
}
