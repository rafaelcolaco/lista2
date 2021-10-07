import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int primeiro = input.nextInt();
		System.out.print("Digite outro número: ");
		int segundo = input.nextInt();
		input.close();
		if (primeiro > segundo) 
			System.out.println("O maior número foi: " + primeiro);
		else 
			System.out.println("O maior número foi: " + segundo);
		
	}

}
