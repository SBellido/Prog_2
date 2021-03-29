package tp8_Christmas;
/*3. Navidad
En esta Navidad Pap� Noel quiere informatizar su sistema de pedido y distribuci�n de
regalos. Para ello instal� un buz�n en cada pueblo o ciudad, para que los ni�os del mundo
puedan depositar sus cartas. Cada carta posee un remitente y una lista de regalos solicitados
(un regalo es simplemente un String).

Cada ni�o deposita su carta en el buz�n correspondiente a su barrio. Cada buz�n tiene
asociado un conjunto de �ni�os buenos� que pueden dejar su carta en el mismo, identificados
�nicamente por su DNI. Los ni�os que no se encuentran en el listado de ni�os buenos de un
buz�n, se los considera �ni�os malos�. Si un �ni�o malo� intenta depositar una carta en el
buz�n, la lista de regalos correspondiente se vac�a y se reemplaza el regalo por un �Trozo de
carb�n�. Si un ni�o deposita m�s de una carta en el buz�n, solo se considera la primera.
Los buzones se encuentran distribuidos en diferentes barrios, que a su vez se agrupan por
localidad, provincia o estado y pa�s. Adicionalmente, puede haber buzones especiales que no
pertenezcan a un barrio, sino a la localidad, provincia o pa�s directamente (por ejemplo en la
embajada de un pa�s en otro).

Cuando un ni�o deposita su carta en un buz�n, se debe controlar que el mismo se encuentre
en el listado de ni�os buenos asociado al buz�n. Si se cumple esta condici�n, se guarda la
carta para que luego sea recolectada por Barney y entregada a Pap� Noel.
Nota: Todas las cartas recibidas se guardan en el buz�n, aunque sean de �ni�os malos� (en
este caso se debe realizar el reemplazo de regalos como se mencion� anteriormente).

Implementar los siguientes servicios:
1. Dado un buz�n, provincia o pa�s, conocer el porcentaje de cartas recibidas que piden un determinado regalo.
2. Dado un buz�n, provincia o pa�s, conocer la cantidad de cartas recibidas que piden un determinado regalo.
3. Dado un buz�n, provincia o pa�s, conocer la cantidad de ni�os malos que enviaron una carta. 
4. Dado un buz�n, provincia o pa�s, conocer la cantidad de total de cartas recibidas.
Aclaraci�n, los porcentajes se calculan como la cantidad de cartas que cumple la condici�n
dividido el total de cartas recibidas en el buz�n, provincia o pa�s, multiplicado por 100.
 */
public class MainChristmas {

	public static void main(String[] args) {
		LettersDepositComposite tandil = new LettersDepositComposite("Tandil");
		LettersDepositSimple buzon = new LettersDepositSimple();
		LettersDepositSimple buzon1 = new LettersDepositSimple();
		
		Kid ninioPascual = new Kid("Pascual", true, buzon);
		Kid ninioPaco = new Kid("Paco", true, buzon);
		Kid ninioJuan = new Kid("Juan", true, buzon1);
		Kid ninioSalvador = new Kid("Salvador", true, buzon1);
		Kid ninioSantiago = new Kid("Santiago", false, buzon);
		
		buzon.addGoodKid(ninioPascual);
		buzon.addGoodKid(ninioPaco);
		buzon.addGoodKid(ninioSantiago);
		buzon1.addGoodKid(ninioJuan);
		buzon1.addGoodKid(ninioSalvador);
		
		tandil.addDeposit(buzon);
		tandil.addDeposit(buzon1);
		
		ninioPascual.writeLetter("Caballito de madera");
		ninioPascual.depositLetter();

		ninioSalvador.writeLetter("Computadora");
		ninioSalvador.depositLetter();
		
		ninioSantiago.writeLetter("PS4");
		ninioSantiago.depositLetter();
		
		ninioPaco.writeLetter("PS4");
		ninioPaco.depositLetter();
		
		ninioJuan.writeLetter("PS4");
		ninioJuan.depositLetter();
//		
//		System.out.println(tandil.countLetters("Computadora"));
//		System.out.println(tandil.percentageLetters("Computadora")+"%");
		System.out.println(tandil.countLetters());
		System.out.println(tandil);
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
