package com.hibernate.ormtool;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int roll_no;
	private String name;
	private int age;
	private byte[] image;
	private Certificate certificate;
	
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
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
	
	public Student(int roll_no, String name, int age, byte[] image) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.image = image;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", image=" + Arrays.toString(image)
				+ ", certificate=" + certificate + "]";
	}
	
	
	
}
