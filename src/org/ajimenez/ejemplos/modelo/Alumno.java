package org.ajimenez.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + "nota= " + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        // Asi se desarrolla el algoritmo cuando son tipos primitivos, es más complicado
        if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
        // trata de aprender el algoritmo de Integer.compare, está interesante
        /*if (this.nota == a.nota) {
            return 0;
        }
        if (this.nota > a.nota) {
            return 1;
        } else {
            return -1;
        }
        */

        // Asi se hace cuando son objetos Wrapper
        /*if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(this.nombre, alumno.nombre) && Objects.equals(this.nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
