package JDBC0615;

import java.util.Scanner;

public class TDateMain {

	public static void main(String[] args) {
		TDate tdate = new TDate();
		TDateSQL sql = new TDateSQL();
		
		Scanner sc = new Scanner(System.in);
		
		sql.connect();
		
		System.out.println("년도>>");
		String year = sc.next();
		System.out.println("월>>");
		String month = sc.next();
		System.out.println("일>>");
		String day = sc.next();
		
		String sumdate = year+month+day;
		System.out.println(sumdate);
		tdate.setToday(sumdate);
		
		sql.testDate(tdate);
		
    
	}

}
