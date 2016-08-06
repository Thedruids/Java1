/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediatejava;

/**
 *
 * @author Thomas
 */
public class Person {
    
    private String firstName;
    private String surName;
    private int age;
    private int id;

    public Person() {
    }

    public Person(String firstName, String surName, int age, int id) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("UserID: %d. Name: %s %s. Age: %d",
                id,
                firstName,
                surName,
                age
                );
    }
    
    
    
    
    
    
    
    
    
}
