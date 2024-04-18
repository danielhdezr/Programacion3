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

	public static boolean detectarColision(int x1, int y1, int width1, int height1,int x2, int y2, int width2, int height2) {
		return !(x1 > x2 + width2 || x1 + width1 < x2 || y1 > y2 + height2 || y1 + height1 < y2);
	}
}
