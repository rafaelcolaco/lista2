import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma lado do tri�ngulo: ");
		float lado1 = input.nextFloat();
		System.out.print("Digite outra lado do tri�ngulo: ");
		float lado2 = input.nextFloat();
		System.out.print("Digite outra lado do tri�ngulo: ");
		float lado3 = input.nextFloat();
		input.close();
		float soma1 = lado2 + lado3;
		float soma2 = lado2 + lado1;
		float soma3 = lado1 + lado3;
		if (((soma1 > lado1) && (soma2 > lado3)) && (soma3 > lado2)) {
			System.out.println("� um tri�ngulo");
			if ((lado1 == lado2) && (lado1 == lado3))
				System.out.println("� um Equil�tero");
			else if (((lado1 == lado2) || (lado1 == lado3)) || (lado2 == lado3))
				System.out.println("� um is�sceles");
			else
				System.out.println("� um escaleno");}
		else {
			System.out.println("N�o � um tri�ngulo");}
		
	}

}
