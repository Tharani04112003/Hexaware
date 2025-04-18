package com.Assesement;

public class Smaller {

	public static void main(String[] args) {
		 int[] arr = {10, 25, 5, 90, 45};

	        int min = arr[3];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Smallest num: " + min);
	    }
	}
