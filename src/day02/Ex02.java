package day02;

import java.util.Scanner;

public class Ex02 { public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("당신의 이름은 무엇입니까? ");
	String name = input.next();
	final int k;
	System.out.print(name+"님의 국어 점수 : ");
	k = input.nextInt();
	System.out.print(name+"님의 영어 점수 : ");
	int e;
	e = input.nextInt();
	System.out.print(name+"님의 수학 점수 : ");
	int m;
	m = input.nextInt();
	
	System.out.println("============");
	System.out.println("이름 : "+name);
	System.out.println("============");
	System.out.println("국어 : "+k);
	System.out.println("영어 : "+e);
	System.out.println("수학 : "+m);
	System.out.println("============");
	System.out.println("합계 : "+(k+e+m));
	System.out.println("============");
}

}
