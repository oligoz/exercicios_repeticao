package br.senac.repeticao.exercicio7;

/**
 *
 * @author vieira.felipe
 */
public class Cliente {
    private String nome;
    private int diarias;
    private float conta = 0;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public float getConta() {
        return conta;
    }

    public void setConta(float conta) {
        this.conta = conta;
    }
    
}
