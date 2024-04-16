package com.jsp.stringpack;
import java.util.*;
class Student{
	int id;
	String name;
	String Course;
	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		Course = course;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + "]";
	}
}
class SortById implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		if(s1.id>s2.id)return 1;
		else if (s1.id<s2.id)return -1;
		return 0;
	}	
}
class SortByName implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		return s1.name.compareTo(s2.name);
	}	
}
class SortByCourse implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		return s1.Course.compareTo(s2.Course);
	}	
}
public class ComparatorClass {
	public static void main(String[] args) {
		Student[]s=new Student[5];
		s[0]=new Student(103,"Mahesh","BCA");
		s[1]=new Student(102,"Ashish","Mech");
		s[2]=new Student(104,"Brushabh","EEE");
		s[3]=new Student(105,"Abhi","IT");
		s[4]=new Student(101,"Rajput","CSE");
		Arrays.sort(s,new SortById());
		for(Student n:s)System.out.println(n);
		System.out.println("--------------------------------");
		Arrays.sort(s,new SortByName());
		for(Student n:s)System.out.println(n);
		System.out.println("--------------------------------");
		Arrays.sort(s,new SortByCourse());
		for(Student n:s)System.out.println(n);
		System.out.println("--------------------------------");
	}
}
