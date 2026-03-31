package banco;
import java.util.Scanner;

public class Sacar {
    public static void sacar(Scanner valor){
        double saque;
        boolean comfirmar;
        int senha = 1208;

        System.out.println("saque selecionado \n qual valor deseja retirar");
        saque = valor.nextDouble();

        System.out.print("deseja realizar a retiradado: " + valor + ",");
        System.out.println(" escreva true para sim e false para não");
        comfirmar = valor.nextBoolean();
        if (comfirmar == true) {
            System.out.println("digite sua senha: ");
            senha = valor.nextInt();
        } else {
            System.out.println("cancelando operação");
        }

        while (senha != 1208) {
            System.out.println("tente novamente");
            System.out.println("digite sua senha: ");
            senha = valor.nextInt();
        }
        System.out.println("saque realizado no valor de: " + valor + " realizado!");
    }
}
