package com.silsub1;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	
	public void printStar1() {
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void printStar2(){
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");

				}
				System.out.println();
			}
		} else if (num < 0) {
			for (int i = num; i < 0; i++) {
				for (int j = i; j < 0; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
	}	
	
	public void countInputCharacter(){
		
		int sum = 0;
		int num = 0;

		System.out.print("문자열 입력 : ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				num++;
			}
		}

		if (num != str.length()) {
			System.out.println("영문자가 아닙니다.");
		} else {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					sum++;
				}
			}
			System.out.println(sum + " 개");
		}

	}
	
}
