package Sample1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pay = 10000;
		int cal = 3210;
		System.out.println("지불금액 :"+cal);
		System.out.println("본인금액 :"+pay);

		pay = pay-cal;
		System.out.println("거스름 :"+pay);

		int cnt=0;
		if(pay>=5000) {
			while(pay>5000) {
				pay=pay-5000;
				cnt+=1;
			}
			System.out.println("5000원 ->"+cnt );
				
		}
		if(pay>=1000) {
			cnt=0;
			while(pay>1000) {
				pay=pay-1000;
				cnt+=1;
			}
			System.out.println("1000원 ->"+cnt );

		}
		if(pay>=500) {
			cnt=0;
			while(pay>500) {
				pay=pay-500;
				cnt+=1;
			}
			System.out.println("500원 ->"+cnt );

		}
		if(pay>=100) {
			cnt=0;
			while(pay>100) {
				pay=pay-100;
				cnt+=1;
			}
			System.out.println("100원 ->"+cnt );

		}
		if(pay>=50) {
			cnt=0;
			while(pay>50) {
				pay=pay-50;
				cnt+=1;
			}
			System.out.println("50원 ->"+cnt );

		}
		if(pay>=10) {
			cnt=0;
			while(pay>10) {
				pay=pay-10;
				cnt+=1;
			}
			System.out.println("10원 ->"+cnt );

		}

	}



}

