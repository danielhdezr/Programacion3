package Diseños;

public class Obstaculo {

	int x,y,altura,anchura;
	String color;

	public Obstaculo (int x, int y, int altura, int anchura, String color)
	{
		this.x=x;
		this.y=y;
		this.altura=altura;
		this.anchura=anchura;
		this.color=color;		

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public static boolean detectarColision(Obstaculo player, Obstaculo[] obstaculos) {
        for (Obstaculo obstaculo : obstaculos) {
        	
            if (player.getX() < obstaculo.getX() + obstaculo.getAltura() && player.getX() + player.getAltura() > obstaculo.getX() &&
                player.getY() < obstaculo.getY() + obstaculo.getAnchura() && player.getY() + player.getAnchura() > obstaculo.getY()) {
                return true; // Hay colisión
            }
        }
        return false; // No hay colisión
    }
}
