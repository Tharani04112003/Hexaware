package com.Assesement;

public class Greater {

	public static void main(String[] args) {
		   int[] numbers = {23, 45, 67, 12, 89, 34};  

	        int max = numbers[0]; 

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i]; 
	            }
	        }

	        System.out.println( max);
	    }
	

	}


