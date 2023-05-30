package Principal;

import Cartão.Compras;
import Cartão.Credito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Credito cartao = new Credito(1000.00);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite o valor da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da sua compra: ");
            leitura.nextDouble();
            Compras compras = new Compras("teste", 100);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if (compraRealizada) {
                System.out.println("");
            }
        }

    }
}