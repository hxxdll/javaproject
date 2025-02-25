package pro;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EventCheck {
   public static void eventCheck(String userID) throws IOException, ClassNotFoundException {
      try {
    	 File file = new File(userID+".txt");
         Map<String , Event> eventList = null;
         FileInputStream fi = new FileInputStream(file);
         try (ObjectInputStream ois = new ObjectInputStream(fi)) {
             while (true) {
                 try {
                	 eventList = (Map<String, Event>) ois.readObject();
                     //eventList.putAll(temp);  // 기존 eventList에 추가
                 } catch (EOFException e) {  // 파일 끝나면 반복문 종료
                     break;
                 }
             }
         } catch (IOException | ClassNotFoundException e) {
             e.printStackTrace();
         }
         
         Scanner scan = new Scanner (System.in);
         Date day = null;
         while(true) {
            System.out.println("조회할 이벤트 날짜를 입력하시오>>");
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
         
         
         for(Event s :eventList.values()) {
            //Event ev =eventList.get(s);
//            if(ev.startday.equals(day)) {
               System.out.println("[제목]:"+s.title);
               System.out.println("[기간]: "+s.startday+"~"+s.lastday);
               System.out.println("[세부사항]:"+s.detail);
               cnt++;
            }
      //   }
         if(cnt==0)System.out.println("해당 날짜에 이벤트가 없습니다.");

      }catch(Exception e) {
         System.out.println("조회할 일정이 없습니다.");
      }
      
   }
   
}
