import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o salário");
		float salarioinicial = input.nextFloat();
		input.close();
		float salario280 = (salarioinicial / 100) * 20;
		float salario700 = (salarioinicial / 100) * 15;
		float salario1000 = (salarioinicial / 100) * 10;
		float salario1500 = (salarioinicial / 100) * 5;
		if (salarioinicial <= 280) {
		System.out.println("Seu salário antes era: R$" + salarioinicial);
		System.out.println("Você recebeu um aumento de 20%");
		float aumento280 = salarioinicial + salario280;
		System.out.println("O valor do Aumento foi: " + salario280);
		System.out.println("O seu atual salário é: R$" + aumento280);
		}
		 if ((salarioinicial > 280 ) && (salarioinicial <= 700)) {
		System.out.println("Seu salário antes era: R$" + salarioinicial);
		System.out.println("Você recebeu um aumento de 15%");
		float aumento700 = salario700 + salarioinicial;
		System.out.println("O valor do Aumento foi: " + salario700);
		System.out.println("O seu atual salário é: R$" + aumento700);
		 }
		 if ((salarioinicial > 700 ) && (salarioinicial <= 1500)) {
		System.out.println("Seu salário antes era: R$" + salarioinicial);
		System.out.println("Você recebeu um aumento de 10%");
		float aumento1000 = salario1000 + salarioinicial;
		System.out.println("O valor do Aumento foi: " + salario1000);
		System.out.println("O seu atual salário é: R$" + aumento1000);
		 }
		if (salarioinicial > 1500) {
		System.out.println("Seu salário antes era: R$" + salarioinicial);
		System.out.println("Você recebeu um aumento de 5%");
		float aumento1500 = salario1500 + salarioinicial;
		System.out.println("O valor do Aumento foi: " + salario1500);
		System.out.println("O seu atual salário é: R$" + aumento1500);
			
		}
		

	}

}
