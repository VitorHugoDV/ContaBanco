import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numberAgency = sc.nextInt();

        System.out.println("Digite o nome da agência! ");
        String nameAgency = sc.next();

        System.out.println("Qual o saldo da sua conta? ");
        double balance = sc.nextDouble();

        System.out.println("Digite o seu nome de Cliente: ");
        String nameClient = sc.next();

        System.out.print("Olá " + nameClient);
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + nameAgency + ", conta " + numberAgency);
        System.out.println(" e seu saldo de " + "R$" + balance + " já está disponível para saque.");       
    }
}