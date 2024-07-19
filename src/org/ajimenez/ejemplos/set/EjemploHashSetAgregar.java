package org.ajimenez.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        List<String> hs = new ArrayList<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        //Collections se usa para ordenar valores
        Collections.sort(hs); // Los set no se pueden ordenar, si es de tipo set = error


        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(hs);

    }
}
