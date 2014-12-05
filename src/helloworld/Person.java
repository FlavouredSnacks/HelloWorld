/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Slugs
 */
public class Person {

    private String firstName = "Edward";
    private String lastName = "Philips";
    private int age = 27;

    public void setFirstname(String aFirstname) {
        this.firstName = aFirstname;
    }

    public void setLastname(String aLastname) {
        this.lastName = aLastname;
    }

    public String getFirstname() {

        return this.firstName;
    }

    public String getLastname() {
        return this.lastName;

    }
    
    public String getFullname() {
        return this.firstName + this.lastName;
    }
    public void setAge (int bAge) {
        this.age = bAge;
    }
    public int getAge () {
        return this.age;
    }
}
