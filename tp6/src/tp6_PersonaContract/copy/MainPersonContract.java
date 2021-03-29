package tp6_PersonaContract.copy;
/*
1. Contrato de personal
Una consultora desea actualizar su sistema de gestión de posibles candidatos a diferentes
puestos. La consultora guarda de cada candidato su nombre completo, empresa en la cual está
trabajando y sueldo actual. La consultora se especializa en la asignación de contratos
temporales y por tal motivo necesita conocer dado un contrato nuevo si sus candidatos
pueden o no aceptarlo. 

Por ejemplo, hay candidatos que están contratados de forma exclusiva,
con lo cual no pueden aceptar otro contrato, otros candidatos pueden aceptar el contrato si el
mismo tiene hasta 8 hs semanales, otros pueden hasta 10 hs semanales, algunos candidatos no
pueden aceptar contratos que sean de la misma empresa en la que trabajan, otros candidatos
solo aceptan el contrato si el monto ofrecido es mayor igual que su sueldo. Estos son algunos
ejemplos de criterios de aceptación de los candidatos, en el futuro se puede agregar nuevas
formas e incluso esta forma se puede cambiar dinámicamente. De un contrato nuevo se
guarda las horas de dedicación semanal, el monto ofrecido y la empresa para la cual
desarrollarán las tareas.

Implementar un servicio que dado un contrato le permita a la consultora obtener un
listado de potenciales candidatos al mismo.

*/

public class MainPersonContract {

	public static void main(String[] args) {

// INSTANCIAS
		Consultant consultant = new Consultant("Consultora La Posta");
		Candidate candidate1 = new Candidate("Juan Altavista", 12, 40000);
		Candidate candidate2 = new Candidate("Paco Contreras", 10, 100000);

		Candidate candidate3 = new Candidate("Carlos Villagran", 30, 30);

		CriteriaSalary criteria1 = new CriteriaSalary(50000);		
//		CriteriaContractHour criteria2 = new CriteriaContractHour(10);
//		CriteriaContractExclusive criteria3 = new CriteriaContractExclusive();	
//		CriteriaDifferentCompany criteria4 = new CriteriaDifferentCompany("Grafeno");
		
//		CriteriaAnd criteria5 = new CriteriaAnd(criteria1, criteria2);
//		CriteriaOr criteria6 = new CriteriaOr(criteria1, criteria2);
		CriteriaNot criteria7 = new CriteriaNot(criteria1);
		
// AGREGA CANDIDATOS
		consultant.addCandidate(candidate1);
		consultant.addCandidate(candidate2);
		consultant.addCandidate(candidate3);
		
// SETTEA COMPAÑÍA
		candidate1.setCompany("Grafeno");
	
// LISTA CANDIDATOS APTOS
		System.out.println("Los candidatos aptos son: " + 
		consultant.getPossibleCandidates(criteria7));
	}

}
