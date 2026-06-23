package caso3;

public class Caso3Sobrecarga {

  public static void main(String[] args) {

    Operacion op = new Operacion();

    System.out.println(op.sumar(10, 20));
    System.out.println(op.sumar(5.5, 3.2));
    System.out.println(op.sumar(10, 20, 30));
  }
}