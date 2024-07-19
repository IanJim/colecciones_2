package org.ajimenez.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        /*
              Elementos ordenados
         El Set es una interfaz
         Hay varias formas de acomodar por orden los elementos
         estas son las mas simplificadas, la primera es por programacion
         funcional, y la siguente de los elementos de numeros es por una
         propiedad que es Comparator.reverseOrder()
        */
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

        /*                 <REGLA>
         Con el TreeSet aplica el orden de los elementos
         Los elementos que van en el TreeSet tienen que
         implementar el contrato de la interfaz comparable ".compareTo()"
        */
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);

    }
}
