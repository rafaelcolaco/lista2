import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valor = input.nextInt();
		input.close();	
		if(valor > 0)
			System.out.println("O valor � positivo");
		else if(valor < 0)
			System.out.println("O valor � negativo");
		else 
			System.out.println("O valor � zero");
	}

}
