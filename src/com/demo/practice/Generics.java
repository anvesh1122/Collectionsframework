package com.demo.practice;

import java.util.*;

public class Generics {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     List<String> lst=new ArrayList<String>();
     lst.add("anvesh");
     lst.add("want to be softwareEngineer");
     lst.add("Automation testing");
     lst.add("selenium");
     
     System.out.println(lst);
     System.out.println(lst.size());
		
     List<Integer> list=new ArrayList<Integer>();
     list.add(1);
     list.add(10);
     list.add(24);
     System.out.println(list);
     System.out.println(list.size());
	}

}
