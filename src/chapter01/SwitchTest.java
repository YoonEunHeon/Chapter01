package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int month = 10;
	 int days = 0;
	 
	 if(month == 1 || 
	    month ==3  ||
	    month == 5 || 
	    month == 7 || 
	    month == 8 || 
	    month ==10 || 
	    month ==12){
		 days = 31;		 
	 }else if ( month ==2){
		 days = 28;
	 }else if (month == 3) {
		 days = 31;
	 }else if (month == 4) {
		 days = 30;
	 }else if (month == 5) {
		 days = 31;
	 }else if (month == 6) {
		 days = 30;
	 }else if (month == 7) {
		 days = 31;
	 }else if (month == 8) {
		 days = 31;
	 }else if (month == 9) {
		 days = 30;
	 }else if (month == 10) {
		 days = 31;
	 }else if (month == 11) {
		 days = 30;
	 }else if (month == 12) {
		 days = 31;
	 }else {
		 days = 0;
	 }
	}

}
