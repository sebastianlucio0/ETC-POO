public class Main {
    public static void main(String[] args) {
        Materia mat1 = new Materia("POO1", "Programacion Orientada a Objetos", 5);

        Estudiante est1 = new Estudiante("1", "Sebastian", "sebastian@upq.edu.mx", "ITTID");

        est1.consultarCalificaciones();

        est1.inscribirMateria(mat1);

        est1.getInscripciones().get(0).setCalificacionFinal(9.5f);

        est1.consultarCalificaciones();
    }
}