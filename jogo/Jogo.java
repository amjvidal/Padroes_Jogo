package jogo;

public class Jogo{
    public static void main(String[] args){
        System.out.println("------ Fase 1: Iniciando na Amazonia ------");
        Localizacao fase1 = new Amazonia();
        fase1.jogar();

        System.out.println("\n------ Fase 2: Viajando para o Sertão ------");
        Localizacao fase2 = new Sertao();
        fase2.jogar();
    }
}