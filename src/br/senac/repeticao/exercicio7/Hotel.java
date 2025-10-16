package br.senac.repeticao.exercicio7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vieira.felipe
 */
public class Hotel {
    private final float diaria = 150f;
    private Map<String, Float> taxa = new HashMap<>();
    private float totalArrecadado = 0f;

    public Hotel() {
        taxa.put("<15", 8f);
        taxa.put("=15", 6.3f);
        taxa.put(">15", 5f);
    }

    public float getDiaria() {
        return diaria;
    }
    
    public float getTaxa(String tempo){
        return this.taxa.get(tempo);
    }

    public float getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(float totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }
    
    public void addTotalArrecadado(float arrecadado) {
        this.totalArrecadado += arrecadado;
    }
}
