import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = input.nextInt();
		System.out.print("Digite outro número: ");
		int numero2 = input.nextInt();
		System.out.print("Digite outro número: ");
		int numero3 = input.nextInt();
		input.close();
		if (( numero1 > numero2 ) && ( numero2 > numero3 ))
			System.out.println(numero1 + " | " + numero2 + " | " + numero3 + " | ");
		else if (( numero2 > numero1 ) && ( numero1 > numero3 ))
			System.out.println(numero2 + " | " + numero1 + " | " + numero3 + " | ");
		else if (( numero3 > numero1 ) && ( numero1 > numero2 ))
			System.out.println(numero3 + " | " + numero1 + " | " + numero2 + " | ");
		else if (( numero1 > numero3 ) && ( numero3 > numero2 ))
			System.out.println(numero1 + " | " + numero3 + " | " + numero2 + " | ");
		else if (( numero2 > numero3 ) && ( numero3 > numero1 ))
			System.out.println(numero2 + " | " + numero3 + " | " + numero1 + " | ");
		else if (( numero3 > numero2 ) && ( numero2 > numero1 ))
			System.out.println(numero3 + " | " + numero2 + " | " + numero1 + " | ");
	}

}
