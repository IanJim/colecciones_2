package org.ajimenez.ejemplos.set;

import org.ajimenez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // HashSet compara los objetos apuntan a la misma direccion de memoria
        // si los objetos apuntan a la misma direccion entonces muestra solo un objeto
        Set<Alumno> sa = new HashSet<>();
        // List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pato ", 5));
        sa.add(new Alumno("Cata ", 6));
        sa.add(new Alumno("Luci ", 4));
        sa.add(new Alumno("Jano ", 7));
        sa.add(new Alumno("Andres ", 3));
        sa.add(new Alumno("Zeus2 ", 2));
        sa.add(new Alumno("Zeus ", 2));
        sa.add(new Alumno("Lucas ", 2));
        sa.add(new Alumno("Lucas ", 3));

        System.out.println(sa);

        /*
        // Collections.sort(sa); // Este for es para ArrayList o LinkedList
        System.out.println("Utilizando un for clasico");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i); // El get(i) solo está en los ArrayLis y LinkedList, en los Set no están y marcarán error
            System.out.println(a.getNombre());
        }
        */

        //"Estas son dos formas típicas para iterar en un Set, mediante for"
        System.out.println("Iterando usando un foreach");
        for (Alumno a :
                sa) {
            System.out.println(a.getNombre());
        }

        // "Todo Collection tiene un iterator"
        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        // Esta forma es mediante un foreach, usando expresiones lambda
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}
