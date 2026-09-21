package jogo;

public abstract class Localizacao {

    public abstract Inimigo criarInimigo();

    public void jogar(){
        Inimigo inimigo = criarInimigo();
        inimigo.atacar();
    }

}
