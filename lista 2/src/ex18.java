import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma lado do triângulo: ");
		float lado1 = input.nextFloat();
		System.out.print("Digite outra lado do triângulo: ");
		float lado2 = input.nextFloat();
		System.out.print("Digite outra lado do triângulo: ");
		float lado3 = input.nextFloat();
		input.close();
		float soma1 = lado2 + lado3;
		float soma2 = lado2 + lado1;
		float soma3 = lado1 + lado3;
		if (((soma1 > lado1) && (soma2 > lado3)) && (soma3 > lado2)) {
			System.out.println("É um triângulo");
			if ((lado1 == lado2) && (lado1 == lado3))
				System.out.println("É um Equilátero");
			else if (((lado1 == lado2) || (lado1 == lado3)) || (lado2 == lado3))
				System.out.println("É um isósceles");
			else
				System.out.println("É um escaleno");}
		else {
			System.out.println("Não é um triângulo");}
		
	}

}
