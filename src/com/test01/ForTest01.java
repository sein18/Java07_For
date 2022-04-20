package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		//ForTest01.testFor();
		//ForTest01.testFor2();
		ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10 출력
		for(int i=0;i<=10;i++) {
			System.out.println("i = " + i);
		}
	}
	
	public static void testFor2() {
		//역순
		for(int i = 100;i > 0; i--) {
			System.out.print(i + " ");
			if(i%10==1) {
				System.out.println();					
			}
		}
	}
	
	public static void testFor3() {
		int i = 1;
		for( ; ; ) {
			System.out.print(i+" ");
			i++;
			if(i==10) {
				break;
			}
		}
	}
	
	public static void testFor4() {
		//정수하나를 입력 받아 그 수가 양수일때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력(1~9) : ");
		int num = sc.nextInt();
		
		if(1<=num && num<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		}
		else {
			System.out.println("반드시 1~9 사이의 양수를 입력");
		}
	 	
	}
	public static void testFor5() {
		//1~100사이의 난수를 구하고
		//1부터 구한 난수까지의 합을 출력
		int random = (int)(Math.random()*100) + 1;
		
		int sum=0;

		for(int i=1;i<=random;i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + " 까지의 합계: " + sum);
		
	}

	public static void testFor6() {
		//키보드로 정수 두개 입력
		//작은수~큰수 까지의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum=0;
		
		if (num2<num1) {
			int temp=num2;
			num2=num1;
			num1=temp;
		}
		for(int i=num1 ;i<=num2;i++) {
			sum+=i;
		}
		System.out.println(num1 + " ~ " + num2 + " 까지의 합 : "+sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
