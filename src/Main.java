public class Main {

    public static void main(String[] args) {
        Carrera sistemas = new Carrera();

        Estudiante ignacio = new Estudiante("Miguel", "Bertola", 20, "Ing. Mecatronica", 7);
        sistemas.agregarEstudiante(ignacio);

        Materia analisisMat = new Materia("Analisis Matematico", "129DF", 40);

        ignacio.agregarMateria(analisisMat);

        System.out.println(ignacio.getCarrera());
        ignacio.listarMaterias();
    }


    }
