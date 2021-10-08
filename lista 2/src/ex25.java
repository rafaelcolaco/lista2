import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero");
		float numero = input.nextFloat();
		input.close();
		if (numero % 2 == 0)
				System.out.println("Par");
		else
			System.out.println("Impar");

	}

}