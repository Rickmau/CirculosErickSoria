import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        double radio;


    System.out.println("Ingrese el radio");
    radio = data.nextFloat();

    Circulo objetoCirculo = new Circulo();
    objetoCirculo.setRadio(radio);
    objetoCirculo.ShowResult(objetoCirculo.area());
    }
}
