package com.jsp.stringpack;
import java.util.Arrays;
class Employee implements Comparable<Object>{
	int id;
	String name;
	String Company;
	public Employee(int id, String name, String company) {
		this.id = id;
		this.name = name;
		Company = company;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Company=" + Company + "]";
	}
	public int compareTo(Object o) {
		Employee e=(Employee) o;
		//Based on ID
		if(this.id>e.id)return 1;
		else if(this.id<e.id)return -1;
		return 0;
		
		// Based on Name
//		return (this.name.compareTo(e.name));
	}
}
public class ComparableClass {
	public static void main(String[]args) {
		Employee e1=new Employee(142,"Sunil","Oracle");
		Employee e2=new Employee(856,"Raju","Accenture");
		Employee e3=new Employee(136,"Bhuvan","Bosch");
		Employee e4=new Employee(975,"Manu","Wipro");
		Employee e5=new Employee(105,"Nithin","Zoho");
		Employee e6=new Employee(2154,"Abhi","Unisys");
		Employee e7=new Employee(6574,"Vidhya","TechMahindra");
		Employee e8=new Employee(7531,"Manasa","Google");
		Employee e9=new Employee(4852,"Gana","Infosys");
		Employee e10=new Employee(5987,"Esther","Amazon");
		Employee[]e= {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
		Arrays.sort(e);
		for(Employee n:e) System.out.println(n);
	}
}
