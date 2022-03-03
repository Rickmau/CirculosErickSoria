import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        double radio;
    Circulo objetoCirculo = new Circulo();

    System.out.println("Ingrese el radio");
    radio = data.nextFloat();

    objetoCirculo.setRadio(radio);

    }
}
