package day02;

import java.util.Scanner;

public class Qz22 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int anum, bnum,knum;
	System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
	anum = sc.nextInt();
	System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
	bnum = sc.nextInt();
	System.out.println("��Ģ������ ���ÿ� 1. + 2. - 3. * 4. / : ");
	knum = sc.nextInt();
	if (knum == 1) {
		System.out.println(" + ");
	    System.out.println("��� : "(anum+bnum));
	}
	if (knum == 2) {
		System.out.println(" - ");
		System.out.println(anum-bnum);
	}
	if (knum == 3) {
		System.out.println(" * ");
		System.out.println(anum*bnum);
	}
	if (knum == 4) {
		System.out.println(" / ");
		System.out.println(anum/bnum);
	}
	
}
	/*
	 * 
	 * ���� 2���� �Է¹ް�
	 * ��ȣ�� ����
	 * ����Ͻÿ�.
	 * 
	 * ù��° ���� �Է� : (�Է�)
	 * �ι�° ���� �Է� : (�Է�)
	 * ��ȣ�� ���ÿ�. 1. + 2. - 3. * 4./
	 * if(1)
	 * ù��° ���� + �ι�° ����
	 * ��� ���
	 */
	

}
