package br.com.alura.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto " + "e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " tambem é um dos que todo mundo esta curtindo");
        }
    }
}
