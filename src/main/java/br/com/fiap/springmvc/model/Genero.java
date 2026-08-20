package br.com.fiap.springmvc.model;

public enum Genero {
    TERROR("TERROR"),
    ROMANCE("ROMANCE"),
    ACAO("AÇÃO"),
    SUSPENSE("SUSPENSE"),
    FICCAO_CIENTIFICA("FICÇÃO_CIENTIFICA"),
    BIOGRAFIA("BIOGRAFIA"),
    FILOSOFIA("FILOSOFIA"),
    RELIGIOSO("RELIGIOSO"),
    HISTORIA("HISTÓRIA"),
    CIENCIAS("CIÊNCIAS"),
    DIDATICO("DIDÁTICO");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
