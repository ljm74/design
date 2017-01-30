package tm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtocTemplateMethod extends Application {

	public static void main(String[] args) throws Exception {
		new FtocTemplateMethod().run();
	}

	private InputStreamReader isr;
	private BufferedReader br;

	@Override
	protected void init() {
		this.isr = new InputStreamReader(System.in);
		this.br = new BufferedReader(this.isr);
	}

	@Override
	protected void idle() {

		String fahrString = readLineAndReturnNullIfError();
		if (fahrString == null || fahrString.length() == 0) {
			setDone();
		} else {
			double fahr = Double.parseDouble(fahrString);
			double celcius = 5.0 / 9.0 * (fahr - 32);
			System.out.println("F=" + fahr + ", C=" + celcius);
		}

	}

	private String readLineAndReturnNullIfError() {
		String s;
		try {
			s = this.br.readLine();
		} catch (IOException e) {
			s = null;
		}
		return s;
	}

	@Override
	protected void cleanup() {
		System.out.println("Ftoc exit!");
	}

}
