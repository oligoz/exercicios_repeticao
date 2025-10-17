package br.senac.repeticao.exercicio10;

/**
 *
 * @author vieira.felipe
 */
public class Entrevistado {
    private String nome;
    private float salario;
    private Clube clube;
    private Cidade localNascimento;

    public Entrevistado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        if (clube != this.clube){
            clube.incrementaNumeroTorcedores();
            if (this.clube != null){
                this.clube.decrementaNumeroTorcedores();
            }
        }
        this.clube = clube;
    }

    public Cidade getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(Cidade localNascimento) {
        this.localNascimento = localNascimento;
    }
    
}
