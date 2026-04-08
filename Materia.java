public class Materia {

    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

    public Materia(String nombre, String codigo, int creditos) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }

        this.nombre = nombre;
        setCodigo(codigo);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo no puede ser nulo o vacio");
        }

        this.codigo = codigo;
    }

    public void setCreditos(int creditos) {
        if (creditos < 0) {
            throw new IllegalArgumentException("Los creditos no pueden ser negativos");
        }
        this.creditos = creditos;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.calificacion = calificacion;
    }
}
