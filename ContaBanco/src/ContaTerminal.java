import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor1 = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = leitor.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int Numero = leitor.nextInt();

        System.out.println("Por favor, digite o nome do cliente!");
        String Cliente = leitor1.nextLine(); 

        System.out.println("Qual o valor do deposito!");
        Double Saldo = leitor.nextDouble();
        
        System.out.println("Olá "+ Cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
        ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
