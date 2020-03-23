package day_29;

import java.util.Scanner;

public class ExceptionEx02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[나눗셈]숫자1 입력: ");
		int num1 = sc.nextInt();
		
		System.out.println("[나눗셈]숫자2 입력: ");
		int num2 = sc.nextInt();
		
		if(num2 == 0)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else
		{
			System.out.println(num1/num2);
		}
		
		System.out.println("---------------------");
		
		try		//에러발생하면, catch로 이동
		{
			System.out.println(num1/num2);
		}
		catch(Exception e)		//에러 처리
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally		//에러가 걸리든 안걸리든 무조건 지나가는 영역
		{
			System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
		}
	}
}
