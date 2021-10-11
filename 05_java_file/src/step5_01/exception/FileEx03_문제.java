package step5_02.file;

import java.io.FileWriter;
//# 파일 저장하기 : 연습문제1


public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		int size = names.length;// length  3
		for (int i=0; i<size; i++) {//size는 3
			data += names[i];
			data += "/";
			data += ages[i];
			if(i != size-1) {
				data += ",";
			}
		}
		System.out.println(data);
		
		FileWrite fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}

}
}