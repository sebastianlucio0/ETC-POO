import java.util.ArrayList;

public class Estudiante {
    private String idEstudiante;
    private String nombre;
    private String correo;
    private String carrera;
    private ArrayList<Inscripcion> inscripciones;

    public Estudiante(String idEstudiante, String nombre, String correo, String carrera) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirMateria(Materia materia) {
        Inscripcion ins = new Inscripcion(materia);
        inscripciones.add(ins);
        System.out.println("Materia inscrita: " + materia.getNombre());
    }

    public void consultarCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (int i = 0; i < inscripciones.size(); i++) {
            Inscripcion ins = inscripciones.get(i);
            System.out.println("- " + ins.getMateria().getNombre() + ": " + ins.getCalificacionFinal());
        }
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
}