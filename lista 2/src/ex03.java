import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = input.next().charAt(0);
		input.close();
		if (letra == 'F')
			System.out.println("F - Feminino");
		else if (letra == 'M')
			System.out.println("M - Masculino");
	}

}
