package day_29;

import java.util.Scanner;

public class ExceptionEx02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[������]����1 �Է�: ");
		int num1 = sc.nextInt();
		
		System.out.println("[������]����2 �Է�: ");
		int num2 = sc.nextInt();
		
		if(num2 == 0)
		{
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		else
		{
			System.out.println(num1/num2);
		}
		
		System.out.println("---------------------");
		
		try		//�����߻��ϸ�, catch�� �̵�
		{
			System.out.println(num1/num2);
		}
		catch(Exception e)		//���� ó��
		{
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		finally		//������ �ɸ��� �Ȱɸ��� ������ �������� ����
		{
			System.out.println("���ܹ߻��� ������� ������ ������ ������ ���´�.");
		}
	}
}
