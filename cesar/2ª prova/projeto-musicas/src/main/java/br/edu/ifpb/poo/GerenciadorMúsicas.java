package br.edu.ifpb.poo;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class GerenciadorMúsicas {
    private Set<Música> músicas;

    public Set<Música> lerTodasASMúsicas( Path pathOrigem ) {
        Set<Música> musicas = new TreeSet<>();

        //
        List<String> list;
        Música musica;
        String[] string;
        try {
            list = Files.readAllLines(pathOrigem, Charset.defaultCharset());

            for (String str: list) {

                string = str.split(";");
                for (String str1 : string) {
                    str1 = str1.replaceAll("\\s+"," ");
                    str1 = str1.trim();
                }
                musica = new Música();
                String cod = string[0].replaceAll("\\s+"," ");
                cod = cod.trim();
                musica.setCod(Integer.parseInt(cod));
                String titulo = string[1].replaceAll("\\s+"," ");
                titulo = titulo.trim();
                musica.setTitulo(titulo);
                String autor = string[2].replaceAll("\\s+"," ");
                autor = autor.trim();
                musica.setAutor(autor);
                String ano = string[3].replaceAll("\\s+"," ");
                ano = ano.trim();
                musica.setAno(Integer.parseInt(ano));
                musicas.add(musica);
            }
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        //

        return musicas;
    }

    public void setMúsicas(Set<Música> músicas) {
        this.músicas = músicas;
    }

    public Set<Música> getMúsicas() {
        return músicas;
    }

    public boolean removerMúsica( int cod, Path pathDestino) {
        boolean ret = false;
        boolean removeu = false;
        // removendo do conjunto
        for (Música m : músicas) {
            if (m.getCod() == cod) {
                músicas.remove(m);
                removeu = true;
                break;
            }
        }
        // removendo do conjunto

        // gravando
        List<Música> tempMusicalist = new ArrayList<>(músicas);
        List<String> list = new ArrayList<>();
        for (Música m: tempMusicalist) list.add(m.toStringGrava());

        try {
            Files.write(pathDestino, list , Charset.defaultCharset(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        // gravando

        if (removeu == true) ret = true;
        return ret;
    }

    public boolean editarDadosMúsica( int cod, String titulo, String autor, int ano, Path pathDestino) {
        boolean ret = false;
        boolean removeu = false;
        // editando do conjunto
        for (Música m : músicas) {
            if (m.getCod() == cod) {
                m.setTitulo(titulo); m.setAutor(autor); m.setAno(ano);
                removeu = true;
                break;
            }
        }
        if (removeu == false) return false;
        // editando do conjunto

        // gravando
        List<Música> tempMusicalist = new ArrayList<>(músicas);
        List<String> list = new ArrayList<>();
        for (Música m: tempMusicalist) list.add(m.toStringGrava());

        try {
            Files.write(pathDestino, list , Charset.defaultCharset(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        // gravando

        if (removeu == true) ret = true;
        return ret;
    }

    public void gracarMúsicasOrdenadasPor(Path pathDestino, Comparator<Música> comparador) {
        // gravando
        List<Música> tempMusicalist = new ArrayList<>(músicas);
        Collections.sort(tempMusicalist, comparador);
        List<String> list = new ArrayList<>();
        for (Música m: tempMusicalist) list.add(m.toStringGrava());

        try {
            Files.write(pathDestino, list , Charset.defaultCharset(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        // gravando
    }
}
