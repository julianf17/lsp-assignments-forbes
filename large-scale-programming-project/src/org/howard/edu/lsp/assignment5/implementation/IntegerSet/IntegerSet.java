package org.howard.edu.lsp.assignment5.implementation.IntegerSet;


import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException.IntegerSetException;


/**
 * Operations include clear, length, isEmpty, equals, add, remove, contains, largest, smallest, union, intersection, difference.
 * IntegerSet has implementation of set for integers.
 * ArrayList used as a individual container 
 * @author julianf17;
 */
public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor; 
	 * @param set
	 */
	public IntegerSet(List<Integer> set) {
		this.set = set;
	};

	 
	 // Makes a set empty
	 
	public void clear() {
		set.clear();
	};

	/**
	 * @return amount of items;
	 */
	public int length() {
		return set.size();
	}; 

	/**
	 * true if the 2 sets are equal;
	 * if they are not, it must be false;
	 * Equality = they contain all of the same values in ANY order;
	 * 
	 * @param b is the IntegerSet in order to check if equal to set;
	 * @return T/F;
	 */
	public boolean equals(IntegerSet b) {
		
		ArrayList<Integer> setB = (ArrayList<Integer>) b.set;
		
		if (set == null && setB == null) {
			return true;
		}
	    else if(set == null || setB == null) {
	    	return false;
	    }
	    else if(this.length() != setB.size()) {
	    	return false;
	    }
	     
	    ArrayList<Integer> setA = (ArrayList<Integer>) set;   
	  
	    Collections.sort(setA);
	    Collections.sort(setB);      
	     
	    return setA.equals(setB);
	}; 

	/**
	 * Returns true if the set contains the value, otherwise false;
	 * @param check if number is inside of the set;
	 * @return T/F depending on if within set;
	 */
	public boolean contains(int value) {
		int length= set.size();
		for(int i=0; i<length; i++){
			if (set.get(i) == value){
				return true;
			}
		}
		return false;
	};    

	/**
	 * Gets the largest value within the set;
	 * 
	 * @return the largest item in the set;
	 * @throws IntegerSetException if the set is empty;
	 */
	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("This set is empty");
		}
		return Collections.max(set);
	}; 

	/**
	 * Fetches smallest value in set; @return the smallest item in set;
	 * @throws IntegerSetException if set is empty;
	 */
	public int smallest() throws IntegerSetException{
		if (set.size() == 0) {
			throw new IntegerSetException("This set is empty");
		}
		return Collections.min(set);
	};


	/**
	 * + item to the set or does nothing ;
	 * @param  value added to the set;
	 */
	public void add(int item) {
		 if (set.contains(item)) {
			 return;
		 }
		 set.add(item);
	 };

	/**
	 * Removes an item from the set/does nothing;
	 * 
	 * @param item the value being removed from the set;
	 * @throws IntegerSetException if the set is empty;
	 */
	public void remove(int item) throws IntegerSetException{
		if (set.size() == 0) {
			throw new IntegerSetException("This set is empty");
		}
		else if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		} 
	}; 

	/** 
	 * @param intSetb set added to this.set;
	 */
	public void union(IntegerSet intSetb) {
		Set<Integer> temp = new HashSet<>();
		ArrayList<Integer> setB = (ArrayList<Integer>) intSetb.set;
		
		temp.addAll(set);
		temp.addAll(setB);
		
		set.clear();
		set.addAll(temp);
	};

	/**
	 *intersection of set
	 * 
	 * @param intSetb set used for finding intersection using this.set;
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 

	/**
	 * Creates difference
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}; 

	/**
	 * True if the set is empty, if not, false;
	 * 
	 * @return T/F if set is empty;
	 */
	public boolean isEmpty() {
		if (set.size() == 0){
			   return true;
		   }
		
		   return false;
	}; 

	/**
	 * shows string version of set
	 */
	public String toString() {
		String setString = set.stream().map(Object::toString).collect(Collectors.joining(", "));   
		   
		   return setString;
	};
}
/**
 * Coding References
 * https://www.tabnine.com/code/java/methods/java.util.stream.Collectors/joining
 * https://www.javacodegeeks.com/2019/03/check-two-lists-are-equal-java.html
 * https://www.tutorialspoint.com/get-the-intersection-of-two-sets-in-java
 * https://www.tutorialspoint.com/get-the-union-of-two-sets-in-java#:~:text=To%20get%20the%20union%20of,use%20the%20addAll()%20method.
 */