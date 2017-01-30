package tm;

public class BubbleSorterTest {

	public static void main(String[] args) {
		int[] array = {1, 10, 9, 3, 1000, 23, 42432 , 4};

		BubbleSorter.sort(array);
		
		System.out.println(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
