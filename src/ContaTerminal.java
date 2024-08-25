import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o identificador da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Insira o número de conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o nome de usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        float saldo = scanner.nextFloat();

        scanner.close();
        
        MostrarMensagem(nome, agencia, numeroConta, saldo);
    }

    public static void MostrarMensagem(String nome, String agencia, int numeroConta, float saldo){

        String mensagem = "Olá " + nome +
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo "
        + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}

//"Olá nome, obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"