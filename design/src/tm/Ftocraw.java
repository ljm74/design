package tm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// --------------------------------
// 
// 화씨온도를 썹씨온도로 변환하는 프로그램
//
class Ftocraw {

	public static void main(String[] args) throws Exception {

		// 초기화
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		boolean done = false;

		// 메인 루프
		while (!done) {
			String fahrString = br.readLine();
			if (fahrString == null || fahrString.length() == 0) {
				done = true;
			} else {
				double fahr = Double.parseDouble(fahrString);
				double celcius = 5.0 / 9.0 * (fahr - 32);
				System.out.println("F=" + fahr + ", C=" + celcius);
			}
		}

		// 청소
		System.out.println("Ftoc exit!");

	}

}
