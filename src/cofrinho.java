import java.lang.reflect.Array;
import java.util.Scanner;

import moeda.dolar;
import moeda.euro;
import moeda.real;


public class cofrinho {
    Array listaMoedas[];
    dolar nova = new dolar();
    public static int escolha;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("###################################");
        System.out.println("              Cofre                ");
        System.out.println("###################################");
        System.out.println("Menu [1] Adicionar Moeda // [2] Remover moeda // [3]Lista de suas moedas // [3] Saldo Total");
        escolha = read.nextInt();

        if (escolha == 1){
            int op;
            System.out.println("[1]Dolar // [2] Real // Euro");
            System.out.println(" Selecione a moeda e depois o valor = ");
            op = read.nextInt();
            switch (op) {
            case 1:
                //Adicionar moeda em dolar
                System.out.println("Dolar");
                dolar.valor = read.nextDouble();
                break;

            case 2:
                //Adicionar moeda em Rela
                System.out.println("Real");
                real.valor = read.nextDouble();
                break;
            
            case 3:
                //Adicionar moeda em dolar
                System.out.println("euro");
                euro.valor = read.nextDouble();
                break;
            }
            if (op > 3){
                System.out.println("Erro!");
                return;
            }
        } else if(escolha == 2){

        } 
    }


}
