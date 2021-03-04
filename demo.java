import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter your age ");
		int age = Integer.parseInt(br.readLine());
		if (age > 18 && age < 60 )
			System.out.println("You welcome ");
		else 
			System.out.println("You are not eligible ");
		
	}

}
