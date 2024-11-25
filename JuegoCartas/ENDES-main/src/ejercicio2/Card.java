package ejercicio2;

public class Card {

	//Aquí se guardan los datos de los palos y el valor de las cartas
	public String suit; //Palos
	public String value; //Número de cartas
	
	public Card (String suit, String value) { //modifica los valores de los palos y las cartas para crear la baraja
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () { //Este metodo añade el guión al string para que se vea por pantalla.
		return (this.suit+"-"+this.value);
	}
}
