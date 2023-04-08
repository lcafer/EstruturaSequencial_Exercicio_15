package EstruturaSequencial_Exercicio_15;
import java.util.Scanner;

public class WorkHours {
    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Informe seu salário:");
		float salary = 0.f;
		try {
			salary = userInput.nextFloat();
		} catch (Exception e) {
			salary = Float.parseFloat(userInput.nextLine());
		}
		final float IR_TAX = salary * 0.11f;
		final float INSS_TAX = salary * 0.08f;
		final float SYNDICATE_TAX = salary * 0.05f;
		float salaryWithoutTax = salary - (IR_TAX + INSS_TAX + SYNDICATE_TAX);
		System.out.println("O seu salário bruto é de: R$ " + salary +"\nVocê pagou de imposto de renda: R$: "+ IR_TAX + "\nVocê pagou ao INSS: R$ " + INSS_TAX + "\nVocê pagou ao sindicato: R$ " + SYNDICATE_TAX + "\nSeu salário líquido é de: R$ " + salaryWithoutTax);
		userInput.close();
	}
}
