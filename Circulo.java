public class Circulo {
    private double radio;
    private String color;

    public Circulo() {
        this(0,"blanco") ; //Circulo(0,"blanco"));
    }

    public Circulo(double r) {
        this(r,"blanco");
    }

    public Circulo(double r, String color) {
        this.setRadio(r);
        this.color = color;

    }

    public double obtenerRadio() {
        return this.radio;
    }

    public String obtenerColor() {
        return this.color;
    }

    public double obtenerDiametro(){
        return 2*this.radio;
    }

    public double obtenerPerimetro() {
        return Math.PI * this.obtenerDiametro();
    }

    public double obtenerSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}




