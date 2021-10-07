
package com.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Animal {
   public final static String WILD = "Wild";
	public final static String DOMESTIC = "Domestic";

	private String name;
	private String type;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal() {
	}

	public Animal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List getAnimalList() {
		List animalList = new ArrayList();
		animalList.add(new Animal("Crocodile", WILD, 30));
		animalList.add(new Animal("Jaguar", WILD, 9));
		animalList.add(new Animal("Puma", WILD, 2));
		animalList.add(new Animal("Dog", DOMESTIC, 3));
		return animalList;
	}
 
}
