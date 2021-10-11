package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// # 파일 로드 (불러오기)

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new BufferedReader(new FileReader(new File("ex01.txt"))); 
		
		String fileName = "ex01.txt";
		File file= new File(fileName); // 파일 객체 생성
		FileReader fr= null;//파일 읽어 오기
		BufferedReader br = null; //텍스트 읽어오기
	
		if (file.exists()) {		// exists() : 파일이 존재하면 true를 반환하고
									//			  파일이 존재하지 않으면 false를 반환함.
												
		try {
			
			fr = new FileReader(file); // 파일 읽어오기
			br = new BufferedReader(fr);
			
			String data = br.readLine(); // readLine(): 텍스트 1줄을 읽어온다.
			System.out.println(data);
			
			data = br.readLine();
			System.out.println(data);
			
			br.readLine(); //readline() : 텍스트 1줄을 읽어온다.
			
			while (true) { // 전체 텍스트를 읽어오는 예시
				
				data = br.readLine();
				
				if (data == null) //  읽어올 라인이 없으면 null을 반환한다.
					break;
				
				System.out.println(data);
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//나중엔 open한 객체를 먼저 close 한다.
			try {br.close();} catch (IOException e) {e.printStackTrace();}
			try {fr.close();} catch (IOException e) {e.printStackTrace();}
			fr.close();
		}
		
	}

}
