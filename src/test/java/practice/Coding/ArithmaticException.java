package practice.Coding;

public class ArithmaticException {

	public static void main(String[] args) {

		int a = 0;

		int b = 120;

		try {
			int c = b / a;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
