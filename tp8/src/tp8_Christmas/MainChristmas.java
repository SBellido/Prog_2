package tp8_Christmas;
/*3. Navidad
En esta Navidad Papá Noel quiere informatizar su sistema de pedido y distribución de
regalos. Para ello instaló un buzón en cada pueblo o ciudad, para que los niños del mundo
puedan depositar sus cartas. Cada carta posee un remitente y una lista de regalos solicitados
(un regalo es simplemente un String).

Cada niño deposita su carta en el buzón correspondiente a su barrio. Cada buzón tiene
asociado un conjunto de “niños buenos” que pueden dejar su carta en el mismo, identificados
únicamente por su DNI. Los niños que no se encuentran en el listado de niños buenos de un
buzón, se los considera “niños malos”. Si un “niño malo” intenta depositar una carta en el
buzón, la lista de regalos correspondiente se vacía y se reemplaza el regalo por un “Trozo de
carbón”. Si un niño deposita más de una carta en el buzón, solo se considera la primera.
Los buzones se encuentran distribuidos en diferentes barrios, que a su vez se agrupan por
localidad, provincia o estado y país. Adicionalmente, puede haber buzones especiales que no
pertenezcan a un barrio, sino a la localidad, provincia o país directamente (por ejemplo en la
embajada de un país en otro).

Cuando un niño deposita su carta en un buzón, se debe controlar que el mismo se encuentre
en el listado de niños buenos asociado al buzón. Si se cumple esta condición, se guarda la
carta para que luego sea recolectada por Barney y entregada a Papá Noel.
Nota: Todas las cartas recibidas se guardan en el buzón, aunque sean de “niños malos” (en
este caso se debe realizar el reemplazo de regalos como se mencionó anteriormente).

Implementar los siguientes servicios:
1. Dado un buzón, provincia o país, conocer el porcentaje de cartas recibidas que piden un determinado regalo.
2. Dado un buzón, provincia o país, conocer la cantidad de cartas recibidas que piden un determinado regalo.
3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron una carta. 
4. Dado un buzón, provincia o país, conocer la cantidad de total de cartas recibidas.
Aclaración, los porcentajes se calculan como la cantidad de cartas que cumple la condición
dividido el total de cartas recibidas en el buzón, provincia o país, multiplicado por 100.
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
