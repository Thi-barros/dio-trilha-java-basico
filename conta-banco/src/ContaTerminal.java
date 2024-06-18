import java.util.Scanner;

public class ContaTerminal {
    Scanner scanner =  new Scanner(System.in);

    int numeroConta; 
    String agencia;
    String nomeCliente;
    double saldo;
    public static void main(String[] args) throws Exception {
     ContaTerminal conta = new ContaTerminal();
     System.out.print("Digite o seu nome: ");
     String nomeCliente = conta.scanner.nextLine();
     System.out.print("Digite a sua agência: ");
     String agencia = conta.scanner.nextLine();
     System.out.print("Digite o número da sua conta: ");
     int numeroConta = conta.scanner.nextInt();
     System.out.print("Digite o seu saldo: ");
     double saldo = conta.scanner.nextDouble();
     System.out.println("Olá "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +" e seu saldo "+ saldo + ", já está disponível para saque.");
        
    }

}
