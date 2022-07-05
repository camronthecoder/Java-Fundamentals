package com.haley.jsFoundations.getterSetterPractice;
// A class = cars , foods , countries
//Objects = stuff that makes up that class like
    //set the class
public class Account {
    //set the objects inside that class
    String name;
    int age;
    // main method where you call the functions
    public static void main(String[] args) {
        Account a = new Account();


        //call setter function with paramater inside
        a.setName("Pablo");
        a.setAge(44);

        a.printDetails();
    }

    //create a setter
    public void setName(String name){
        // using this makes it is making name = what we put in our class
        // not what is in the paramater of setName
        this.name = name;
    }
    public void setAge (int age ){
        this.age = age;
    }

    //create getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //function to print his name and age out
    public void printDetails(){
        System.out.println(getName() + " " + getAge());
    }

}
