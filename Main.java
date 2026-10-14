// Clase que representa a un estudiante
class Estudiante {

    // Atributos del estudiante
    String nombre;
    String matricula;
    double calificacion;

    // Constructor para inicializar los datos del estudiante
    Estudiante(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información del estudiante
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para determinar si el estudiante aprobó
    void verificarAprobacion() {
        if (calificacion >= 70) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: NO APROBADO");
        }
    }
}

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Creación de objetos de la clase Estudiante
        Estudiante estudiante1 =
                new Estudiante("Jennifer Soto", "2026001", 95);

        Estudiante estudiante2 =
                new Estudiante("Carlos Garcia", "2026002", 65);

        // Mostrar información y estado del primer estudiante
        System.out.println("===== ESTUDIANTE 1 =====");
        estudiante1.mostrarInformacion();
        estudiante1.verificarAprobacion();

        System.out.println();

        // Mostrar información y estado del segundo estudiante
        System.out.println("===== ESTUDIANTE 2 =====");
        estudiante2.mostrarInformacion();
        estudiante2.verificarAprobacion();
    }
}
