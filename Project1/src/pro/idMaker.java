package pro;

import java.io.*;
import java.util.*;


public class idMaker {
	public static void whatisID() throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("ID가 존재하지 않습니다. 생성할 ID를 입력하세요");
		String user =  scan.next();
		FileOutputStream fos = new FileOutputStream(user+".txt");
		

		
	}

}

