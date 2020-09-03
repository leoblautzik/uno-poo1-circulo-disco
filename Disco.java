public class Disco {

    private Circulo parteDeAdentro;
    private Circulo parteDeAfuera;

    public Disco(double ri, double re) {
        if(ri<re) {		
            this.parteDeAdentro = new Circulo(ri);
            this.parteDeAfuera = new Circulo(re,"celeste");
        }
        else {
            this.parteDeAdentro = new Circulo(re);
            this.parteDeAfuera = new Circulo(ri,"celeste");
        }
    }

    public double obtenerRadioInterior() {
        return this.parteDeAdentro.obtenerRadio();
    }
    public double obtenerRadioExterior() {
        return this.parteDeAfuera.obtenerRadio();
    }

    public double obtenerPerimetroExterior() {
        return this.parteDeAfuera.obtenerPerimetro();
    }

    public double obtenerPerimetroInterior() {
        return this.parteDeAdentro.obtenerPerimetro();
    }

    public double obtenerSuperficie() {
        return this.parteDeAfuera.obtenerSuperficie()-
            this.parteDeAdentro.obtenerSuperficie();
    }

    public void cambiarRadioInterior(double nuevoRadio) {
        this.parteDeAdentro.setRadio(nuevoRadio);
    }
    public void cambiarRadioExterior(double nuevoRadio) {
        this.parteDeAfuera.setRadio(nuevoRadio);
    }
}
