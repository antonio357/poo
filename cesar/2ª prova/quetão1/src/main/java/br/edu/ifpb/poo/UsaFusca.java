package br.edu.ifpb.poo;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class UsaFusca
{
    public static void main( String[] args ) {


        List<Fusca> lf = Arrays.asList(new Fusca("azul escuro", 2500),
                                        new Fusca("Azul claro", 1900),
                                        new Fusca("azul marinho", 1920));
        Collections.sort(lf);

        for (Fusca f : lf) System.out.println(f);
    }
}
