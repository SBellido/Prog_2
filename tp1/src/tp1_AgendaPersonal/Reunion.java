package tp1_AgendaPersonal;

import java.util.Date;
import java.util.List;

public class Reunion {
	private String lugar;
	private List<Persona> participantes;
	private String tema;
	private Date comienzo;
	private Date finalizacion;
	
	public Reunion() {}
	
	public Reunion(String lugar, List<Persona> participantes, String tema, Date comienzo, Date finalizacion) {
		this.lugar = lugar;
		this.participantes = participantes;
		this.tema = tema;
		this.comienzo = comienzo;
		this.finalizacion = finalizacion;
	}
	
//	public Date getDuracion(Date comienzo, Date finalizacion) {
//		int duracion;
//		duracion = ((int) finalizacion - comienzo);
//		return duracion;
//	}
//	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public List<Persona> getPerticipantes() {
		return participantes;
	}
	public void setPerticipantes(List<Persona> participantes) {
		this.participantes = participantes;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Date getComienzo() {
		return comienzo;
	}
	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}
	public Date getFinalizacion() {
		return finalizacion;
	}
	public void setFinalizacion(Date finalizacion) {
		this.finalizacion = finalizacion;
	}
 
}
