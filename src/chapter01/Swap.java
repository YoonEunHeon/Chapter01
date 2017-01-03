package chapter01;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;
		int a = 0;
		if( n1 < n2 ){
			a = n1;
			n1 = n2;
			n2 = a;
			System.out.println("n1: "+ n1);
			System.out.println("n2: " + n2);
	     }else{
	    	 System.out.println("n1: "+ n1);
			 System.out.println("n2:" + n2);
	     }
		
		 int a1 = 20;
		 int a2 = 10;
		 int a3 = 50;
		 if(a1>=a2){
			 if(a1>=a3){
				 System.out.println("최대값은 : a1" +" "+ a1);
				 
			 }else{
				 System.out.println("최대값은: a3"+" " + a3);
			 }
		 }else{
			 if(a2>=a3){
				 System.out.println("최대값은 :a2 "+ " "+ a2 );
			 }else{
				 System.out.println("최대값은: a3 " + " " + a3);
				
			 }
		 }
	
	}
	
}
