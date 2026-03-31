package banco;
import java.util.Scanner;

public class Deposito {
    public static void depositar(Scanner valor){
        double valorDeposito;
        boolean comfirmar;
        int senha = 1208;

        System.out.println("funcao de depositar selecionada");
        System.out.println("qual valor deseja depositar");
        valorDeposito = valor.nextDouble();
        System.out.println("voce deseja depositar o valor de: " +  valor +  ", se sim degite true, se nao digite false" );
        comfirmar = valor.nextBoolean();

        if (comfirmar == true){
            System.out.println("digite sua senha");
            senha = valor.nextInt();
        } else{
            System.out.println(" aguarde cancelando operacao");
        }

        while (senha != 1208){
            System.out.println("tente novamente");
            System.out.println("digite sua senha: ");
            senha = valor.nextInt();
        }

        System.out.println("deposito realizado!");
    }
}
