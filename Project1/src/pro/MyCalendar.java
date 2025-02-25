package pro;
import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar  {
	 public static void printcalendar(String userID) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("년도와 월을 입력하세요");
	int year = scan.nextInt();
	int mon = scan.nextInt();
	Calendar cal = Calendar.getInstance();
	int i=1;
	cal.set(year, (mon-1),i);
	
	
	System.out.printf("	                     %4d년 %d월\n",year,mon);
	System.out.println("\t일\t월\t화\t수\t목\t금\t토");
	
	for(int j=1;j<= cal.get(Calendar.DAY_OF_WEEK);j++){
		System.out.print("\t");
	}
	System.out.print(1);
	if(cal.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
	cal.set(year, (mon-1),++i);
	int max=cal.getActualMaximum(Calendar.DATE);
	
		for(int k=2;k<=max;k++) {
			System.out.print("\t"+cal.get(Calendar.DATE));
			if(cal.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
			
			cal.set(year, (mon-1),++i);
		}
		System.out.println();
}
}
