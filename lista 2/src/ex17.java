import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		float nota1 = input.nextFloat();
		System.out.print("Digite outra nota: ");
		float nota2 = input.nextFloat();
		input.close();
		float media = (nota1 + nota2) /2;
		if (media >= 9)
			System.out.println("Seu conceito foi A \nA m�dia foi: " + media + "\nAprovado");
		else if ((media < 9) && (media >= 7.5f))
			System.out.println("Seu conceito foi B \nA m�dia foi: " + media +  "\nAprovado");
		else if ((media < 7.5f) && (media >= 6f))
			System.out.println("Seu conceito foi C \nA m�dia foi: " + media +  "\nAprovado");
		else if ((media < 6) && (media >= 4))
			System.out.println("Seu conceito foi D \nA m�dia foi: " + media +  "\nReprovado");
		else if (media < 4)
			System.out.println("Seu conceito foi E \nA m�dia foi: " + media +  "\nReprovado");
	}

}
