import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        System.out.print("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.next();

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}