import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero");
		float numero = input.nextFloat();
		input.close();
		if (numero % 1 == 0)
				System.out.println("inteiro");
		else
			System.out.println("Decimal");

	}

}
