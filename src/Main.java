
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Carrera sistemas = new Carrera();

        List estudiantes = new ArrayList<Estudiante>();

        Estudiante ignacio = new Estudiante(
                "Ignacio",
                "Bertola",
                19,
                "Ing. Sistemas",
                9.12
        );

        estudiantes.add(ignacio);
        sistemas.agregarEstudiante(ignacio);

        Materia analisisMat = new Materia(
                "Analisis Matematico",
                "129DF",
                40);

        Materia algoritmos = new Materia(
                "Algoritmos 2",
                "1231D",
                50
        );

        ignacio.agregarMateria(algoritmos);
        ignacio.agregarMateria(analisisMat);

        System.out.println("Nombre: " + ignacio.getNombre());
        System.out.println("Carrera: " + ignacio.getCarrera());

        System.out.println("Materias:");
        ignacio.listarMaterias();
    }


    }
