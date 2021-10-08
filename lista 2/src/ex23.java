import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma idade");
		int idade1 = input.nextInt();
		System.out.print("Digite outra idade");
		int idade2 = input.nextInt();
		System.out.print("Digite outra idade");
		int idade3 = input.nextInt();
		input.close();
		int media = (idade1 + idade2 + idade3) / 3;
		if (media > 40)
			System.out.println("Turma idosa");
		else if ((media >= 25) && (media <= 40))
			System.out.println("Turma adulta");
		else
			System.out.println("Turma jovem");

	}

}
