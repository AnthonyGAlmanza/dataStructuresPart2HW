package dataStructuresPT2HW;

import java.util.Arrays;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		double[ ] exampleArray = {1,5,6,5,4,1};
		
		
        int sum = 0;
        
        for(int i = 0; i < exampleArray.length; i++) {
       	 sum += exampleArray[i];
        }
		
        System.out.println(Arrays.toString(exampleArray));
        System.out.printf("The sum of this array is: %d\n", sum);
		
         double maximum = exampleArray[0];
         // maximum starts out as 1 since that is the index position that exampleArray[0] is pointing to
         int index = 0;
         // give index a starting value
         for (int i = 1; i < exampleArray.length; i++){
        	 // since we are starting i at 1 which is less than the Array length being 6, this will increment i
              if (exampleArray[ i ] > maximum) {
            	  // since i starts out as 1, exampleArray[i] is pointing at 5 in the array which is greater than the maximum which is currently 1
                   maximum = exampleArray[ i ];
                   /* maximum is then set to exampleArray[1] which is 5. This will then put us back at the beginning
                   of the for loop. Now i is 2 (which is still less than the array length) which will run
                   the for loop again. Now exampleArray[i] is pointing towards 6 in the array since i is 2. 
                   6 is greater than the maximum which is 5 which then sets maximum to 6. It will attempt the for
                   loop again, however, since now exampleArray[3] is pointing at 5 which is not greater than the
                   maximum 6, the for loop will terminate which keeps i at 2*/
                   index = i;
                   // since index is now equal to i, that is why below it prints 2
              }

         }


         
         System.out.println(index); 

		
		
         ToPower.toPower(4, 2);
         
       
       
         
         
         
         

		
	}

}
