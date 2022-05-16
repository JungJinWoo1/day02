package day02;

public class Ex05 
{public static void main(String[] args) {
	int num = 1;
	if(num%2 == 0) {
		System.out.println("짝수");
		}
	if(num%2 != 0) {
		System.out.println("홀수");
		}
	
	
	if(num < 10) //해당 내용이 참이면 아래 내용이 출력된다
	{
		System.out.println("1.num 10보다 작다"); //<=if문의 종속 문장 (조건이 참이어야만 실행됨)
	System.out.println("2.num 10보다 작다"); //종속 문장이 아닌 문장들 {  } 이용하여 변경
	System.out.println("3.num 10보다 작다");
	}
	System.out.println("다음 문장들 실행"); //if문이 참일경우 종속 문장 출력 후 출력됨, 거짓일 경우 이후 출력됨
	
}

}
