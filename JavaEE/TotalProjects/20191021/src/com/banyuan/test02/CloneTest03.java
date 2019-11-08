/*
深克隆
 */
package com.banyuan.test02;

public class CloneTest03{
    public static void main(String[] args) {
        System.out.println("克隆之前：");

        Address address=new Address("中国","吉林","长春");
        Employee employee1=new Employee("张三",30,address);
        System.out.println("员工1的信息");
        System.out.println(employee1);
        System.out.println("克隆之后");
        Employee employee2=employee1.clone();
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
class Address implements Cloneable{
    private String state;
    private String province;
    private String city;

    @Override
    protected Address clone() throws CloneNotSupportedException {
        Address address=null;
        address=(Address)super.clone();
        return address;
    }

    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }

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
}
class Employee implements Cloneable{
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

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee clone() {
        Employee employee=null;
        try {
            employee=(Employee)super.clone();
            employee.address=address.clone();
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


}


