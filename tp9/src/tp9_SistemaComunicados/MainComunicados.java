package tp9_SistemaComunicados;
/*
 * 4. Sistema de Comunicados
Una peque�a empresa de Software desea organizar su forma de comunicaci�n entre los empleados de la oficina.

El sistema debe permitir que se env�en comunicaciones entre empleados o entre Grupos de
empleados. Por ejemplo, Juan puede enviar una notificaci�n simult�neamente a Carlos, a Roberto, a
un grupo llamado �Proyecto 1�, y a un grupo llamado �Programadores�. En un grupo pueden
coexistir personas e incluso otros grupos. Por ejemplo, en el grupo llamado �Programadores� est�
Roberto, y los grupos llamados �Programadores JAVA� y �Programadores .Net�. De cada
empleado se guarda su nombre, apellido y n�mero de legajo.

Una notificaci�n es un mensaje el cual b�sicamente es una lista de palabras, la persona que lo envi�
y la fecha en que se envi�. Cuando se env�a una notificaci�n a una persona, est� la guarda en un
listado de notificaciones (Como una persona puede estar en m�ltiples grupos se debe controlar que
�sta no posea ya la notificaci�n). Cuando se env�a una notificaci�n a un grupo, la notificaci�n se
propaga a cada uno de los integrantes del grupo. Los grupos no guardan la notificaci�n.

La empresa desea que se pueda poner un l�mite a las notificaciones. De esta forma, por ejemplo, en
el grupo llamado �Programadores Java�, solo se propaga un mensaje si el mismo contiene la palabra
JAVA o JDK. En el caso de �Programadores .Net� ocurre algo similar: debe estar la palabra Net
dentro del mensaje. Existen grupos m�s selectivos en los cuales la propagaci�n depende del largo
del mensaje (s�lo se propaga un mensaje si el mismo contiene menos de 10 palabras) o tambi�n que
solo un empleado es el que puede enviar el mensaje (por ejemplo el mensaje se propaga al grupo
solo si lo envi� �Jorge�).

El sistema debe ser capaz de responder a las siguientes consultas:

1. Obtener la cantidad de empleados que posee un grupo, si hay repetidos (un empleado
puede pertenecer a varios grupos) se los debe contar todas las veces.

2. Devolver un listado de empleados (sin repetidos), ordenado ascendentemente por la
cantidad de mensajes recibidos.

3. Modificar la forma en la que un grupo limita las notificaciones. Por ejemplo, ahora el
grupo �Programadores JAVA� acepta los mensajes si tienen la palabra JAVA o la
palabra JDK y tengan menos de 25 palabras.

4. Un listado de empleados (sin repetidos) que dentro de las notificaciones recibidas tenga
alguna que posea la palabra MATRIX, ordenado ascendentemente por edad.

5. Un listado de empleados (sin repetidos), que dentro de sus notificaciones tengan alguna
con menos de 15 palabras.

6. La cantidad de mensajes total que posee un grupo (no se distinguen repetidos). La
cantidad de mensajes de un grupo es la suma de la cantidad de mensajes de sus
integrantes
 */
public class MainComunicados {

	public static void main(String[] args) {
		Empleado juan = new Empleado("Juan", "P�rez", 45);
		Empleado pedro = new Empleado("Pedro", "G�mez", 45);
		Empleado jose = new Empleado("Jos�", "Garc�a", 45);
		Empleado maria = new Empleado("Mar�a", "Contreras", 45);
		
		CriterioCantidadPalabras criteriosCantidadPalabras = new CriterioCantidadPalabras(6);
		CriterioPalabra criterioPalabra = new CriterioPalabra("java");
		CriterioPalabra criterioPalabra1 = new CriterioPalabra("jdk");
		CriterioAnd criterioAnd = new CriterioAnd(criterioPalabra, criteriosCantidadPalabras);
		CriterioOr criteriOr = new CriterioOr(criterioPalabra, criterioPalabra1);
		CriterioRemitente criterioRemitente = new CriterioRemitente(maria);
		
		DestinatarioCompuesto grupoProgramadores = new DestinatarioCompuesto("Programadores", criterioRemitente);
		DestinatarioCompuesto grupoCocineros = new DestinatarioCompuesto("Cocineros", criterioPalabra);
		DestinatarioCompuesto grupoProgramadoresCocineros = new DestinatarioCompuesto("Cocineros", criterioPalabra);
		
		grupoProgramadores.agregarDestinatario(maria);
		grupoProgramadores.agregarDestinatario(pedro);
		grupoProgramadores.agregarDestinatario(jose);
		grupoProgramadores.agregarDestinatario(juan);
		grupoProgramadores.agregarDestinatario(juan);
		
		grupoCocineros.agregarDestinatario(maria);
		grupoCocineros.agregarDestinatario(juan); 
		
		grupoProgramadoresCocineros.agregarDestinatario(grupoCocineros);
		grupoProgramadoresCocineros.agregarDestinatario(grupoProgramadores);
	
		
		maria.enviarNotificacion("Estamos aprendiendo mucho java", grupoProgramadores);
		maria.enviarNotificacion("Estamos aprendiendo mucho java", juan);
		maria.enviarNotificacion("Mensaje privado para vos", juan);
		maria.enviarNotificacion("Mensaje privado es mas largo", juan);
		maria.enviarNotificacion("Mensaje", juan);
		maria.enviarNotificacion("Mensaje privado para que recuerdes cuanto te quiero", jose);
		juan.enviarNotificacion("Mensaje qe nada tiene que ver con esto pero necesito sumar palabras", jose);
		jose.enviarNotificacion("Mensaje privado corto", maria);
		juan.enviarNotificacion("Mensaje privado", pedro);
		
//		System.out.println(grupoProgramadores);
		System.out.println(grupoProgramadores.listarEmpleados());
		System.out.println(grupoProgramadores.contarNotificaciones());
		System.out.println("\nLista por criterio "+grupoProgramadores.listarPorCriterio(criteriosCantidadPalabras));
		System.out.println("Total: "+grupoProgramadoresCocineros.contarEmpleados());
	}

}
