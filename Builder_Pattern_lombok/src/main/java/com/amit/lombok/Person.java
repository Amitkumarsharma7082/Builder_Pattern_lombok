package com.amit.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person 
{
private String firstname;
private String surname;
private String ssn;
private int age;

}
