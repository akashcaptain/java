
public class excep {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[12]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}
}
