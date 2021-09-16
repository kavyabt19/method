package method;

public class NumberPredictor {

	public static void array(int arr[]) {
		for (int i = 0; i <= arr.length; i++)
			if (arr[i] % 2 == 0) {

				System.out.println("Even number are " + arr[i]);
			} else {
				System.out.println("Not an even number " + arr[i]);
			}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 15, 25, 35, 46, 57, 69, 71, 83, 90, 99 };
		NumberPredictor.array(arr);

	}

}
