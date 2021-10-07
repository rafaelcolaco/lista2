import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = input.nextInt();
		input.close();
		int numero2 = numero + 1;
		System.out.println(numero2);
	}

}
