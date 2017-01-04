package chapter01;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true){
			System.out.print("숫자 입력 [0toQuit)");
			int value = scanner.nextInt();
			if(value == 0){
				System.out.println("끝");
				break;
			}
			 sum += value;
	    }
		System.out.println(sum);
	    scanner.close();

	}

}
