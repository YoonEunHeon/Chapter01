package chapter01;

public class VariableTest {
	int number; // 
	public void test() {
		int j = number + 10;//인스탄스 변수는 초기화가 된다.
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 20; //에러 벼수는 식별자다.
		
		int i;
		//int j = i; // 에러 지역변수는 반드시 초기화 되어야 한다.
		i = 10;
		
	    boolean isHoliday = false;
	    char c = 'A'; //리터럴
	    char c1 = 65; //값 (아스키코드)
	    byte b = 10;
	    short s = 20;
	    int k = 10;
	    long l  = 123456789;
	    float f =  3.14f;
	    double d = 3.14;
	    int j = 10;
		System.out.println(isHoliday);
		System.out.println(c + ":"+ c1);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(j);
		
		final int max_speed = 20; //final 붙이면 상수로 변경된다.
		//final이 붙은 이후에는 값 대입을 할 수 없다.
		String str = new String("Hello");
		System.out.println( str );
        
		String str1 = "Hello";
		System.out.printf( str1 );
		
	}
	

}
