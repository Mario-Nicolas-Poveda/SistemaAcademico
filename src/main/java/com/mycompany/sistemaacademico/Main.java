/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Mario
 */
public class Main {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("SISTEMA ACADEMICO");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Actualizar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Registrar asignatura");
            System.out.println("7. Listar asignaturas");
            System.out.println("8. Buscar asignatura");
            System.out.println("9. Actualizar asignatura");
            System.out.println("10. Eliminar asignatura");
            System.out.println("11. Registrar nota");
            System.out.println("12. Listar notas");
            System.out.println("13. Buscar nota");
            System.out.println("14. Actualizar nota");
            System.out.println("15. Eliminar nota");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> registrarEstudiante();
                case 2 -> listarEstudiantes();
                case 3 -> buscarEstudiante();
                case 4 -> actualizarEstudiante();
                case 5 -> eliminarEstudiante();
                case 6 -> registrarAsignatura();
                case 7 -> listarAsignaturas();
                case 8 -> buscarAsignatura();
                case 9 -> actualizarAsignatura();
                case 10 -> eliminarAsignatura();
                case 11 -> registrarNota();
                case 12 -> listarNotas();
                case 13 -> buscarNota();
                case 14 -> actualizarNota();
                case 15 -> eliminarNota();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Error, intente de nuevo");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void registrarEstudiante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Registrar Estudiante");
        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Semestre: ");
        int semestre = sc.nextInt();
        sc.nextLine();

        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, edad, semestre);
        estudiantes.add(estudiante);

        System.out.println("El estudiante fue registrado");
    }
    private static void listarEstudiantes() {}
    private static void buscarEstudiante() {}
    private static void actualizarEstudiante() {}
    private static void eliminarEstudiante() {}
    private static void registrarAsignatura() {}
    private static void listarAsignaturas() {}
    private static void buscarAsignatura() {}
    private static void actualizarAsignatura() {}
    private static void eliminarAsignatura() {}
    private static void registrarNota() {}
    private static void listarNotas() {}
    private static void buscarNota() {}
    private static void actualizarNota() {}
    private static void eliminarNota() {}
}
    