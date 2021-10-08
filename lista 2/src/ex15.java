import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o código");
		int codigo = input.nextInt();
		input.close();
		if (codigo == 1) 
			System.out.println("Sul");
		else if (codigo == 2)
			System.out.println("Norte");
		else if (codigo == 3)
			System.out.println("Leste");
		else if (codigo == 4)
			System.out.println("Oeste");
		else if (codigo == 5)
			System.out.println("Nordeste");
		else if (codigo == 6)
			System.out.println("Centro-oeste");
		else if (codigo == 7)
			System.out.println("Noroeste");
		else if (codigo == 8)
			System.out.println("Sudeste");
		else if (codigo == 9)
			System.out.println("Sudoeste");
		else
			System.out.println("importado");

	}

}
