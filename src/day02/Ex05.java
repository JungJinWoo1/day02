package day02;

public class Ex05 
{public static void main(String[] args) {
	int num = 1;
	if(num%2 == 0) {
		System.out.println("¦��");
		}
	if(num%2 != 0) {
		System.out.println("Ȧ��");
		}
	
	
	if(num < 10) //�ش� ������ ���̸� �Ʒ� ������ ��µȴ�
	{
		System.out.println("1.num 10���� �۴�"); //<=if���� ���� ���� (������ ���̾�߸� �����)
	System.out.println("2.num 10���� �۴�"); //���� ������ �ƴ� ����� {  } �̿��Ͽ� ����
	System.out.println("3.num 10���� �۴�");
	}
	System.out.println("���� ����� ����"); //if���� ���ϰ�� ���� ���� ��� �� ��µ�, ������ ��� ���� ��µ�
	
}

}
