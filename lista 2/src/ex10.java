import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		System.out.print("Digite outro número: ");
		int numero2 = input.nextInt();
		System.out.print("Digite outro número: ");
		int numero3 = input.nextInt();
		input.close();
		if (( numero > numero2 ) && ( numero2 > numero3 ))
		System.out.println("O maior foi: " +numero + " e o menor foi: " + numero3);
		else if ((numero > numero3) && (numero3 > numero2))
		System.out.println("O maior foi: " +numero + " e o menor foi: " + numero2);
		else if ((numero2 > numero) && (numero > numero3))
		System.out.println("O maior foi: " +numero2 + " e o menor foi: " + numero3);
		else if ((numero2 > numero3) && (numero3 > numero))
		System.out.println("O maior foi: " +numero2 + " e o menor foi: " + numero);
		else if ((numero3 > numero) && (numero > numero2))
		System.out.println("O maior foi: " +numero3 + " e o menor foi: " + numero2);
		else if ((numero3 > numero2) && (numero2 > numero))
		System.out.println("O maior foi: " +numero3 + " e o menor foi: " + numero);
	
	}	

}
