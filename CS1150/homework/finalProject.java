package homework;

public class finalProject {

	public static void main(String[] args) {
		int[] values = new int[20];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = 1;
			if (i >= (values.length - 2)) {
				values[i] = -1;
			}
		}
		
		for (int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
	}
}