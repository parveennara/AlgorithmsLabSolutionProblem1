package com.greatlearning.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTarget(int[] transactions, int noOfTargets) {
		
		Scanner sc = new Scanner(System.in);
		
		while(noOfTargets != 0){
			
			long target;
			boolean targetReached = false;
			
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			
			long transactionAmount = 0;
			
			for(int i=0; i<transactions.length; i++) {
				
				transactionAmount += transactions[i];
				
				if (transactionAmount >= target) {
					
					System.out.println("Target achieved after " + (i+1) + " transactions");
					targetReached = true;
					break;
				}
			}
			
			if (!targetReached) {
				
				System.out.println("Given target is not achieved");
			}
			
			noOfTargets--;			
		}
		
		System.out.println("You are done with your work");
		sc.close();
		
	}

}
