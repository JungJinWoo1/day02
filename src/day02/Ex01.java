package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	final String KOREA = "���ѹα�";
	//���� �����Ϸ��� String �տ� final �Է� �ٸ� ���� �Է��� ��� �����߻�
	System.out.println(KOREA);
	
	//import : �ش��ϴ� ����� �����´ٴ� �ǹ�
	Scanner input = new Scanner(System.in);
	System.out.print("�̸� �Է� : ");
	String name = input.next();
	//next ���ڿ� ����
	int age;
	System.out.println("���� �Է� : ");
	age = input.nextInt();
	//nextInt ���� ����
	
	System.out.println(name+"���� ���̴� "+age);

}
}
