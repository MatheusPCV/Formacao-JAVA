import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número de sua conta:");
            int numeroConta = scan.nextInt();

        System.out.println("Digite sua agência:");
            String agencia = scan.next();

        System.out.println("Digite seu nome:");
            String nome = scan.next();
        
        System.out.println("Digite seu saldo:");
            Double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponível para saque.");
    }
}
