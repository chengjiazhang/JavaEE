public class CloneTest02 {

    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Address address=new Address("中国","吉林","长春");
        Employee01 employee1=new Employee01("张三",30,address);
        System.out.println("员工1的信息");
        System.out.println(employee1);
        System.out.println("克隆之后");
        Employee01 employee2=employee1.clone();
        employee2.getAddress().setState("中国");
        employee2.getAddress().setProvince("四川");
        employee2.getAddress().setCity("成都");
        employee2.setName("李四");

        employee2.setAge(18);

        System.out.println("员工1的信息：");
        System.out.println(employee1);
        System.out.println("员工2的信息:");
        System.out.println(employee2);

    }

}

class Address{

private String state;
private String province;
private String city;

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }
}
class Employee01 implements Cloneable{

    private String name;
    private int age;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee01 clone() {
        Employee01 employee=null;
        try {
            employee=(Employee01)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Employee01(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
