package com.amit.lombok;

public class App {

	public static void main(String[] args) 
	{
	Person person = Person.builder()
			.age(50)
			.firstname("Amit")
			.build();
	System.out.println(person.toString());
	}

}
