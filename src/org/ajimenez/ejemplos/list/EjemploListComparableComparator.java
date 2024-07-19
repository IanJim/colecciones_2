package org.ajimenez.ejemplos.list;

import org.ajimenez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new LinkedList<>();
        // List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato ", 5));
        sa.add(new Alumno("Cata ", 6));
        sa.add(new Alumno("Luci ", 4));
        sa.add(new Alumno("Jano ", 7));
        sa.add(new Alumno("Andres ", 3));
        sa.add(new Alumno("Zeus2 ", 2));
        sa.add(new Alumno("Zeus ", 2));
        sa.add(new Alumno("Lucas ", 2));
        sa.add(new Alumno("Lucas ", 3));

        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        // sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        // sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}
