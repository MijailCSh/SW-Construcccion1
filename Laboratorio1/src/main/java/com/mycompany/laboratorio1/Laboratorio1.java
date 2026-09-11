package com.mycompany.laboratorio1;

import java.util.Scanner;

public class Laboratorio1 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int acumulador = 0;
        
        while(acumulador<=0){
            System.out.print("Ingrese el numero de especialidades: ");
            acumulador = escaner.nextInt(); 
        }
        
        Especialidad[] especialidades = new Especialidad[acumulador];
        
        for(int i=0; i<acumulador; i++){
            System.out.print("Ingrese el codigo de la especialidad: ");
            especialidades[i].setCodigoEspecialidad(escaner.nextLine());
            System.out.print("Ingrese el nombre de la especialidad: ");
            especialidades[i].setNombreEspecialidad(escaner.nextLine());
        }
        
        while(acumulador<=0){
            System.out.print("Ingrese el numero de cursos: ");
            acumulador = escaner.nextInt(); 
        }
        
        Curso[] cursos = new Curso[acumulador];
        
        for(int i=0; i<acumulador; i++){
            System.out.print("Ingrese el codigo del curso: ");
            cursos[i].setCodigoCurso(escaner.nextLine());
            System.out.print("Ingrese el nombre del curso: ");
            cursos[i].setNombreCurso(escaner.nextLine());
            System.out.print("Ingrese el numero de creditos del curso: ");
            cursos[i].setCreditosCurso(escaner.nextInt());
        }
        
        while(acumulador<=0){
            System.out.print("Ingrese el numero de alumnos: ");
            acumulador = escaner.nextInt(); 
        }
        
        Alumno[] alumnos = new Alumno[acumulador];
        
        for(int i=0; i<acumulador; i++){
            System.out.print("Ingrese el codigo del alumno: ");
            alumnos[i].setCodigoAlumn(escaner.nextLine());
            System.out.print("Ingrese los nombres del alumno: ");
            alumnos[i].setNombres(escaner.nextLine());
            System.out.print("Ingrese los apellidos del alumno: ");
            alumnos[i].setApellidos(escaner.nextLine());
            System.out.print("Ingrese el dni del alumno: ");
            alumnos[i].setDni(escaner.nextLine());
            System.out.print("Ingrese el ciclo relativo del alumno: ");
            alumnos[i].setCicloRel(escaner.nextInt());
            System.out.print("Ingrese los creditos permitidos del alumno: ");
            alumnos[i].setCredPer(escaner.nextInt());
            System.out.print("Ingrese el codigo de la especialidad del alumno: ");
        }

        while(acumulador<=0){
            System.out.print("Ingrese el numero de docentes: ");
            acumulador = escaner.nextInt(); 
        }
        
        Docente[] docentes = new Docente[acumulador];
        
        for(int i=0; i<acumulador; i++){
            System.out.print("Ingrese el codigo del docente: ");
            System.out.print("Ingrese los nombres del docente: ");
            System.out.print("Ingrese los apellidos del docente: ");
            System.out.print("Ingrese el dni del docente: ");
        }        
    }
}
