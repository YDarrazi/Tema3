import java.util.Scanner;

public class Tarea06 {
    public static void main(String[] args) {
        // Crear arrays con nombres y notas
        String[] nombresAlumnos = new String[3];
        double[] notasAlumnos = new double[3];

        // Pedir datos por teclado
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre del alumno: ");
            nombresAlumnos[i] = scanner.nextLine();
            scanner.nextLine();  // Limpiar el buffer del scanner
             // Solicitar la nota hasta que esté en el rango correcto
    double nota;
    do {
        System.out.print("Introduce la nota del examen para " + nombresAlumnos[i] + ": ");
        nota = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer del scanner

        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10. Intentalo de nuevo.");
        }
    } while (nota < 0 || nota > 10);

    notasAlumnos[i] = nota;
        }

        // Redondear las notas
        double[] notasRedondeadas = redondearNotas(notasAlumnos);

        // Calcular la media de clase
        double mediaClase = calcularMedia(notasAlumnos);

        // Contar aprobados y suspensos
        int[] aprobadosSuspensos = contarAprobadosSuspensos(notasAlumnos);
        int aprobados = aprobadosSuspensos[0];
        int suspensos = aprobadosSuspensos[1];

        // Obtener al alumno con la mayor nota
        int indiceMejorAlumno = obtenerIndiceMejorAlumno(notasAlumnos);
        String mejorAlumno = nombresAlumnos[indiceMejorAlumno];
        double mejorNota = notasRedondeadas [indiceMejorAlumno];

        // Mostrar resultados
        for (int i = 0; i < 3; i++) {
            System.out.println(nombresAlumnos[i] + ": " + notasRedondeadas[i]);
        }

        System.out.println("\nPromedio: " + mediaClase);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Alumno con mayor nota: " + mejorAlumno + " - " + mejorNota);
    }

    // Función para redondear las notas
    private static double[] redondearNotas(double[] notas) {
        double[] notasRedondeadas = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            notasRedondeadas[i] = (notas[i] >= 4 && notas[i] <= 4.9) ? 4 : Math.round(notas[i]);
        }
        return notasRedondeadas;
    }

    // Función para calcular la media de clase
    private static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma +=  nota;
        }
        return Math.round((suma / notas.length) * 100.0) / 100.0;
    }

    // Función para contar aprobados y suspensos
    private static int[] contarAprobadosSuspensos(double[] notas) {
        int aprobados = 0;
        int suspensos = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        return new int[]{aprobados, suspensos};
    }

    // Función para obtener el índice del alumno con la mayor nota
    private static int obtenerIndiceMejorAlumno(double[] notas) {
        int indiceMaxNota = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[indiceMaxNota]) {
                indiceMaxNota = i;
            }
        }
        return indiceMaxNota;
    }
}