package day02;

import java.util.Scanner;

public class Ex04 {public static void main(String[] args) {
	/*
	 ��� : ���α׷��� �帧�� �����Ѵ�
	 if, switch, for, while, do while
	 */
	Scanner input = new Scanner(System.in);
			int num;
			
			System.out.println("1.�������");
			System.out.println("2.��������");
			System.out.println("3.����");
	System.out.println(">>> : ");
	num = input.nextInt();
	if(num == 1) 
		System.out.println("������� ����");
	
		if(num == 2) 
			System.out.println("�������� ����");
		
			if(num == 3) 
               System.out.println("���� ����");
}
}
