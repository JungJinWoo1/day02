package day02;

import java.util.Scanner;

public class Ex02 { public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("����� �̸��� �����Դϱ�? ");
	String name = input.next();
	final int k;
	System.out.print(name+"���� ���� ���� : ");
	k = input.nextInt();
	System.out.print(name+"���� ���� ���� : ");
	int e;
	e = input.nextInt();
	System.out.print(name+"���� ���� ���� : ");
	int m;
	m = input.nextInt();
	
	System.out.println("============");
	System.out.println("�̸� : "+name);
	System.out.println("============");
	System.out.println("���� : "+k);
	System.out.println("���� : "+e);
	System.out.println("���� : "+m);
	System.out.println("============");
	System.out.println("�հ� : "+(k+e+m));
	System.out.println("============");
}

}
