
package ArrayExamples;

public class RightRotate {
	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5};
		int numberOfRotate = 3;
		System.out.println("Original Array: ");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//rotation starts
		
		System.out.println("");
		
		
		for(int i = 0; i < numberOfRotate; i++) {
			int lastElement = array[array.length - 1];
			
			for(int j = array.length - 1; j > 0; j--) {
				array[j] = array[j-1];
			}
			array[0] = lastElement;
		}
		
		System.out.println("Right Rotational Array");
		for(int i = 0; i<array.length; i++) {
		
			System.out.print(array[i] +" ");
		}
	}
}
