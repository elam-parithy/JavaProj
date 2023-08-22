package arrays;

public class TraversingArrays {
	public static void main(String args[]) {

		int a[] = new int[5];

		for (int var : a) {
			System.out.println(var);
		}

		// ==============================

		int b[][] = new int[2][3];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
