package com.gl.drivers;

import java.util.Scanner;

import com.gl.services.BalancingBrackets;

public class BalancedBracketsDriver {

	public static void main(String[] args) {	
		BalancingBrackets object = new BalancingBrackets();
		System.out.println("Enter Balanced Brackets");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (object.isBalancedBrackets(str)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		sc.close();
	}

}
