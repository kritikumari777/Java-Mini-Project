package apchopoi;

import java.io.*;

public class Democvs {

	public static void main(String[] args) throws Exception {
		String fname = "D:\\abc.txt";
		FileReader fs = new FileReader(fname);
		String fname2 = "D:\\abc1.txt";
		FileWriter ws = new FileWriter(fname2);
		BufferedReader bf = new BufferedReader(fs);
		BufferedWriter bw = new BufferedWriter(ws);
		String s1 = "";
		while ((s1 = bf.readLine()) != null) {
			int sum = 0;
			bw.write(s1);
			bw.newLine();

		}
		bw.close();
		bf.close();
		System.out.println("process over");
	}

}
