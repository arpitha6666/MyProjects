package test.basicpgms;

import java.util.Arrays;

public class ArrayEqality {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,20,3,4,5};
		
		boolean result = Arrays.equals(a1, a2);
		
		if(result)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are unequal");

	}

}
