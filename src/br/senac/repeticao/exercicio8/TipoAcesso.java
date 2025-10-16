package br.senac.repeticao.exercicio8;

/**
 *
 * @author vieira.felipe
 */
public enum TipoAcesso {
    ASFALTADO("Asfalto"),
    TERRA("Terra");
    
    private final String tipo;

    private TipoAcesso(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
