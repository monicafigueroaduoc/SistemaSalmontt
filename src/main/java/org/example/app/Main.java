package org.example.app;

import org.example.model.Persona;
import org.example.model.Direccion;
import org.example.model.Contrato;

/**
 * Clase principal del sistema {@code SistemaSalmontt}.
 * <p>
 * Contiene el método main  que instancia objetos de tipo {@link Direccion} y {@link Contrato}
 * para demostrar la relación de composición entre ellos.
 * @author Mónica Figueroa
 * @version 1.0
 */

public class Main {
    /**
     * Método principal que ejecuta el programa.
     * <p>
     * Crea objetos de las clases del paquete model y muestra sus datos por consola.
     * @param args  Datos que puede recibir el programa al iniciarse
     * pero que en este caso no se usan.
     */
    public static void main(String[] args) {
        //Crear direcciones
        Direccion dir1 = new Direccion("Calle Los Pinos", 500, "Puerto Varas",
                "Puerto Varas", "Region de Los lagos", "5550000");
        Direccion dir2 = new Direccion("Calle Caupolicán", 2600 , "Puerto Montt",
                "Puerto Montt", "Region de Montt", "5480000");
        Direccion dir3 = new Direccion("Camino Real", 50, "Puerto Varas",
                "Puerto Varas", "Region de Los Lagos",  "5550000");

        //Crear contratos
        Contrato cont1 = new Contrato("Indefinido", "Encargada de RRHH & Remuneraciones", 1800000);
        Contrato cont2 = new Contrato("Indefinido", "Supervisor de Mantencion de Planta", 900000);
        Contrato cont3 = new Contrato("Indefinido", "Analista de Control de Calidad", 1200000);

        //Crear personas (Composición)
        Persona per1 = new Persona("Ximena", "Molina", "9.258.123-k", "ximena.molina@salmontt.cl",
               "+56 9 7896 2356" , dir1, cont1);
        Persona per2 = new Persona("Pedro", "Bujes", "20.456.723-2", "pedro.bujes@salmontt.cl",
                "+56 9 5462 7892", dir2, cont2);
        Persona per3 = new Persona("Diego", "Pereira", "8.265.478", "diego.pereira@salmontt.cl",
                "+56 9 2546 5546", dir3, cont3);

        //Mostrar por consola
        System.out.println("=== Registro de Personal Salmontt===\n");
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);


    }
}
