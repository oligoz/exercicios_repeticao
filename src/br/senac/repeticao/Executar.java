package br.senac.repeticao;

import br.senac.repeticao.exercicio10.Cidade;
import br.senac.repeticao.exercicio10.Clube;
import br.senac.repeticao.exercicio10.Entrevistado;
import br.senac.repeticao.exercicio12.Universitario;
import br.senac.repeticao.exercicio6.Aluno;
import br.senac.repeticao.exercicio7.Cliente;
import br.senac.repeticao.exercicio7.Hotel;
import br.senac.repeticao.exercicio8.Praia;
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
    static void Ex1() {
        Random random = new Random();
        int somaPositivos = 0;
        int numNegativos = 0;
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(-100, 101);
            if (num >= 0) {
                somaPositivos += num;
            } else {
                numNegativos++;
            }
        }
        System.out.println("Soma dos numeros positivos: " + somaPositivos);
        System.out.println("Quantidade de numeros negativos: " + numNegativos);
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
                    + "\t Desconto: " + (int) (desconto * 100) + "%"
                    + "\t Valor a pagar: R$" + (compra[i] * (1 - desconto)));
            arrecadado += (compra[i] * (1 - desconto));
        }
        System.out.println("A loja arrecadou: " + arrecadado);
    }

    static void Ex3() {
        List<Integer> pares = new ArrayList<>();
        for (int i = 85; i < 907; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        System.out.print("Os numeros pares entre 85 e 907 sao:");
        for (int num : pares) {
            System.out.print(" " + num);
        }
        System.out.println("");
    }

    static void Ex4() {
        Scanner scanner = new Scanner(System.in);
        int numAlunos;
        int menosQ10 = 0;
        int menosQ15 = 0;
        int maisQ15 = 0;
        System.out.println("Numero de alunos:");
        numAlunos = scanner.nextInt();
        for (int i = 0; i < numAlunos; i++) {
            int numVezes;
            System.out.println("Aluno " + (i + 1) + " utilizou o restaurante quantas vezes:");
            numVezes = scanner.nextInt();
            if (numVezes < 10) {
                menosQ10++;
            } else if (numVezes <= 15) {
                menosQ15++;
            } else {
                maisQ15++;
            }
        }
        System.out.printf("Percentual de aluno que foi menos de 10 vezes: %.2f%% %n", (float) menosQ10 / numAlunos * 100);
        System.out.printf("Percentual de aluno que foi entre 10 e 15 vezes: %.2f%% %n", (float) menosQ15 / numAlunos * 100);
        System.out.printf("Percentual de aluno que foi mais de 15 vezes: %.2f%% %n", (float) maisQ15 / numAlunos * 100);
    }

    static void Ex5(int n) {
        float soma = 0f;
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            soma += ((float) n - i) / (i + 1);
        }
        System.out.println("Resultado da soma: " + soma);
    }

    static void Ex6Classe() {
        Aluno[] alunos = new Aluno[45];
        float idadeMedia = 0;
        float alturaMedia = 0;
        int alunosBaixos = 0;
        int alunosVelhos = 0;

//        Criando os alunos
//          Idade e altura sao definidos no constructor da classe
        for (int i = 0; i < alunos.length; i++) {
            String nome = "Aluno " + (i + 1);
            alunos[i] = new Aluno(nome);
        }

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getAltura() < 1.7) {
                alunosBaixos++;
                idadeMedia += alunos[i].getIdade();
            }
            if (alunos[i].getIdade() > 20) {
                alunosVelhos++;
                alturaMedia += alunos[i].getAltura();
            }
        }

        idadeMedia /= alunosBaixos;
        alturaMedia /= alunosVelhos;
        System.out.println("Idade media dos alunos menores que 1.7m: " + idadeMedia);
        System.out.println("Altura media dos alunoscom mais de 20 anos: " + alturaMedia);
    }

    static void Ex7Classe() {
        Scanner scanner = new Scanner(System.in);
        int numClientes;
        Hotel hotel = new Hotel();
        float valorDiaria = hotel.getDiaria();
        List<Cliente> clientes = new ArrayList<>();

        System.out.println("Numero de clientes: ");
        numClientes = scanner.nextInt();
        for (int i = 0; i < numClientes; i++) {
            Random random = new Random();
            int diarias;
            float taxa;
            clientes.add(new Cliente());
            clientes.get(i).setNome("Cliente " + (i + 1));
            clientes.get(i).setDiarias(random.nextInt(14, 17));
            diarias = clientes.get(i).getDiarias();
            if (diarias < 15) {
                taxa = hotel.getTaxa("<15");
            } else if (diarias == 15) {
                taxa = hotel.getTaxa("=15");
            } else {
                taxa = hotel.getTaxa(">15");
            }
            clientes.get(i).setConta((valorDiaria + taxa) * diarias);
            hotel.addTotalArrecadado(clientes.get(i).getConta());
            System.out.printf("%s vai pagar: R$%.2f\n", clientes.get(i).getNome(), clientes.get(i).getConta());
            System.out.printf("\tDiarias: %d; Taxa: %.2f\n", diarias, taxa);
        }
        System.out.printf("O hotel arrecadou: R$%.2f\n", hotel.getTotalArrecadado());

    }

    static void Ex8Classe() {
        Random random = new Random();
        int numPraias = random.nextInt(1, 1000);
        List<Praia> praias = new ArrayList<>();
        int praiasLonge = 0;
        int mediaVeranistas = 0;
        int praiasNaoAsfaltadas = 0;
        int praiasVazias = 0;

//        Criando as praias
        System.out.println("Numero de praias: " + numPraias);
        for (int i = 0; i < numPraias; i++) {
            praias.add(new Praia());
        }

        for (Praia praia : praias) {
            if (praia.getDistanciCentro() > 15) {
                praiasLonge++;
            }
            if (!praia.isAsflatado()) {
                praiasNaoAsfaltadas++;
                mediaVeranistas += praia.getMediaVeranistas();
            }
            if (praia.getMediaVeranistas() < 1000) {
                praiasVazias++;
            }
        }
        mediaVeranistas /= praiasNaoAsfaltadas;

        System.out.println("Numero de praias que distam mais de 15 Km do centro: " + praiasLonge);
        System.out.println("Media de veranistas, na temporada passada, com acesso nao asfaltdo: " + mediaVeranistas);

        praias.sort((praia1, praia2) -> {
            if (praia1.getDistanciCentro() < praia2.getDistanciCentro()) {
                return -1;
            }
            if (praia1.getDistanciCentro() > praia2.getDistanciCentro()) {
                return 1;
            }
            return 0;
        });

        System.out.println("Prais asfaltadas com menos de 1000 veranistas:");
        for (Praia praia : praias) {
            if (praia.isAsflatado() && praia.getMediaVeranistas() < 1000) {
                System.out.println("Nome: " + praia.getNome() + " - Distancia: " + praia.getDistanciCentro() + "Km.");
            }
        }
    }

    static void Ex9() {
        Scanner scanner = new Scanner(System.in);
        int potencia;
        int potenciaAtual = 1;
        int soma = 0;
        System.out.println("Qual a potencia final:");
        potencia = scanner.nextInt();
        for (int i = 0; i < potencia; i++) {
            potenciaAtual *= 3;
            soma += potenciaAtual;
        }
        System.out.println("Soma de todos os termos: " + soma);
    }

    static void Ex10Classe() {
        Random random = new Random();
        int numEntrevistados = random.nextInt(1, 1000);
        Clube figueirense = new Clube("Figueirense");
        Clube marcilioDias = new Clube("Marcilio Dias");
        Clube outrosClubes = new Clube("Outros Clubes");
        Clube[] clubes = {figueirense, marcilioDias, outrosClubes};
        List<Entrevistado> entrevistados = new ArrayList<>();
        float mediaSalarial = 0;
        int letraC = 0;
        int letraD = 0;
        for (int i = 0; i < numEntrevistados; i++) {
            Entrevistado entrevistado = new Entrevistado();
            entrevistado.setNome("Entrevistado " + (i + 1));
            entrevistado.setSalario(random.nextFloat(1300, 20000));
            entrevistado.setClube(clubes[random.nextInt(3)]);
            entrevistado.setLocalNascimento((random.nextInt(2) % 2 == 0) ? Cidade.FLORIANOPOLIS : Cidade.OUTRASCIDADES);
            entrevistados.add(entrevistado);
        }
        for (Clube time : clubes) {
            System.out.println(time.getNome() + " tem " + time.getNumeroTorcedores() + " torcedores.");
        }
        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.getClube() == figueirense) {
                mediaSalarial += entrevistado.getSalario();
                if (entrevistado.getLocalNascimento() == Cidade.OUTRASCIDADES) {
                    letraD++;
                }
            } else if (entrevistado.getClube() == marcilioDias && entrevistado.getLocalNascimento() == Cidade.FLORIANOPOLIS) {
                letraC++;
            }
        }
        mediaSalarial /= figueirense.getNumeroTorcedores();
        System.out.printf("Media salarial dos toredores do Figueirense: R$%.2f\n", mediaSalarial);
        System.out.println("Numero de pessoas nascidas em Florianopolis e que torcem pelo Marcilio Dias: " + letraC);
        System.out.println("Numero de pessoas nascidas em outras cidades e que torcem pelo Figueirense: " + letraD);
    }

    static void Ex11(int n) {
        Random random = new Random();
        float[][] notas = new float[n][4];
        float notasPortugues = 0f;
        int aprov1 = 0;
        int aprov2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                notas[i][j] = random.nextFloat() * 10;
            }
            notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
            if (notas[i][3] > 4.5 && notas[i][2] > 6) {
                aprov1++;
            }
        }
        for (int i = 0; i < n; i++) {
            notasPortugues += notas[i][0];
            if (notas[i][0] > 2 && notas[i][1] > 2 && notas[i][2] > 2 && notas[i][3] > 4) {
                System.out.println("Aluno " + (i + 1) + " aprovado.");
                if (notas[i][1] > 5) {
                    aprov2++;
                }
            }
        }
        System.out.println("Media portugues: " + notasPortugues / n);
        System.out.println(aprov1);
        System.out.println(aprov2);
    }

    static void Ex12Classe() {
        Random random = new Random();
        List<Universitario> alunos = new ArrayList<>();
        float letraA = 0;
        int numAlunosMais300Alimentacao = 0;
        float letraB = 0;
        int numAlunos = random.nextInt(1, 20);
        for (int i = 0; i < numAlunos; i++) {
            Universitario aluno = new Universitario();
            aluno.setRendaFamiliar(random.nextFloat(1300, 50000));
            aluno.setGastoAluguel(random.nextFloat(0, aluno.getRendaFamiliar() * 2 / 3));
            aluno.setGastoVestimenta(random.nextFloat(0, aluno.getRendaFamiliar()
                    - aluno.getGastoAluguel()));
            aluno.setGastoAlimentacao(random.nextFloat(0, aluno.getRendaFamiliar()
                    - aluno.getGastoAluguel()
                    - aluno.getGastoVestimenta()));
            alunos.add(aluno);
        }
        for (Universitario aluno : alunos) {
            if (aluno.getGastoAlimentacao() > 300f) {
                letraA += aluno.getRendaFamiliar();
                numAlunosMais300Alimentacao++;
            }
            letraB += aluno.getGastoAluguel();
        }
        letraA /= numAlunosMais300Alimentacao;
        letraB /= alunos.size();
        System.out.printf("Renda media familiar dos alunos que gastam mais de R$300 com alimentacao: R$%.2f\n", letraA);
        System.out.printf("O gasto media com aluguel: R$%.2f\n", letraB);
        for (Universitario aluno : alunos) {
            System.out.printf("{P1=%.2f%%; P2=%.2f%%}\n", (aluno.getGastoAlimentacao() / aluno.getRendaFamiliar()) * 100,
                    (aluno.getGastoVestimenta() / aluno.getRendaFamiliar()) * 100);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5(5);
//        Ex6Classe();
//        Ex7Classe();
//        Ex8Classe();
//        Ex9();
//        Ex10Classe();
//        Ex11(10);
        Ex12Classe();
    }

}
