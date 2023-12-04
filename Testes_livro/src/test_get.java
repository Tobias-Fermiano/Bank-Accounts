import java.util.Scanner;

public class test_get {

	public static void main(String[] args) {
		
		Account Conta1 = new Account("James", 50.00);
		Account Conta2 = new Account("Tobias", -7.90);
		
		System.out.printf("%s saldo: $%.2f %n", Conta1.getName(), Conta1.getBalance());
		System.out.printf("%s saldo: $%.2f %n", Conta2.getName(), Conta2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\nDeposite um valor para a primeira conta: ");
			double depositAmount = input.nextDouble();
		System.out.printf("%nadicionando %.2f para o saldo da primeira conta %n%n", depositAmount);
		Conta1.deposit(depositAmount);
			
		System.out.printf("%s saldo e: $%.2f ", Conta1.getName(), Conta1.getBalance());
		System.out.printf("\n\n%s saldo e: $%.2f ", Conta2.getName(), Conta2.getBalance());
		
		System.out.print("\n\nDeposite um valor para a segunda conta: ");
			depositAmount = input.nextDouble();
		System.out.printf("%nadicionando %.2f para o saldo da segunda conta %n%n", depositAmount);
		Conta2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f %n", Conta1.getName(), Conta1.getBalance());
		System.out.printf("%s balance: $%.2f %n", Conta2.getName(), Conta2.getBalance());
		
	}

}
