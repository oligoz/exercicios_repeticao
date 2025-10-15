package br.senac.repeticao;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vieira.felipe
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    static void Ex1(){
        Random random = new Random();
        int somaPositivos = 0;
        int numNegativos = 0;
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(-100,101);
            if (num >= 0){
                somaPositivos+=num;
            } else {
                numNegativos++;
            }
        }
        System.out.println("Soma dos numeros positivos: "+somaPositivos);
        System.out.println("Quantidade de numeros negativos: "+numNegativos);
    }
    
    static void Ex2() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        float[] compra = new float[10];
        float arrecadado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome do cliente " + (i + 1) + ":");
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
                    + "\t Desconto: " + (int)(desconto * 100) + "%"
                    + "\t Valor a pagar: R$" + (compra[i] * (1 - desconto)));
            arrecadado+=(compra[i] * (1 - desconto));
        }
        System.out.println("A loja arrecadou: "+arrecadado);
    }

    static void Ex3() {
        List<Integer> pares = new ArrayList<>();
        for (int i = 85; i < 907; i++) {
            if (i%2==0){
                pares.add(i);
            }
        }
        System.out.print("Os numeros pares entre 85 e 907 sao:");
        for (int num : pares){
            System.out.print(" " + num);
        }
        System.out.println("");
    }
    
    static void Ex4(){
        Scanner scanner = new Scanner(System.in);
        int numAlunos;
        int menosQ10 = 0;
        int menosQ15 = 0;
        int maisQ15 = 0;
        System.out.println("Numero de alunos:");
        numAlunos = scanner.nextInt();
        for (int i = 0; i < numAlunos; i++) {
            int numVezes;
            System.out.println("Aluno "+(i+1)+" utilizou o restaurante quantas vezes:");
            numVezes = scanner.nextInt();
            if (numVezes < 10){
                menosQ10++;
            } else if (numVezes <=15){
                menosQ15++;
            } else {
                maisQ15++;
            }
        }
        System.out.printf("Percentual de aluno que foi menos de 10 vezes: %.2f%% %n",(float)menosQ10/numAlunos*100);
        System.out.printf("Percentual de aluno que foi entre 10 e 15 vezes: %.2f%% %n",(float)menosQ15/numAlunos*100);
        System.out.printf("Percentual de aluno que foi mais de 15 vezes: %.2f%% %n",(float)maisQ15/numAlunos*100);
    }
    
    static void Ex5(int n){
        float soma = 0f;
        if (n<=0){
            return;
        }
        for (int i = 0; i < n; i++) {
            soma += ((float)n-i)/(i+1);
        }
        System.out.println("Resultado da soma: "+ soma);
    }
    
    static void Ex11(int n){
        Random random = new Random();
        float[][] notas = new float[n][4];
        float notasPortugues = 0f;
        int aprov1=0;
        int aprov2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                notas[i][j] = random.nextFloat()*10;
            }
            notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2])/3;
            if (notas[i][3]>4.5 && notas[i][2]>6){
                aprov1++;
            }
        }
        for (int i = 0; i < n; i++) {
            notasPortugues+=notas[i][0];
            if (notas[i][0] > 2 && notas[i][1] > 2 && notas[i][2] > 2 && notas[i][3] > 4 ) {                
                System.out.println("Aluno "+(i+1)+" aprovado.");
                if (notas[i][1]>5){
                    aprov2++;
                }
            }
        }
        System.out.println("Media portugues: "+notasPortugues/n);
        System.out.println(aprov1);
        System.out.println(aprov2);
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5(5);
        Ex11(10);
    }

}
