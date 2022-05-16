package day02;

import java.util.Scanner;

public class Qz22 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int anum, bnum,knum;
	System.out.print("첫번째 숫자를 입력하시오 : ");
	anum = sc.nextInt();
	System.out.print("두번째 숫자를 입력하시오 : ");
	bnum = sc.nextInt();
	System.out.println("사칙연산을 고르시오 1. + 2. - 3. * 4. / : ");
	knum = sc.nextInt();
	if (knum == 1) {
		System.out.println(" + ");
	    System.out.println("결과 : "(anum+bnum));
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
	 * 숫자 2개를 입력받고
	 * 기호를 골라ㅣ
	 * 계산하시오.
	 * 
	 * 첫번째 숫자 입력 : (입력)
	 * 두번째 숫자 입력 : (입력)
	 * 기호를 고르시오. 1. + 2. - 3. * 4./
	 * if(1)
	 * 첫번째 숫자 + 두번째 숫자
	 * 결과 출력
	 */
	

}
