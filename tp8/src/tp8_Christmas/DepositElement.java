package tp8_Christmas;

public interface DepositElement {
	
//	1. Dado un buz�n, provincia o pa�s, conocer el porcentaje 
//	de cartas recibidas que piden un determinado regalo.
	double percentageLetters(String present);
	
//	2. Dado un buz�n, provincia o pa�s, conocer la cantidad de 
//	cartas recibidas que piden un determinado regalo.
	int countLetters(String present );
	
//	3. Dado un buz�n, provincia o pa�s, conocer 
//	la cantidad de ni�os malos que enviaron una carta. 
	int countBadKids();
	
//	4. Dado un buz�n, provincia o pa�s, conocer 
//	la cantidad de total de cartas recibidas.
	int countLetters();
	
}
