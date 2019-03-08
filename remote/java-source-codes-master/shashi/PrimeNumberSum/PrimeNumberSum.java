package com.learn.java;

public class PrimeNumberSum {
	public static void main(String[] args) {
		 int end = 200;
	        int count = 0;
	        long sum = 0;

	        for (int number = 100; number<=end; number++) {		//good job, but maybe improved slightly if we change it a bit
	            if (isPrim(number)) {
	            	if(number%10==7 || number%10==3) {
	               sum += number;
	               count++; 
	            	}
	            }
	            
	        }
	        System.out.println(count);
	        System.out.println(sum);
	    }

	    public static boolean isPrim(int number){
	        for (int i=2; i*i<=number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true; 
	}

}
