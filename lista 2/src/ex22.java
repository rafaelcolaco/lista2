import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero inteiro menor que 1000");
		int numero = input.nextInt();
		input.close();
		int unidade = numero % 10;
		int dezenapart1 = numero - unidade;
		int dezenapart2 = dezenapart1 / 10;
		int dezenapart3 = dezenapart2 % 10;
		int centenapart1 = dezenapart2 - dezenapart3;
		int centenapart2 = centenapart1 / 10;
		System.out.println(centenapart2 + " centena(s)" + dezenapart3 + " dezena(s)" + unidade + " unidade(s)");
		

	}

}
