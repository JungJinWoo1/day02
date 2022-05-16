package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	final String KOREA = "대한민국";
	//값을 고정하려면 String 앞에 final 입력 다른 값을 입력할 경우 오류발생
	System.out.println(KOREA);
	
	//import : 해당하는 기능을 가져온다는 의미
	Scanner input = new Scanner(System.in);
	System.out.print("이름 입력 : ");
	String name = input.next();
	//next 문자열 저장
	int age;
	System.out.println("나이 입력 : ");
	age = input.nextInt();
	//nextInt 정수 저장
	
	System.out.println(name+"님의 나이는 "+age);

}
}
