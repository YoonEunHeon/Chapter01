package chapter01;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10 ){
			if (i> 5){
				i++;//이문장이 없으면 무한 루프
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
