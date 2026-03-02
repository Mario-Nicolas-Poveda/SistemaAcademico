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
}
