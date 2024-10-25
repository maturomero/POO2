public class Juego{

private int vida;
private int guardardar_vida;

public Juego(int vida){
    this.vida = vida;
    this.guardardar_vida = vida;
}

public int mostrarVidas(){

    return this.vida;
}


public boolean quitarVida(){
    vida--;
    return  vida == 0;
}
public void Reiniciar(){
    vida = guardardar_vida;
}
}
