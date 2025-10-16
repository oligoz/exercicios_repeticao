package br.senac.repeticao.exercicio6;

import java.util.Random;

/**
 *
 * @author vieira.felipe
 */
public class Aluno {
    private String nome;
    private int idade;
    private float altura;

    public Aluno(String nome) {
        Random random = new Random();
        this.nome = nome;
        this.idade = random.nextInt(18, 30);
        this.altura = random.nextFloat(1.5f, 2.2f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
