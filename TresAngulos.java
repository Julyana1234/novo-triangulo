
public class TresAngulos implements  Bidimensional{
	public Bidimensional criarFigura(String tipo) {
		if(tipo.equals("equilatero"))	
			return (Bidimensional) new Triangulo1();
		else if(tipo.equals("escaleno"))
			return (Bidimensional) new Triangulo1(2, 2, 2);
		else if(tipo.equals("isosceles"))
			return (Bidimensional) new Triangulo1(4, 4, 2);
		
		throw new IllegalArgumentException("Tipo inexistente");
	}
}
