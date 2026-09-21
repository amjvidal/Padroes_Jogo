package jogo;

public class Sertao extends Localizacao {
    @Override

    public Inimigo criarInimigo(){
        return new Cangaceiro();
    }
}
