package Car;

import java.util.Scanner;



public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Client client = new Client();
		int menu = 0;
		int menu2 = 0;
		
		
		System.out.println("서현형재 중고차 사이트에 오신걸 환영합니다.");
		System.out.println("================================");
		System.out.println("        1.판매자       2.구매자              ");
		System.out.println("================================");
		System.out.print("메뉴선택 >> ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			
			
			switch(menu2) {
			case 1:
				// 판매자 차량등록
			System.out.println("");
				
				break;
			case 2:
				// 판매자 차량이 잘 등록이 되었는지 확인
			
				break;
			}
			
			
			
			break;
		
		case 2:
			break;
		
		}
	
	
	}

}
