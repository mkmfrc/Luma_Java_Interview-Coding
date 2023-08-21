package practice.Coding;

public class NullPointException {

	public static void main(String[] args) {

		String name = null;

		try {
			if (name.equals("Emran")) {
				System.out.println("Name found : ");
			} else {
				System.out.println("Name not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
