package org.example.OopsConcept;
/*
   * Encapsulation => process of binding data with methods so that we cannot have
    direct access to data.
   * only through methods we can access data which ensures data
     hiding and controlled access.
   * It improves security, maintainability, and flexibility.
 * */
public class Encapsulation {
    private int age;
    private String name;

    //getter and setter method used to access and update the data(variables)
    //getter returns/displays the data and setter sets the value of data.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
