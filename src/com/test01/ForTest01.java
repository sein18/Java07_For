package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		//ForTest01.testFor();
		//ForTest01.testFor2();
		ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10 ���
		for(int i=0;i<=10;i++) {
			System.out.println("i = " + i);
		}
	}
	
	public static void testFor2() {
		//����
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
		//�����ϳ��� �Է� �޾� �� ���� ����϶��� �� ���� �������� ���
		//����� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�(1~9) : ");
		int num = sc.nextInt();
		
		if(1<=num && num<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		}
		else {
			System.out.println("�ݵ�� 1~9 ������ ����� �Է�");
		}
	 	
	}
	public static void testFor5() {
		//1~100������ ������ ���ϰ�
		//1���� ���� ���������� ���� ���
		int random = (int)(Math.random()*100) + 1;
		
		int sum=0;

		for(int i=1;i<=random;i++) {
			sum += i;
		}
		System.out.println("1���� " + random + " ������ �հ�: " + sum);
		
	}

	public static void testFor6() {
		//Ű����� ���� �ΰ� �Է�
		//������~ū�� ������ ��
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
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
		System.out.println(num1 + " ~ " + num2 + " ������ �� : "+sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
