package com.senac.jogos.cartas;

public class Baralho {

	private Carta[] cartas;
	private int numCartas;
	
	public Baralho(){
		char[] naipes ={'C','O','P','E'};
		int[] numeros={1,2,3,4,5,6,7,8,9,10,11,12,13};
		numCartas= 0;
		cartas = new Carta[52];
		for(char naipe:naipes){
			for(int numero:numeros){
				cartas[i]=new Carta(numero,naipe);
				numCartas++;
			}
		}
		
	}
	public Carta drowCarta(){
		Carta carta = null;
		
		
		int indice=(int)(Math.random())* numCartas;
		carta=cartas[indice];
		numCartas--;
		
		cartas[indice] = cartas[numCartas];
		
		return carta;
		
	}
}
