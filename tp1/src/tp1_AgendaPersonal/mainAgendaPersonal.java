package tp1_AgendaPersonal;

import java.util.Date;

/**
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse d�nde ocurrir� la reuni�n, quienes van a participar de ella, el
tema que van a tratar y la duraci�n de la misma. Asimismo, deben registrarse lo
contactos telef�nicos y mail de los asistentes.
Consejo: No todos los objetos son �palpables�
Extra: �Qui�n detecta un conflicto de horarios?
*/
public class mainAgendaPersonal {

	public static void main(String[] args) {
		Date comienzo = new Date();
		AgendaPersonal agenda = new AgendaPersonal();
		Reunion reunion = new Reunion();
		agenda.getContactos();
		reunion.setComienzo(comienzo);
		System.out.println(comienzo);
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	


