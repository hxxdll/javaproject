package pro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.Scanner;

public class AddEvent{
	static void addEvent(String userID) throws IOException {
		Scanner scan = new Scanner (System.in);
		System.out.print("이벤트 제목을 입력하세요>>");
		String title = scan.next();
		scan.nextLine(); 
		System.out.print("이벤트 시작 시간을 입력하세요 (yyyy/MM/dd HH:mm:ss)>>");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String StartDate = scan.nextLine();
		Date startday =null;
		try {
			startday=sf2.parse(StartDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.print("이벤트 종료 시간을 입력하세요 (yyyy/MM/dd HH:mm:ss)>>");
		String lastDate = scan.nextLine();
		Date lastday =null;
		try {
			lastday=sf2.parse(lastDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.print("세부사항을 입력하세요>>");
		String detail = scan.next();
		
		Map<String, Event> eventList = new HashMap<>();
		Event evl = new Event(title,startday,lastday,detail);
		eventList.put(title, evl);
		
		OutputStream fos = new FileOutputStream(userID+".txt",true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//OutputStreamWriter writer = new OutputStreamWriter(oos,"UTF-8");
		oos.writeObject(eventList); 
		
//		ObjectInputStream  fis = new ObjectInputStream (userID+".txt");
//		int data =0;
//		byte[] buf = new byte[fis.available()];
//		while((data= fis.read(buf))!=-1) {
//			System.out.print((char)data);
//		}
	}
}

class Event implements Serializable {
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