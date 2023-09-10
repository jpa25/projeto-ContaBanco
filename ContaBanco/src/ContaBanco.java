import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nomedocliente = scanner.next();
        
        System.out.println("Digite o número da sua conta bancária");
        String numero = scanner.next();

        System.out.println("Digite o número da Agência");
        int agencia = scanner.nextInt();
        

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá," + nomedocliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("conta " + numero + " e seu saldo de  ");
        System.out.println(" R$ 237.48 já está disponível para saque");
    }
}
