package br.senac.repeticao;

import java.util.Scanner;

/**
 *
 * @author vieira.felipe
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    static void Ex2() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        float[] compra = new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome do cliente " + (i+1) + ":");
            nomes[i] = scanner.next();
            System.out.println("Valor da compra desse cliente:");
            compra[i] = scanner.nextFloat();
        }
        for (int i = 0; i < 10; i++) {
            float desconto;
            if (compra[i] < 250f) {
                desconto = 0.15f;
            } else {
                desconto = 0.2f;
            }
            System.out.println("Nome do ciente: " + nomes[i]
                    + "\t Valor da compra: R$" + compra[i]
                    + "\t Desconto: " + (int)desconto * 100 + "%"
                    + "\t Valor a pagar: R$" + (compra[i] * (1 - desconto)));
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Ex2();
    }

}
