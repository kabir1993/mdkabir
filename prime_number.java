package pSolve;

public class prime_number {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Boolean flag = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {

			for (int i = 2; i <= num/2; ++i) {
				if(num%i==0) {
				flag = true;
				break;
				}
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime number");
		}
		else
			System.out.println(num + " is not a prime number");
	}
		

	}

}
