import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um ano: ");
		int ano = input.nextInt();
		input.close();
		if (((ano % 4 == 0 ) && (ano  % 100 != 0)) || (ano  % 400 == 0)){
			System.out.println("O ano ? bissexto");
		}
		else {
		System.out.println("O ano n?o ? bissexto");	
		}	

	}

}
