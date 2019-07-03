package br.edu.ifpb.poo;

import java.nio.file.Paths;

public class GerenciadorDemo {
    public static void main(String[] args) {
        GerenciadorMúsicas g = new GerenciadorMúsicas();

        System.out.println("setando as musicas");
        g.setMúsicas(g.lerTodasASMúsicas(Paths.get("txts", "50-worst-songs")));
//        for (Música m: g.getMúsicas()) System.out.println(m);

        System.out.println("removendo musica");
        g.removerMúsica(1114, Paths.get("txts", "50-worst-songs-out"));
        System.out.println("\n");
//        for (Música m: g.getMúsicas()) System.out.println(m);

        System.out.println("editando musica");
        g.editarDadosMúsica(1005, "editando", "antonio", 2019 , Paths.get("txts", "50-worst-songs-out"));
        System.out.println("\n");
//        for (Música m: g.getMúsicas()) System.out.println(m);

        System.out.println("ordenando musicas");
        ComparadorTitulo comparadorTitulo = new ComparadorTitulo();
        g.gracarMúsicasOrdenadasPor(Paths.get("txts", "50-worst-songs-out-ByTitulo"), comparadorTitulo);
        ComparadorArtista comparadorArtista = new ComparadorArtista();
        g.gracarMúsicasOrdenadasPor(Paths.get("txts", "50-worst-songs-out-Artista"), comparadorArtista);
        ComparadorAno comparadorAno = new ComparadorAno();
        g.gracarMúsicasOrdenadasPor(Paths.get("txts", "50-worst-songs-out-ByAno"), comparadorAno);
    }
}
