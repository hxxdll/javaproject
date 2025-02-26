package pro;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class SystemMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner (System.in);
		int input =0;
		System.out.println("아이디를 입력하세요.");
		String userID= scan.next();
		File file = new File(userID + ".txt"); 
		if(! file.exists()) idMaker.whatisID();
		
		
		while (input!=1) {
		try {
			System.out.print("메뉴 번호를 선택하시오 (1.종료,2.달력조회,3.이벤트추가,4.이벤트조회,5.이벤트변경,6.이벤트삭제)>>");
			input=scan.nextInt();
			
			switch (input) {
			case 1 : System.out.println("시스템을 종료합니다"); break;
			case 2 :  MyCalendar.printcalendar(userID);	break;
			case 3 : AddEvent.addEvent(userID); break;
			case 4 : EventCheck.eventCheck(userID);	break;
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
