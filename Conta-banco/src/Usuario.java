import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int numero = scanner.nextInt();

        System.out.println("Informe a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o nome do titular: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo inicial da conta: ");
        double saldo  = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println(" olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta de número " + numero + " e seu saldo " + saldo + " ja está disponível para saque ");
        


    }
}
