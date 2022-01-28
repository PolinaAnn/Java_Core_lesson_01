package ua.lviv.lgs;

public class ApplicationHW01 {
	public static void main(String[] args) {

		byte a = 1;
		int b = 2;
		long c = 3l;
		boolean d = true;
		double e = 3.3;
		short f = 7;
		float j = 5.5F;
		char g = 'g';

		System.out.println("byte min = " + Byte.MIN_VALUE);
		System.out.println("byte max = " + Byte.MAX_VALUE);
		System.out.println("short min = " + Short.MIN_VALUE);
		System.out.println("short max = " + Short.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE);
		System.out.println("int max = " + Integer.MAX_VALUE);
		System.out.println("long min = " + Long.MIN_VALUE);
		System.out.println("long max = " + Long.MAX_VALUE);
		System.out.println("float min = " + Float.MIN_VALUE);
		System.out.println("float max = " + Float.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);
		
		System.out.println();

		int[] array = { 33, 5, 7, 99, 23, 754, 2, 11, 3456, 23 };
		int max = array[0];
		int min = array[0];

		showArray(array);
		
		System.out.println();

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("Максимальное значение в массиве: " + max);

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("Минимальное значение в массиве: " + min);

	}

	static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
