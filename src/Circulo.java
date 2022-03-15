public class Circulo {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(){
        this.radio = radio;
    }

    //Area
    public double area(){
        double area = 3.1416 * Math.pow(radio,2);
        return area;
    }

    public void ShowResult(double area){
        System.out.println("\nEl area del círculo es: " + area);
    }
}
