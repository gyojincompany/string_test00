package string_test00;

public class ArrayFunction {
	
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;			
	}
	
	static int[] outputArray(int a, int b, int c) {
		int arr[] = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int ret[] = new int[3];	
		ret = outputArray(1,2,3);

	}

}
