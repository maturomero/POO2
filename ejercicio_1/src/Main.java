public class Main {
    public static void main(String[] args){
        Juego juego = new Juego(5);
        Juego juego2 = new Juego(5);
        System.out.println(juego.mostrarVidas());
        juego.quitarVida();
        juego.quitarVida();
        juego.quitarVida();
        System.out.println(juego.quitarVida());
        System.out.println(juego.quitarVida());
        System.out.println("La cantidad de vidas de jugador uno es: " + juego.mostrarVidas());
        juego.Reiniciar();
        System.out.println(juego.mostrarVidas());
        System.out.println("La cantidad de vidas del segundo jugador es: " + juego2.mostrarVidas());

    }
    }