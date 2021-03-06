package step5_02.file;


import java.io.FileWriter;
import java.io.IOException;

// 파일 입력 ( File Input ) 

public class FileEx01 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		String fileName = "ex01.txt";
		
		try { // 파일 입출력은 try, catch 구문 없이 사용하지 못하도록 강제성을 부여해 놓았다. 
				fw = new FileWriter(fileName); // 파일을 생성하는 기능의 객체 생성
		
				// write메서드를 통해서 파일에 데이터 입력이 가능하다.
				
				fw.write("파일 저장하기 연습문제1\n"); // 1) 문자열 데이터 형식만 입력이 가능하다
				fw.write("파일 저장하기 연습문제2\n"); // 2) 개행기능이 없기 때문에 \n을 의도적으로 작성한다.
				
				String data = "파일 저장하기 연습문제3\n";
				       data+= "파일 저장하기 연습문제4\n";
					   data+= "파일 저장하기 연슴문제5\n";
				fw.write(data); // 3)write 메서드를 여러번 사용하지 않고
								// 데이터를 +=연산자를 이용하여 미리 만드어 놓고
								// 한번만 write 메서드를 사용하는 것을 권장함.
				
		// 에러가 났음
		fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//파일 객체 종료 [중요]
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
}
