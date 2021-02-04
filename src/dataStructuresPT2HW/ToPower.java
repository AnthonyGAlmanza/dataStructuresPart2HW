package dataStructuresPT2HW;

import java.util.Arrays;

public class ToPower {
	
	public static void toPower(int size, int power) {
		int[] newArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			newArray[i] = 1;
			for(int j = 0; j < power; j++) {
				newArray[i] *= i;
				
				System.out.println(newArray[i]);
			}
		}
		
		System.out.println(Arrays.toString(newArray));
	}



	
}

