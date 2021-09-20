package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.TransactionService;

public class Main {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		
		int[] transactions = new int[size];
		
		System.out.println("Enter the values of array");
		for(int i=0; i<size; i++) {
			transactions[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
						
		TransactionService ts = new TransactionService();
		
		ts.checkTarget(transactions, noOfTargets);
		
		sc.close();
		
	}
		
}
