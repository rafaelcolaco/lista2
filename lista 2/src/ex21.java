import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um dia: ");
		int dia = input.nextInt();
		System.out.print("Digite um mês: ");
		int mes = input.nextInt();
		System.out.print("Digite um ano: ");
		int ano = input.nextInt();
		input.close();
		if ((dia >= 29) && (mes == 2))
			System.out.println("Data invalida");
		else if ((dia > 31) && (mes > 12))
			System.out.println("Data invalida");
		else if (ano < 1)
			System.out.println("Data invalida");

	}

}
