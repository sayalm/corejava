package com.company.Object;



// This Example explains how to access instance variables and methods of a class

public class Puppy1 {
    int puppyAge;
    public Puppy1(String name){
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }
    public int getAge( ){
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
        /* Object creation */
        Puppy1 myPuppy1 = new Puppy1( "tommy" );
        /* Call class method to set puppy's age */
        myPuppy1.setAge( 2 );
        /* Call another class method to get puppy's age */
        myPuppy1.getAge( );
        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy1.puppyAge );
    }
}
