import java.util.Scanner;

public class Pract8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
        int index = 2;
        sc.close();

		
		while (number / index != 1) {
			
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; 
			}
			else
				index++; 
		}
		System.out.println(number );
    }
}
