package caso5;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso5ListaEstudiantes {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> estudiantes = new ArrayList<>();

    try {

      System.out.print("¿Cuántos estudiantes desea ingresar?: ");
      int cantidad = sc.nextInt();
      sc.nextLine();

      for (int i = 0; i < cantidad; i++) {

        System.out.print("Nombre del estudiante " + (i + 1) + ": ");
        String nombre = sc.nextLine();

        estudiantes.add(nombre);
      }

      System.out.println("\nLista de estudiantes:");

      for (String estudiante : estudiantes) {
        System.out.println(estudiante);
      }

    } catch (Exception e) {
      System.out.println("Error: Debe ingresar un número válido.");
    }

    sc.close();
  }
}