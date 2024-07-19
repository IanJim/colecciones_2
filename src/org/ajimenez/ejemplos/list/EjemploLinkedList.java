package org.ajimenez.ejemplos.list;

import org.ajimenez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {


        // Métodos más importantes para trabajar los elementos en pila y en la cola
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato ", 5));
        enlazada.add(new Alumno("Cata ", 6));
        enlazada.add(new Alumno("Luci ", 4));
        enlazada.add(new Alumno("Jano ", 7));
        enlazada.add(new Alumno("Andres ", 3));

        // System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus ", 5));
        enlazada.addLast(new Alumno("Atenea ", 6));
        // System.out.println(enlazada + ", size = " + enlazada.size());

        // Son formas de manipular los primeros y/o ultimos elementos de una lista
        // enlazada.getFirst();
        // enlazada.getLast();
        // enlazada.peekFirst();
        // enlazada.peekLast();
        // enlazada.pollFirst();
        // enlazada.pollLast();
        // enlazada.pop();
        // enlazada.get(2);
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano ", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas ", 5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice Lucas = " + enlazada.indexOf(a));

        // Con el set reemplazamos a Lucas poniendo a Lalo a través de su índice
        enlazada.set(3, new Alumno("Lalo ", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        // List iterator

        System.out.println(" ------------- Has Next");
        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println(" ------------- Previous");
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }



    }
}
