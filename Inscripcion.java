import java.util.Date;

public class Inscripcion {
    private Date fechaInscripcion;
    private float calificacionFinal;
    private Materia materia;

    public Inscripcion(Materia materia) {
        this.materia = materia;
        this.fechaInscripcion = new Date();
        this.calificacionFinal = 0.0f;
    }

    public float calcularPromedio() {
        return calificacionFinal;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public float getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(float calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}