package com.example;

import java.math.BigInteger;

public class LCMAndLookAndSay {
	
	public static void main(String[] args) {
		System.out.println(lcmOfArray(new int[] {5, 4, 6, 46, 54, 12, 13, 17}));
		System.out.println(lcmOfArray(new int[] {46, 54, 466, 544}));
		System.out.println(lcmOfArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		System.out.println(lcmOfArray(new int[] {13, 6, 17, 18, 19, 20, 37}));
		
		System.out.println(lookAndSay(new BigInteger("3132")));
		System.out.println(lookAndSay(new BigInteger("1213200012171979")));
		System.out.println(lookAndSay(new BigInteger("54544666")));
		System.out.println(lookAndSay(new BigInteger("95")));
		System.out.println(lookAndSay(new BigInteger("1213141516171819")));
		System.out.println(lookAndSay(new BigInteger("120520")));
		System.out.println(lookAndSay(new BigInteger("231")));
	}
	
	//function for greatest common divisor, used by problem 1
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		
		return gcd(y, x % y);
	}
	
	//function for least common divisor of two integers, used by problem 1
	public static int lcm(int x, int y) {
		if (x == 0 && y == 0) {
			return 0;
		}
		
		return (Math.abs(x*y))/gcd(x, y);
	}
	
	//Problem 1: Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).
	public static int lcmOfArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		
		int currentLcm = lcm(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			currentLcm = lcm(nums[i], currentLcm);
		}
		
		return currentLcm;
	}
	
	//Problem 2: Given an integer value, return a new integer according to the rules below:
	//Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
	//For each group of two digit numbers, concatenate the last digit to a new string the same number of times as the value of the first digit.
	//Return the result as an integer.
	public static BigInteger lookAndSay(BigInteger x) {
		String s = x.toString();
		if (s.length()%2 == 1) {
			return BigInteger.valueOf(-1);
		}
		
		String concat = "";
		
		for (int i = 0; i < s.length(); i=i+2) {
			for (int j = 0; j < (s.charAt(i) - '0'); j++) {
				concat += s.charAt(i+1);
			}
		}
		
		return new BigInteger(concat);
	}
	
}
