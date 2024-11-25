package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();

		
	//Primero genera la baraja entera, seleccionando los palos uno a uno y creando sus 13 cartas correspondientes.
		for (int i = 0; i < suits.length; i++) {  //Este for selecciona el palo, que en este caso son 4, por lo que se repite 4 veces
			for (int j = 0; j < values.length; j++) { //Selecciona las cartas, se repite 13 veces por que son 13 cartas por palo.
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		//Aquí baraja de forma aleatoria las cartas que se guardan en "deck".
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Esto escoge 5 cartas aleatorias de la baraja almacenada y las reparte.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
