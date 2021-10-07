import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a altura: ");
		float altura = input.nextFloat();
		System.out.print("Digite o peso: ");
		float peso = input.nextFloat();
		System.out.print("Digite o sexo(apenas m ou f): ");
		char sexo = input.next().charAt(0);
		input.close();
		if (sexo == 'm' ) {
			float pesoidealm = (72.7f * altura) - 58;
			System.out.println(altura + " | " + peso + " | "  + sexo);
			System.out.println("pesoideal: " + pesoidealm);
			if (peso > pesoidealm)
			System.out.println("Você está acima do peso ideal");
			else if (peso < pesoidealm)
			System.out.println("Você está abaixo do peso ideal");
			else
				System.out.println("Você está no peso ideal");
		}else {
			float pesoidealf = (52.1f * altura) - 44.7f;
			System.out.println(altura + " | " + peso + " | "  + sexo);
			System.out.println("pesoideal: " + pesoidealf);
		if (peso > pesoidealf)
			System.out.println("Você está acima do peso ideal");
		else if (peso < pesoidealf)
			System.out.println("Você está abaixo do peso ideal");
		else
			System.out.println("Você está no peso ideal");
		}
	}

}
