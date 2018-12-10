package ≥≤¡÷¿∫;

public class ProgTest1 {

	String iStr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	Double iDouble;
	Boolean iBool = false;
	char iChar = 'a';

	String getGugudan(int Dan) {
		String str = "";

		for (int j = 1; j <= iStr.length; j++) {
			str += (Dan + "*" + j + "=" + (Dan * j) + "\n");
		}
		return str;
	}
}
