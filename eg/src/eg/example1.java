package eg;

public class example1 {

	public static void main(String[] args) {
		
		for (int i=0; i<14; i++) {
		System.out.println(bunnyEars(i));
		}
	}

	public static int bunnyEars(int input) {
		if (input == 0)
			return 0;
		else if (input == 1)
			return 2;
		else return bunnyEars(input - 2);
	}
}

