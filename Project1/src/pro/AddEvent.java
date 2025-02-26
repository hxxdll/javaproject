package pro;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AddEvent {
	static void addEvent(String userID) throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner (System.in);
		System.out.print("이벤트 제목을 입력하세요>>");
		String title = scan.next();
		
		scan.nextLine(); 
		Date startday =null;
		while(true) {
			System.out.print("이벤트 시작 시간을 입력하세요 (yyyy/MM/dd HH:mm:ss)>>");
			SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd");
			String StartDate = scan.nextLine();
			try {
				startday=sf2.parse(StartDate);
				break;
				
			} catch (ParseException e) {
				System.out.println("날짜의 형식이 올바르지 않습니다.");
			}
			
		}
		 
		Date lastday =null;
		while(true) {
			System.out.print("이벤트 종료 시간을 입력하세요 (yyyy/MM/dd HH:mm:ss)>>");
			SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd");
			String lastDate = scan.nextLine();
			try {
				lastday=sf2.parse(lastDate);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.print("세부사항을 입력하세요>>");
		String detail = scan.next();
		
		///////////////////////////////////////////////////////////////////////
		
		Map<String, Event> eventList = new HashMap<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userID + ".txt"))) {
		    while (true) {
		        try {
		            Map<String, Event> temp = (Map<String, Event>) ois.readObject();
		            System.out.println(temp);
		            eventList.putAll(temp);  // 기존 eventList에 추가
		        } catch (EOFException e) {  // 파일 끝나면 반복문 종료
		            break;
		        }
		    }
		} catch (IOException | ClassNotFoundException e) {
		    e.printStackTrace();
		}
		
		Event evl = new Event(title,startday,lastday,detail);
		eventList.put(evl.title, evl);
		
		FileOutputStream fos = new FileOutputStream(userID+".txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("추가: "+eventList);
		oos.writeObject(eventList); 
		
         
		
	}
}

class Event implements Serializable {
	private static final long serialVersionUID = 1L;
	String title,detail;
	Date lastday,startday;
	Event(String title, Date startday, Date lastday, String detail){
		this.title=title;
		this.startday=startday;
		this.lastday=lastday;
		this.detail=detail;
	}
	
	   public String toString() {
	        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        return "이벤트 제목: " + title +
	               "\n시작 시간: " + sf.format(startday) +
	               "\n종료 시간: " + sf.format(lastday) +
	               "\n세부사항: " + detail;
	    }
}
