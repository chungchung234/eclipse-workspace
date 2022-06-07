
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int[5];
		int[] Array1 = {1,2,3};
		Array= Array1.clone();
		Array[1]=1;
		System.out.print(Array1[1]);

		for (int i; i<Array1.length;i++){
			System.out.print(Array1[i])
		}
	}

}
