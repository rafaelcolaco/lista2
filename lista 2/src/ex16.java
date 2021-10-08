import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma nota");
		float nota1 = input.nextFloat();
		System.out.print("Digite outra nota");
		float nota2 = input.nextFloat();
		input.close();
		float media = (nota1 + nota2) / 2;
		if  (media < 3)
			System.out.println("Reprovado");
		else if ((media >= 3) && (media <= 6.9f ))
			System.out.println("Em exame");
		else if (media >= 7)
			System.out.println("aprovado");

	}

}
