import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int primeiro = input.nextInt();
		System.out.print("Digite outro n�mero: ");
		int segundo = input.nextInt();
		input.close();
		if (primeiro > segundo) 
			System.out.println("O maior n�mero foi: " + primeiro);
		else 
			System.out.println("O maior n�mero foi: " + segundo);
		
	}

}
