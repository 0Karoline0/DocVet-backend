package br.com.docvet.docvet.domain.enumerador;

public enum Sexo {

    MASCULINO(0, "Masculino"),
    FEMININO(1, "Feminino");

    private final Integer valor;
    private final String sexo;

    Sexo(Integer valor, String sexo){
        this.valor = valor;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getValor(){
        return valor;
    }

    public Sexo getByValor(int valor){
        for (Sexo sexo : values()){
            if (sexo.getValor() == valor){
                return sexo;
            }
        }

        throw new IllegalArgumentException("Sexo não existente: " + valor);
    }

}
