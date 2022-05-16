package day02;

import java.util.Scanner;

public class Quiz2 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("수 입력 : ");
	num = input.nextInt();
	String s = (num%2==0)?"짝수":"홀수";
	System.out.println(num+" = "+ s);
	s = (num%3==0)?"3의 배수다":"3의 배수가 아니다";
	System.out.println(num+" = "+ s);
	
	int su1, su2;
	System.out.print("두 수 입력 : ");
	su1 = input.nextInt();
	su2 = input.nextInt();
	s = (su1 > su2)?"su1이 크다":"su2가 크다";
	
	
	
	
	
	
}

}
