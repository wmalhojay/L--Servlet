package com.malhojay;

public class Friends {
	String name;
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

	int age;
	
	public Friends(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return ("name = " + name + " age = " + age + "\n");
	}
}
