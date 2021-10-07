import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		double nota = input.nextDouble();
		System.out.print("Digite outra nota: ");
		double nota2 = input.nextDouble();
		input.close();
		double media = (nota + nota2) / 2;
		if (media >= 7)
			System.out.println("Aprovado");
		else 
			System.out.println("reprovado");

	}

}
