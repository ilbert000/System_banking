package banco;
import java.util.Scanner;

public class Transfencia {
    public static void transferir(Scanner valor){

        double valorTransferencia;
        boolean comfirmar;
        int senha = 1208;
        int conta;

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
        } else {
            System.out.println(" aguarde cancelando operacao...");
        }

        while (senha != 1208){
            System.out.println("tente novamente");
            System.out.println("digite sua senha: ");
            senha = valor.nextInt();
        }

        System.out.println("transferencia realizado!");
    }
}
