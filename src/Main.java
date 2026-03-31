import banco.Sacar;
import banco.Deposito;
import banco.Transfencia;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);
    System.out.println("escolha uma das opções a seguir: \n 1: sacar\n 2: depositar\n 3: transferir\n 4: sair\n");
    int number = valor.nextInt();

    while (number == 1 || number == 2 || number == 3) {
        switch (number) {
            case 1:
                Sacar.sacar(valor);
                break;
            case 2:
                Deposito.depositar(valor);
                break;
            case 3:
                Transfencia.transferir(valor);
                break;
            case 4:
                System.out.println("voce esta deslogado");
                break;
        }

        System.out.println("escolha uma das opções a seguir: \n 1: sacar\n 2: depositar\n 3: transferir\n 4: sair\n");
        number = valor.nextInt();
        }
    }
}