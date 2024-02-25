package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
 
    private static final long serialVersionUID = 1L;  //security feature - to allow track the version of your object
    
    private String name;
    private int age;
    private String address;

    transient int x; //this object wont be serialized and decerialized


    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public Student(int x) {
        this.x = x;
    }

    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    

    

}
