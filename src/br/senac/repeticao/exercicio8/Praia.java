package br.senac.repeticao.exercicio8;

import java.util.Random;

/**
 *
 * @author vieira.felipe
 */
public class Praia {

    private static int id = 0;
    private String nome;
    private int distanciCentro;
    private int mediaVeranistas;
    private TipoAcesso tipoAcesso;

    public Praia() {
        Random random = new Random();
        this.id++;
        this.nome = "Praia " + this.id;
        this.distanciCentro = random.nextInt(1, 31);
        this.mediaVeranistas = random.nextInt(0, 50000);
        this.tipoAcesso = (random.nextInt(2) % 2 == 0) ? TipoAcesso.ASFALTADO : tipoAcesso.TERRA;
    }

    public String getNome() {
        return nome;
    }

    public int getDistanciCentro() {
        return distanciCentro;
    }

    public int getMediaVeranistas() {
        return mediaVeranistas;
    }

    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }

    public boolean isAsflatado() {
        return (this.tipoAcesso == TipoAcesso.ASFALTADO) ? true : false;
    }

    @Override
    public String toString() {
        return String.format("{Nome: %s; Distancia: %d; "
                + "Veranistas: %d; Acesso: %s}\n", 
                this.nome, this.distanciCentro, 
                this.mediaVeranistas, this.tipoAcesso.getTipo());
    }

}
