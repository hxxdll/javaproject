package pro;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeleteEvent {

	   public static void deleteEvent(String userID) throws ClassNotFoundException, FileNotFoundException, IOException {
		   
		   try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userID + ".txt"))) {
				Map<String , Event> eventList = new HashMap<>();
			    while (true) {
			        try {
			            Map<String, Event> temp = (Map<String, Event>) ois.readObject();
			            eventList.putAll(temp);  // 기존 eventList에 추가
			        } catch (EOFException e) {  // 파일 끝나면 반복문 종료
			            break;
			        }
			    }
			
			
			Scanner scan = new Scanner (System.in);
			Date day = null;
			while(true) {
				System.out.println("삭제할 이벤트 날짜를 입력하시오(yyyy/MM/dd)>>");
				String date = scan.nextLine();
				SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
				try {
					day= f.parse(date);
					break;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					System.out.println("날짜의 형식이 올바르지 않습니다.");
				}
			}
			int cnt=0;
			List<Event> list = new ArrayList<Event>();
			for(String s :eventList.keySet()) {
				list.add(eventList.get(s));
				cnt++;
			}
			
			if(cnt==0)System.out.println("해당 날짜에 이벤트가 없습니다.");
			else {
				for(int i=0; i<cnt; i++) {
					if(list.get(i).startday.equals(day)) {
					System.out.println("번호:"+(i+1)+"=>");
					System.out.println("[제목]:"+list.get(i).title);
					System.out.println("[기간]: "+list.get(i).getStartday()+"~"+list.get(i).getLastday());
					System.out.println("[세부사항]:"+list.get(i).detail);
					}
			}
			}
			
			
			
				System.out.print("삭제할 번호를 선택하세요");
				int n = scan.nextInt(); 
				System.out.println("삭제 내용 확인:");
				System.out.println("[제목]:"+list.get(n-1).title);
				System.out.println("[기간]: "+list.get(n-1).getStartday()+"~"+list.get(n-1).getLastday());
				System.out.println("[세부사항]:"+list.get(n-1).detail);
				

				while(true) {
					System.out.print("삭제할 이벤트가 맞습니까? 변경하실려면 Y를 입력하세요");
					char a = scan.next().charAt(0);
					
				if(a=='Y'||a=='y') {
					System.out.println("[제목]:"+list.get(n-1).title);
					System.out.println("[기간]: "+list.get(n-1).getStartday()+"~"+list.get(n-1).getLastday());
					System.out.print("[세부사항]:"+list.get(n-1).detail);
					System.out.println("   => 내용삭제완료");
					list.remove(n-1);
					break;
				}
				}
	/////////////////////////////////////////////////////////////////////////////////////		

				eventList.clear();
				 for(int i=0; i<list.size(); i++) {
					 eventList.put(list.get(i).title, list.get(i));
				 }
				 
				 FileOutputStream fos = new FileOutputStream(userID+".txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					
					oos.writeObject(eventList); 
					System.out.println("이벤트 삭제 저장 완료");
				
			}
			
			  catch (  ClassNotFoundException | EOFException e) {
			    System.out.println("조회 할 일정이 없습니다.");
			}
		
	   }

}
