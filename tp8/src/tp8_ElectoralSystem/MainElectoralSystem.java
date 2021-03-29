package tp8_ElectoralSystem;
/*
 2. Sistema Electoral
Un sistema de recuento automático de votos para una elección registra los votos recibidos por
los diferentes candidatos. Los candidatos poseen un nombre, un partido político y una
agrupación.

Cada votante registra su voto en una mesa. Cada mesa tiene asociado un conjunto de personas
que pueden votar en la misma (padrón), identificadas únicamente por su DNI. Las mesas se
encuentran distribuidas en diferentes establecimientos educativos, que a su vez se agrupan
por barrio y localidad. Adicionalmente, puede haber mesas especiales que no pertenezcan a
un establecimiento educativo sino al barrio o localidad directamente.
Cuando un votante se presenta a emitir su voto, se debe controlar que el mismo se encuentre
en el padrón correspondiente. Si se cumple esta condición, se registra el voto de la persona,
que puede contener una referencia a un candidato o ser un voto en blanco (sin referencia a
ningún candidato). Adicionalmente el voto guarda la hora en que se emitió el mismo (el
momento en el que se crea el voto).
Nota: Todos los votos emitidos se guardan en la mesa, aunque sean en blanco (es decir,
siempre existe el voto, es lo mismo que sucede con un sobre en una elección real)
Implementar los siguientes servicios:
1. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos recibidos por un candidato particular.
2. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos en blanco recibidos.
3. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate
implementa la interface Comparable)
4. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la
cantidad total de votos que se emitieron.
5. Obtener un listado de todos los candidatos que se presentan a la elección, ordenado por partido
político, agrupación y nombre, en ese orden.
Aclaración, los porcentajes se calculan como la cantidad de votos que cumplen la condición
dividido el total de votos emitidos en la mesa, establecimiento, barrio o localidad
multiplicado por 100.
 */
public class MainElectoralSystem {

	public static void main(String[] args) {
		
		ElectoralSystem electoralSystem = new ElectoralSystem();
		Candidate candidate1 = new Candidate("CC", "II", "FF");
		Candidate candidate2 = new Candidate("BB", "DD", "AA");
		Candidate candidate4 = new Candidate("AA", "JJ", "BB");
		Candidate candidate3 = new Candidate();
		
		Voter voter1 = new Voter(candidate1);
		Voter voter2 = new Voter(candidate1);
		Voter voter3 = new Voter(candidate1);
		Voter voter4 = new Voter(candidate2);
		Voter voter5 = new Voter(candidate2);
		Voter voter6 = new Voter(candidate2);
		
		VotingPlaceComposite tandil = new VotingPlaceComposite();
		
		VotingPlaceComposite falucho = new VotingPlaceComposite();
		VotingPlaceComposite villaItalia = new VotingPlaceComposite();

		VotingPlaceComposite tecnica1 = new VotingPlaceComposite();
		
		villaItalia.addVotingPlace(tecnica1);
		
		tandil.addVotingPlace(falucho);
		tandil.addVotingPlace(villaItalia);
		
		VotingTable mesa1 = new VotingTable();
		VotingTable mesa2 = new VotingTable();
		
		falucho.addVotingPlace(tecnica1);
		tecnica1.addVotingPlace(mesa1);
		tecnica1.addVotingPlace(mesa2);
		
		VotingTable mesaEspecial = new VotingTable();
		tandil.addVotingPlace(mesaEspecial);
		
		mesa1.addDni(0);
		mesa1.addDni(1);
		mesa1.addDni(2);
		mesa1.addDni(3);
		mesa1.addDni(4);
		mesa1.addDni(5);
		
		electoralSystem.addCandidate(candidate4);
		electoralSystem.addCandidate(candidate2);
		electoralSystem.addCandidate(candidate1);
		
		voter1.setCandidate(candidate4);
		voter2.setCandidate(candidate1);
		voter3.setCandidate(candidate2);
		voter4.setCandidate(candidate2);
		voter5.setCandidate(candidate2);
		voter6.setCandidate(candidate3);
		
		mesa1.registerVote(voter1);
		mesa1.registerVote(voter2);
		mesa1.registerVote(voter3);
		mesa1.registerVote(voter4);
		mesa1.registerVote(voter5);
		mesa1.registerVote(voter6);
		
		System.out.println(mesa1.countVotes());
		System.out.println(mesa1);
		System.out.println(mesa1.countVotes(candidate1));
		System.out.println(tecnica1.countVotes(candidate2));
		System.out.println(tecnica1.countVotes(candidate2));
		System.out.println(tecnica1.countVotesNull());
		System.out.println(tecnica1.getPercentageOfVotesNull());
		System.out.println(tecnica1.getPercentageOfVotes(candidate1));
		System.out.println(electoralSystem.getCandidateOrder());
	}

}
