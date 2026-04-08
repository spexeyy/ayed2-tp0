import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private ArrayList<Materia> materias;


    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }

        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo o vacio");
        }

        this.apellido = apellido;
        this.nombre = nombre;
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
        this.materias = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setEdad(int edad) {
        if (edad < 16) {
            throw new IllegalArgumentException("La edad de ser mayor a 16");
        }

        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        if (carrera == null || carrera.isBlank()) {
            throw new IllegalArgumentException("La carrera no puede ser nula o vacia");
        }

        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            throw new IllegalArgumentException("El promedio  debe estar entre 0 y 10");
        }

        this.promedio = promedio;
    }

    public void agregarMateria(Materia m) {
        if (m == null) {
            throw new IllegalArgumentException("La materia no puede ser nula");
        }
        materias.add(m);
    }

    public void listarMaterias() {
        if (materias.isEmpty()) {
            System.out.println("No esta matriculado en ninguna materia");
            return;
        }

        for (Materia m : materias) {
            System.out.println(m.getNombre());
        }
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Materia m : materias) {
            suma += m.getCalificacion();
        }

        return (suma / materias.size());

    }
}
