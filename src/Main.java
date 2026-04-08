public class Main {

    static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Ignacio", "Bertola", 19, "Ing. Sistemas", 9.12);
        estudiantes[1] = new Estudiante("Ana", "Gomez", 22, "Derecho", 7.2);
        estudiantes[2] = new Estudiante("Luis", "Martinez", 19, "Medicina", 9.1);

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + " - Promedio: " + estudiantes[i].getPromedio()
            );
        }

        /*
        TODO

           5. Implementa una relación entre **`Carrera`** y **`Estudiante`**:
        - Agrega métodos en la clase `Carrera` para:
        - Agregar un estudiante (`agregarEstudiante`)
        - Mostrar todos los estudiantes (`listarEstudiantes`)
        - Buscar un estudiante por nombre (`buscarEstudiante`)
            6. En el metodo main, demuestra las relaciones creando:
        - Una Carrera
        - Varios estudiantes
        - Varias materias asignadas a los estudiantes
        - Muestra el promedio de cada estudiante
        - Lista todos los estudiantes de la Carrera

         */

    }

}
