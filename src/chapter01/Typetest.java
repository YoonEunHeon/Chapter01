package chapter01;

public class Typetest {
	public static void main(String[] args){
		//암시적 (implicity) casting
		int i1 = 9999;
		long l1 =  i1; // 명시하지않아도된다 이유는 l1은 8바이트 integer는 4바이트
		
		//명시적 
		long l2 = 12345678;
		int i2 = (int)l2; //데이터가 손실될수있을거같은데 괜찮겠니? 물어본당 
		
		System.out.println(l1 + "|" + i1 );
		System.out.println(l2 + "|" + i2);
		
		 
		
		
		
	}
}
