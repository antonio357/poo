package poo.code;

import java.util.Comparator;

public class Comparador implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2) * -1;
    }
}
