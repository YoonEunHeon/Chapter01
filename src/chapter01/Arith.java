package chapter01;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	   
		a = a + 1;
		System.out.println( a );
	
		a +=  1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
	    a++;
	    
		a--; // a=a-1;
		System.out.println(a);
		 
		--a; // a-=1;
		System.out.println(a);
	 
		//System.out.println(a);
		a++;
		System.out.println(a);
		
		//나누기
		System.out.println(10/3); //2개의 int형의 사칙연산의 결과는 int
		System.out.println(10. / 3.); // 2개의 double형의 사칙연산결과는 double
		
	   //주의
		System.out.println( (double)10/ 3 );
		System.out.println( (double)(10/ 3) );
		
		System.out.println( a  % b);
		System.out.println( 44 % 3);
		System.out.println( -7 % 3);
		System.out.println( -7 % -3);
		System.out.println( 7 % -3);
		
	    
	}
  }
