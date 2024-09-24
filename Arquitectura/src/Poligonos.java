/**
 La clase poligono es una subclase de la clase "figuras" que representan un polígono con atributos adicionales relacionados con sus dimensiones y características.
 */
public class Poligonos extends figuras{
    double puntoFin;
    double puntoOrigen;
    double longitud;
    int area;
    double [] lados;

    /**
     Constructor que inicializa un nuevo objeto Poligonos con los atributos
     heredados de la clase `Figuras` y los atributos específicos de la clase Poligonos.
     */
    public Poligonos(int identificador, String nombre, String color, double area, double perimetro, String tipofigura, int numeroLineas, double puntoFin, double puntoOrigen, double longitud, int area1) {
        super(identificador, nombre, color, area, perimetro, tipofigura, numeroLineas);
        this.puntoFin = puntoFin;
        this.puntoOrigen = puntoOrigen;
        this.longitud = longitud;
        this.area = area1;
    }
/*
    public calcularPerimetroPoligonos() {
        double perimetro = 0.0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;

    }
  */

}
