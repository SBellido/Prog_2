package tp2_ResrvationsAirTickets;

import java.util.ArrayList;

public class Airline {
	private String name;
	private ArrayList<Person> clients;
	private ArrayList<Airplane> aviones;
	
	public Airline(String name) {
		this.name = name;
		this.clients = new ArrayList<Person>();
		this.aviones = new ArrayList<Airplane>();
	}

	public Airline() {
		this.setName(name);
		this.setClients(clients);
		this.setAviones(aviones);
	}

	public void registerClient(Person client) {
		for(int i = 0; i <= this.clients.size(); i++) {
			if(this.clients.isEmpty()) {
				this.clients.add(client);
				break;
			} 
			if(!(this.clients.get(i).getDni() != client.getDni())) {
				this.clients.add(client);
			} else {
				System.out.println("El cliente con dni "+client.getDni()+" ya existe.");
				break;
			}
		}
	}

	
	public void printClients() {
		System.out.println("Los clientes de "+this.getName()+" son:");
		for (Person client : this.clients) {		
			client.toString();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public ArrayList<Person> getClients() {
//		return clients;
//	}

	public void setClients(ArrayList<Person> clients) {
		this.clients = clients;
	}

	public ArrayList<Airplane> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Airplane> aviones) {
		this.aviones = aviones;
	}

}
