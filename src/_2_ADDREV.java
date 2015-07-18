import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//http://www.spoj.com/problems/ADDREV/
//ADDREV - Adding Reversed Numbers

public class _2_ADDREV {

	public static void main(String[] args) {

		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

			int counter = Integer.parseInt(bufferRead.readLine());
			String[] values;
			while (counter > 0) {
				values = (bufferRead.readLine()).split(" ");
				int firstValues = Integer.parseInt(new StringBuilder(values[0]).reverse().toString());
				int secondValues = Integer.parseInt(new StringBuilder(values[1]).reverse().toString());
				int sum = firstValues + secondValues;
				System.out.println(Integer.parseInt(new StringBuilder(sum + "").reverse().toString()+""));
				counter--;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
