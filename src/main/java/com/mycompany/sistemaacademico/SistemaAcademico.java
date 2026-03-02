/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Jose Rodriguez
 */
public class SistemaAcademico {
    static ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         registrarAsignatura();
         listarAsignaturas();

        System.out.print("Código a buscar: ");
        String codigo = sc.nextLine();
        Asignatura encontrada = buscarAsignatura(codigo);

        if (encontrada != null) {
            System.out.println("Asignatura encontrada: " + encontrada);
        } else {
            System.out.println("No encontrada.");
        }
        actualizarAsignatura();

        
}
    public static void registrarAsignatura() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Créditos: ");
        int creditos = sc.nextInt();
        sc.nextLine();

        listaAsignaturas.add(new Asignatura(codigo, nombre, creditos));
        System.out.println("Asignatura registrada correctamente.");
    }
    public static void listarAsignaturas() {
        if (listaAsignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }
        for (Asignatura a : listaAsignaturas) {
            System.out.println(a);
        }
    }

    public static Asignatura buscarAsignatura(String codigo) {
        for (Asignatura a : listaAsignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }
    public static void actualizarAsignatura() {
        System.out.print("Código de la asignatura a actualizar: ");
        String codigo = sc.nextLine();

        Asignatura a = buscarAsignatura(codigo);
        if (a == null) {
            System.out.println("Asignatura no encontrada.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        a.setNombre(sc.nextLine());

        System.out.print("Nuevos créditos: ");
        a.setCreditos(sc.nextInt());
        sc.nextLine();

        System.out.println("Asignatura actualizada.");
    }
}
