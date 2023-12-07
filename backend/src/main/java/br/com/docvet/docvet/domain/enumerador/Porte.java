package br.com.docvet.docvet.domain.enumerador;

import lombok.Getter;

public enum Porte{

    PEQUENO(0, "Pequeno"),
    MEDIO(1, "Médio"),
    GRANDE(2, "Grande");


    private final Integer valor;
    private final String porte;

    Porte(Integer valor, String porte){
        this.valor = valor;
        this.porte = porte;
    }

    public Integer getValor() {
        return valor;
    }

    public String getPorte() {
        return porte;
    }

    public Porte getByValor(int valor){
        for (Porte porte : values()){
            if (porte.getValor() == valor){
                return porte;
            }
        }

        throw new IllegalArgumentException("Porte não existente: " + valor);
    }



}