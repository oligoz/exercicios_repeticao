package br.senac.repeticao.exercicio10;

/**
 *
 * @author vieira.felipe
 */
public class Clube {
    private String nome;
    private int numeroTorcedores = 0;

    public Clube(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTorcedores() {
        return numeroTorcedores;
    }

    public void setNumeroTorcedores(int numeroTorcedores) {
        this.numeroTorcedores = numeroTorcedores;
    }
    
    public void incrementaNumeroTorcedores(){
        this.numeroTorcedores++;
    }
    
    public void decrementaNumeroTorcedores(){
        this.numeroTorcedores--;
    }
}
