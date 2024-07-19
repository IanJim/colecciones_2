package org.ajimenez.ejemplos.list;

import org.ajimenez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Métodos más importantes del ArrayList y LinkedList
        List<Alumno> al = new ArrayList<>();
        // List<Alumno> sa = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato ", 5));
        al.add(new Alumno("Cata ", 6));
        al.add(new Alumno("Luci ", 4));
        // Método añadir
        al.add(2, new Alumno("Jano ", 7));
        // Método remplazar un elemento con otro
        al.set(3, new Alumno("Andres ", 3));

        System.out.println(al + ", size = " + al.size());

        // Método eliminar por Object o instancia
        // El remove utiliza el equals para comparar los objetos
        al.remove(new Alumno("Jano ", 7));
        // Método remover por índice
        // al.remove(0);

        System.out.println(al + ", size = " + al.size());

        // Método contains también usa el equals
        boolean b = al.contains(new Alumno("Cata ", 6));
        System.out.println("La lista contiene a Cata = " + b);

        // Aqui podemos convertir la lista en arreglo
        System.out.println("Esta es la lista en forma de arreglo");
        Object[] a = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }

    }
}
