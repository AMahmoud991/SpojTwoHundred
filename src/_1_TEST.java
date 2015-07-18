import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//http://www.spoj.com/problems/TEST/
//TEST - Life, the Universe, and Everything

public class _1_TEST {

	public static void main(String[] args) {

		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String input;

			input = bufferRead.readLine();
			while (!input.equals("42")) {
				System.out.println(input);
				input = bufferRead.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
