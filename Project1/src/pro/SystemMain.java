package pro;

import java.util.*;
public class SystemMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int input =0;
		while (input!=1) {
		try {
			System.out.print("메뉴 번호를 선택하시오 (1.종료,2.달력조회,3.이벤트추가,4.이벤트조회,5.이벤트변경,6.이벤트삭제)>>");
			input=scan.nextInt();
			
			switch (input) {
			case 1 : System.out.println("시스템을 종료합니다"); break;
			case 2 :  MyCalendar.printcalendar();	break;
			case 3 : 	break;
			case 4 : 	break;
			case 5 : 	break;
			case 6 : 	break;
			default : System.out.println("올바른 숫자를 입력하세요.");
			}
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력하세요");
			scan.next();
		}
		}
		
		
	}

}
