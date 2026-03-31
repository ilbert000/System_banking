import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);

    System.out.println("escolha uma das opções a seguir: \n 1: sacar\n 2: depositar\n 3: transferir\n 4: sair\n");
    int number1 = valor.nextInt();
    double valorSaque;
    double valorDeposito;
    double valorTransferencia;
    boolean comfirmar;
    int senha = 1208;
    int conta;

    while (number1 == 1 || number1 == 2 || number1 == 3) {

        switch (number1) {
            case 1:
                System.out.println("saque selecionado \n qual valor deseja retirar");
                valorSaque = valor.nextDouble();
                System.out.print("deseja realizar a retiradado: " + valorSaque + ",");
                System.out.println(" escreva true para sim e false para não");
                comfirmar = valor.nextBoolean();
                if (comfirmar == true) {
                    System.out.println("digite sua senha: ");
                    senha = valor.nextInt();
                } else {
                    System.out.println("cancelando operação");
                    break;
                }

                while (senha != 1208) {
                    System.out.println("tente novamente");
                    System.out.println("digite sua senha: ");
                    senha = valor.nextInt();
                }
                System.out.println("saque realizado!");
                break;
            case 2:
                System.out.println("funcao de depositar selecionada");
                System.out.println("qual valor deseja depositar");
                valorDeposito = valor.nextDouble();
                System.out.println("voce deseja depositar o valor de: " +  valorDeposito +  ", se sim degite true, se nao digite false" );
                comfirmar = valor.nextBoolean();

                if (comfirmar == true){
                    System.out.println("digite sua senha");
                    senha = valor.nextInt();
                } else{
                    System.out.println(" aguarde cancelando operacao");
                    break;
                }

                while (senha != 1208){
                    System.out.println("tente novamente");
                    System.out.println("digite sua senha: ");
                    senha = valor.nextInt();
                }

                System.out.println("deposito realizado!");
                break;
            case 3:
                System.out.println("funcao de transferencia selecionada");
                System.out.println("qual valor deseja tranferir");
                valorTransferencia = valor.nextDouble();
                System.out.println("qual é a conta que deseja transferir: ");
                conta = valor.nextInt();

                while (conta > 1001 || conta < 0){
                    System.out.println("conta inesistente!\n tente novamente");
                    conta = valor.nextInt();
                }

                System.out.println("deseja transferir o valor de: " + valorTransferencia + " para a conta: " + conta + "\n sim digite true, se não digite false");
                comfirmar = valor.nextBoolean();

                if (comfirmar == true){
                    System.out.println("digite sua senha");
                    senha = valor.nextInt();
                } else{
                    System.out.println(" aguarde cancelando operacao...");
                    break;
                }

                while (senha != 1208){
                    System.out.println("tente novamente");
                    System.out.println("digite sua senha: ");
                    senha = valor.nextInt();
                }

                System.out.println("transferencia realizado!");
                break;
            case 4:
                System.out.println("voce esta deslogado");
                break;
        }
        System.out.println("escolha uma das opções a seguir: \n 1: sacar\n 2: depositar\n 3: transferir\n 4: sair\n");
        number1 = valor.nextInt();
    }
}
}