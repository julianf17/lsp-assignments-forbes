package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException.IntegerSetException;

public class Driver {

	public static void main(String[] args) {
		//Largest/Smallest 
		System.out.println("Largest + Smallest of Set1 Tests");
		System.out.println("----------------------");
		IntegerSet set1 = new IntegerSet(null);
		
		//Smallest Throw Error
		System.out.println("Throw 2 empty Set Errors:");
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		//Largest Throw Error
		try {
			System.out.println("Largest value in Set1: " + set1.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
				
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1: " + set1.toString());
		
		try {
			System.out.println("Smallest value in Set1: " + set1.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Largest value in Set1: " + set1.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		IntegerSet set2 = new IntegerSet(null);
		set2.add(4);
		set2.add(5);
		
		//Union 
		System.out.println(" ");
		System.out.println("Union of Set1 and Set2 Test");
		System.out.println("----------------------");
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Value of Set2: " + set2.toString());
		set1.union(set2);	
		System.out.println("Result of union of Set1 and Set2");
		System.out.println("Set1 is now "+ set1.toString());
		
		//Length
		System.out.println(" ");
		System.out.println("Length of Set1 Test");
		System.out.println("-------------------");
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Length of Set1: " + set1.length());
		
		//Equal Sets Test
		System.out.println(" ");
		System.out.println("Equal Sets Tests");
		System.out.println("-----------------");
		IntegerSet set3 = new IntegerSet(null);
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Value of Set2: " + set2.toString());
		System.out.println("Value of Set3: " + set3.toString());
		System.out.println("Set1 = Set3: " + set1.equals(set3));
		System.out.println("Set1 = Set2: " + set1.equals(set2));
		
		//Containment
		System.out.println(" ");
		System.out.println("Contains Test");
		System.out.println("-----------------");
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Set1 contains 6: " + set1.contains(6));
		System.out.println("Set1 contains 3: " + set1.contains(3));
		 
		System.out.println(" ");
		System.out.println("Remove + Clear + isEmpty Test");
		System.out.println("-----------------");
		System.out.println("Value of Set3: " + set3.toString());
		try {
			set3.remove(3);
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			set3.remove(1);
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value of Set3 after removing 3 and 1: " + set3.toString());
		System.out.println("Set3 is empty: "+ set3.isEmpty());
		set3.clear();
		System.out.println("Value of Set3 after removing all values: " + set3.toString());
		System.out.println("Set3 is empty: "+ set3.isEmpty());
		System.out.println("Trying to remove from empty set Exception Throw:");
		try {
			set3.remove(1);
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Intersection 
		System.out.println(" ");
		System.out.println("Intersection of Set1 and Set2");
		System.out.println("------------------------------");
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Value of Set2: " + set2.toString());
		System.out.println("Result of Intersection of Set1 and Set2");
		set1.intersect(set2);
		System.out.println("Set1 is now "+ set1.toString());
		
		//Difference 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(" ");
		System.out.println("Difference of Set1 and Set2");
		System.out.println("-----------------------------");
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println("Value of Set2: " + set2.toString());
		System.out.println("Result of Set1 - Set2:");
		set1.diff(set2);
		System.out.println("Set1 is now "+ set1.toString());
		
	}

}