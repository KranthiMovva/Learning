package mock_1;

public class Prime10 {

	public static void main(String[] args) {
		// int sum;
		System.out.println(sop());
	}

	public static int sop() {

		int count = 0;
		int sum = 0;
		int cop = 0;
		int res = 0;
		for (int i = 1; i <= 50; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2)

			{
				cop++;
				sum = sum + i;
				if (cop == 10) {
					res = sum;

				}
			}
		}
		return res;
	}
}
