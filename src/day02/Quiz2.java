package day02;

import java.util.Scanner;

public class Quiz2 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("�� �Է� : ");
	num = input.nextInt();
	String s = (num%2==0)?"¦��":"Ȧ��";
	System.out.println(num+" = "+ s);
	s = (num%3==0)?"3�� �����":"3�� ����� �ƴϴ�";
	System.out.println(num+" = "+ s);
	
	int su1, su2;
	System.out.print("�� �� �Է� : ");
	su1 = input.nextInt();
	su2 = input.nextInt();
	s = (su1 > su2)?"su1�� ũ��":"su2�� ũ��";
	
	
	
	
	
	
}

}
