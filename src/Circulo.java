public class Circulo {

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double radio;


    //Area
    double area(){
        double area = 3.1416 * Math.pow(radio,2);
        return 0;
    }
}
