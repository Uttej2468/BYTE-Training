package com.finserv.java.Maps;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.finserv.java.Encapsulation.Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import com.finserv.java.Encapsulation.Employee;
import com.finserv.java.Encapsulation.Employee;
import com.finserv.java.Encapsulation.Employee;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myHashMap();
myLinkedHashMap();
myTreeMap();
myEmployeeMap();
	}
	public static void myHashMap()
	{
		System.out.println("Using HashMap");
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Uttej");
		map.put(103, "Hara");
		map.put(102, "Rahul");
		map.put(null, "Teja");
		Set<Integer> set = map.keySet();
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
	
	public static void myLinkedHashMap()
	{
		System.out.println("Linked Hash Map");
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(103, "Uttej");
		map.put(102, "Hara");
		map.put(101, "Rahul");
		map.put(105, "Yogith");
		Set<Integer> set = map.keySet();
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
	
	
	public static void myTreeMap()
	{
		System.out.println("Using TreeMap");
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(101, "Uttej");
		map.put(103, "Hara");
		map.put(104, "Rahul");
		map.put(102, "Rohan");
		//map.put(null,"sai"); Main difference between hashmap and treemap is treemap will not accept null values
		Set<Integer> set = map.keySet();
		/*for(Integer key:set) {
			String value = map.get(key);
			System.out.println(key + " " + value);
		}*/
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
	public static void myEmployeeMap()
	{
		System.out.println("Using Employee Map");
		Map<Employee ,String> map = new HashMap<Employee,String>();
		Employee emp1 = new Employee(101,"asha",60000);
		Employee emp2 = new Employee(102,"disha",70000);
		Employee emp3 = new Employee(103,"nisha",90000);
		Employee emp4 = new Employee(101,"asha",60000);
		//Set<Employee> set = map.keySet();
		map.put(emp4, "Hyd");
		map.put(emp3, "Varanasi");
		map.put(emp2, "Pune");
		map.put(emp1, "nzb");
		/*for(Integer key:set) {
			String value = map.get(key);
			System.out.println(key + " " + value);
		}*/
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
