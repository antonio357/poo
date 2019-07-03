package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparadorAno implements Comparator<Música> {
    @Override
    public int compare(Música o1, Música o2) {
        return Integer.compare(o1.getAno(), o2.getAno());
    }
}
