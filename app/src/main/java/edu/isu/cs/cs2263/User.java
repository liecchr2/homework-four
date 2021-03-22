package edu.isu.cs.cs2263;

import java.util.ArrayList;

//Implement Interface
public class User implements  Visitor{
    //Instance Variables
    String name;
    int age;
    ArrayList<User> userList = new ArrayList<>();

    //Default constructor
    public User() {}

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
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

    //Method to get the course list
    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> courses){
        userList = courses;
    }

    //Method to add the course list
    public boolean add(User u){
        return userList.add(u);
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, age);
    }

    //Method for concrete class to accept visitor
    @Override
    public String accept(RelationVisitor visitor) {
        return visitor.visit(this);
    }
}
