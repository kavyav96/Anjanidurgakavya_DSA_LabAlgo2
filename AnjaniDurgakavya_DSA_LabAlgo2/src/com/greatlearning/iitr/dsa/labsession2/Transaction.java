package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class Transaction

{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the values");

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}

		System.out.println("Enter the total no of targets that needs to be achieved");

		int n1 = sc.nextInt();

		int value;

		int sum = arr[0];

		for (int i = 0; i < n1; i++) {

			System.out.println("Enter the value of target");

			value = sc.nextInt();

			if (value <= sum) {

				System.out.println("Target achieved after " + (i + 1) + " transactions");

			}

			else {

				sum = arr[i] + arr[i + 1];

			}

		}

	}

}