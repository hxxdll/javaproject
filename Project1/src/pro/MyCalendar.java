 package pro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
 import java.util.Scanner;
 
 public class MyCalendar implements Serializable{
      public static void printcalendar(String userID) throws IOException {
         Map<String, Event> searchevnet = null;
         Scanner scan1 = new Scanner(System.in);
         File file = new File(userID+".txt");
         SimpleDateFormat df = new SimpleDateFormat("dd");
         
         System.out.println("년도와 월을 입력하세요");
         int year1 = scan1.nextInt();
         int mon1 = scan1.nextInt();
         Calendar cal1 = Calendar.getInstance();
         int i1=1;
         String ckday = null;
         int ckdaycnt=0;
         cal1.set(year1, (mon1-1),i1);
         
         //파일에 내용이 존재하지않으면
         if(file.length() < 0) {
            System.out.printf("                        %4d년 %d월\n",year1,mon1);
            System.out.println("\t일\t월\t화\t수\t목\t금\t토");
            
            for(int j=1;j<= cal1.get(Calendar.DAY_OF_WEEK);j++){
               System.out.print("\t");
            }
            System.out.print(1);
            if(cal1.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
            cal1.set(year1, (mon1-1),++i1);
            int max1=cal1.getActualMaximum(Calendar.DATE);
            
               for(int k=2;k<=max1;k++) {
                  System.out.print("\t"+cal1.get(Calendar.DATE));
                  if(cal1.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
                  
                  cal1.set(year1, (mon1-1),++i1);
               }
               System.out.println();
         }
         System.out.println();
         //파일에 내용이 존재
         if(file.length() > 0) {
            //System.out.println("파일에 내용이 존재");
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fi);
            try {
               searchevnet = (Map<String, Event>)ois.readObject();
               if(searchevnet != null) {
                  for(Event v : searchevnet.values()) {
                     ckday = df.format(v.startday);
                     if(ckday != null) {
                        ckdaycnt++;
                     }
                  }
               }
               
            } catch (ClassNotFoundException e) {
               e.printStackTrace();
            } catch (IOException e) {
               e.printStackTrace();
            }
            fi.close();
            ois.close();
            
            System.out.printf("                        %4d년 %d월\n",year1,mon1);
            System.out.println("\t일\t월\t화\t수\t목\t금\t토");
            
            for(int j=1;j<= cal1.get(Calendar.DAY_OF_WEEK);j++){
               System.out.print("\t");
            }
            System.out.print(1);
            if(cal1.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
            cal1.set(year1, (mon1-1),++i1);
            int max1=cal1.getActualMaximum(Calendar.DATE);
            
               for(int k1=2;k1<=max1;k1++) {
                  System.out.print("\t"+cal1.get(Calendar.DATE));
                  if(k1 == Integer.parseInt(ckday)) {
                     System.out.print("("+ ckdaycnt + ")");
                  }
                  if(cal1.get(Calendar.DAY_OF_WEEK)==7) System.out.println();
                  cal1.set(year1, (mon1-1),++i1);
               }
               System.out.println();
         }
         
      
         }
      }
 