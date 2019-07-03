package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparadorArtista implements Comparator<Música> {
    @Override
    public int compare(Música o1, Música o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
