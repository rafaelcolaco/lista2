import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor de sua hora: ");
		float valorhora = input.nextFloat();
		System.out.print("Digite quantas horas trabalhadas por mês: ");
		int horastrabalho = input.nextInt();
		input.close();
		float salariobruto = valorhora * horastrabalho;
		if (salariobruto <=900) {
		float salarioir = salariobruto;
		float impostoir = 0;
		float impostoinss = (salarioir / 100) * 10;
		float salarioinss = (salarioir - impostoinss);
		float impostofgts = (salarioinss / 100) * 11;
		float salarioliquido = salarioinss - impostofgts;
		float descontototal = salariobruto - impostoir - impostoinss - impostofgts;
		System.out.println("Salário bruto: R$" + salariobruto + "\nIR: R$" + impostoir + "\nINSS: R$" + impostoinss + "\nFGTS: R$" + impostofgts + "\nTotal de desconto: R$" + descontototal + "\nSalário liquido: R$" + salarioliquido);
		}
		if ((salariobruto <= 1500) && (salariobruto > 900)) {
		float impostoir = (salariobruto / 100) * 5;
		float salarioir = (salariobruto - impostoir);
		float impostoinss = (salarioir / 100) * 10;
		float salarioinss = (salarioir - impostoinss);
		float impostofgts = (salarioinss / 100) * 11;
		float salarioliquido = salarioinss - impostofgts;
		float descontototal = salariobruto - impostoir - impostoinss - impostofgts;
		System.out.println("Salário bruto: R$" + salariobruto + "\nIR: R$" + impostoir + "\nINSS: R$" + impostoinss + "\nFGTS: R$" + impostofgts + "\nTotal de desconto: R$" + descontototal + "\nSalário liquido: R$" + salarioliquido);
		}
		if ((salariobruto <= 2500) && (salariobruto > 1500)) {
		float impostoir = (salariobruto / 100) * 10;
		float salarioir = (salariobruto - impostoir);
		float impostoinss = (salarioir / 100) * 10;
		float salarioinss = (salarioir - impostoinss);
		float impostofgts = (salarioinss / 100) * 11;
		float salarioliquido = salarioinss - impostofgts;
		float descontototal = salariobruto - impostoir - impostoinss - impostofgts;
		System.out.println("Salário bruto: R$" + salariobruto + "\nIR: R$" + impostoir + "\nINSS: R$" + impostoinss + "\nFGTS: R$" + impostofgts + "\nTotal de desconto: R$" + descontototal + "\nSalário liquido: R$" + salarioliquido);
		}
		if (salariobruto > 2500) {
		float impostoir = (salariobruto / 100) * 20;
		float salarioir = (salariobruto - impostoir);
		float impostoinss = (salarioir / 100) * 10;
		float salarioinss = (salarioir - impostoinss);
		float impostofgts = (salarioinss / 100) * 11;
		float salarioliquido = salarioinss - impostofgts;
		float descontototal = salariobruto - impostoir - impostoinss - impostofgts;
		System.out.println("Salário bruto: R$" + salariobruto + "\nIR: R$" + impostoir + "\nINSS: R$" + impostoinss + "\nFGTS: R$" + impostofgts + "\nTotal de desconto: R$" + descontototal + "\nSalário liquido: R$" + salarioliquido);
		}
			
}}
