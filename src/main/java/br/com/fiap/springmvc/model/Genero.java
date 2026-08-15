package br.com.fiap.springmvc.model;

public enum Genero {
    TERROR("TERROR"),
    ROMANCE("ROMANCE"),
    ACAO("ACAO"),
    SUSPENSE("SUSPENSE"),
    FICCAO_CIENTIFICA("FICCAO_CIENTIFICA"),
    BIOGRAFIA("BIOGRAFIA"),
    FILOSOFIA("FILOSOFIA"),
    RELIGIOSO("RELIGIOSO"),
    HISTORIA("HISTORIA"),
    CIENCIAS("CIENCIAS"),
    DIDATICO("Didatico");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
