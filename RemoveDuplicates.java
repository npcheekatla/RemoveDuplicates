package com.rackspace.core;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
	
	 public  void clearDuplicates(int[] myArray)
    {
        int arrayLength = myArray.length;
        System.out.println("Length of array : " + arrayLength);
        for (int i = 0; i < arrayLength; i++) 
        {
            for (int j = i+1; j < arrayLength; j++)
            {
                if(myArray[i] == myArray[j])
                {
                    myArray[j] = myArray[arrayLength-1];
                    arrayLength--;
                    j--;
                }
            }
        }
        int[] requiredArray = Arrays.copyOf(myArray, arrayLength);
        for (int i = 0; i < requiredArray.length; i++)
        {
        	Arrays.sort(requiredArray);
            System.out.print(requiredArray[i]);
        }
    }
     
    public static void main(String[] args) 
    {       
    	RemoveDuplicates remove = new RemoveDuplicates();
    	int n[]= {1,2,2,3,4,5,5};
    	remove.clearDuplicates(n);
         
      
    }   

}
