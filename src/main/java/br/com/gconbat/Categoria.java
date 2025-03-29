package br.com.gconbat;

public enum Categoria {
    CHOCOLATES("Chocolates"),
    CHICLETES("Chicletes"),
    DOCES("Doces"),
    PIPOCAS("Pipocas"),
    BISCOITOS("Biscoitos");

    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return  descricao;
    }
}
