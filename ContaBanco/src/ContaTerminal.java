import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.err.println("Digite o numero da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Valor de deposito inicial:");
        double saldoConta = scanner.nextDouble();
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorEmReais = formatoMoeda.format(saldoConta);

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: "+numeroConta+ " e seu saldo: "+valorEmReais+ " já está disponivel para saque.");
    }

}

