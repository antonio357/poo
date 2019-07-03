package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Música> {
    @Override
    public int compare(Música o1, Música o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
