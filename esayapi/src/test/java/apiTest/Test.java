package apiTest;

public class Test {
	
	public static void main(String[] args) {
	
		
		int array[] = { -5, -4, -3, -2, -1, 6, 1, 2, 3, 4, 5 };
		searchMaxNumlndex(array);

	}
	static void searchMaxNumlndex(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (max==a[i]) {
				System.out.println(":" + i);
			}
		}
	}
	public int[][] transpose(int[][] a){
		return null;
	}

}
