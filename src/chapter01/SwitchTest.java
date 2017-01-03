package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int month = 10;
	 int days = 0;
	  switch(month){
	  case 1 : 
	  case 3 : 
	  case 5 : 
	  case 7 : 
	  case 8 : 
	  case 10 :
	  case 12 : 
	  {
		  days = 31;
		  break;
	 }
	  case 2 : {
		  days = 29;
		  break;
	  }

	  default : {
		  days = 30;
		  break; 
	  }
	  
	   
	  }
	  System.out.println("이번달은 " + days +"일 까지입니다.");
    
	}
}




