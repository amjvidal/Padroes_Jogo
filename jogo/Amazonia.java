package jogo;


public class Amazonia extends Localizacao {
    @Override
    public Inimigo criarInimigo(){
        return new AnimalMutante();
    }
}
