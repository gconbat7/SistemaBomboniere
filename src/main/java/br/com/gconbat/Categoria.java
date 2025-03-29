package br.com.gconbat;

public enum Categoria {
    CHOCOLATES("Chocolates"),
    CHICLETES("Chicletes"),
    CARAMELOS("Caramelos"),
    PIPOCAS("Pipocas");

    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return  descricao;
    }
}
