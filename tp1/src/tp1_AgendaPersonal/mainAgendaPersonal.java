package tp1_AgendaPersonal;

import java.util.Date;

/**
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios?
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
	
	
	
	
	
	
	
	
	
	
	


