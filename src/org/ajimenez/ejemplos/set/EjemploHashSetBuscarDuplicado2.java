package org.ajimenez.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "atun","Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        // Los Set No acepta duplicados, los retorna = False
        // Y a los elementos unicos los retorna = True
        // Colecciones desordenadas con elementos unicos
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
