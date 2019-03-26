package oop;

//Person
class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instanciating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "1234567890";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		// attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone ="1234567890";

		// Action, activity, behaviour
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// what if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 ="331001122";

		// Action, activity, behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
	}

	// enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
}
