package tp8_WorkBreakdownStructure;

import java.time.LocalDate;

/*6. Work Breakdown Structure
 
Una Work Breakdown Structure (Wbs) es una estructura de �rbol completa y jer�rquica
(desde lo m�s general a lo m�s espec�fico) de tareas que necesitan ser realizadas para
completar un proyecto.

Un ejemplo de una estructura Wbs para las actividades de pintar una habitaci�n ser�a:

+Preparar Materiales
	Comprar pintura
	Comprar Pinceles/Rodillos
	Comprar Lijas
	
+Preparar la habitaci�n
	+Preparar paredes
		Remover empapelado
		Sacar toda la decoraci�n desmontable
		Sacar apliques de luz
	+Proteger elementos
		Cubrir el piso con diarios
		Cubrir enchufes/bordes con cinta de papel
		Cubrir los muebles con s�banas viejas
		Pintar el cuarto
	+Limpiar el cuarto
		Guardar la pintura que sobr�
		Limpiar los pinceles y/o rodillos
		Desechar los diarios
		Remover los cobertores de los muebles
	
A cada tarea terminal del Wbs se le pueden asignar recursos. Los recursos pueden ser
materiales (computadora, mesa, etc) o personas (Juan Perez, Roberto Giord, etc). Estos
recursos pueden ser de dos tipos: exclusivos (es decir que pueden estar asignados a una �nica
tarea en un tiempo dado, por ejemplo una persona) o compartidos (recursos que se pueden
compartir en tareas, por ejemplo una impresora).

Las tareas terminales poseen una fecha de inicio y una fecha de finalizaci�n estimada, as�
como tambi�n fecha de inicio y finalizaci�n real. Tambi�n se guarda si una tarea ya se
complet�, est� en espera o en procesamiento. La fecha de inicio de una tarea compuesta
queda determinada por la fecha de inicio m�s temprana de sus subtareas. De manera an�loga,
la fecha de finalizaci�n de la tarea compuesta queda determinada por la fecha de finalizaci�n
m�s tard�a de sus subtareas.

Servicios que deben ser provistos por el administrador de Wbs:
1. Devolver la lista de tareas que est�n atrasadas (fecha de finalizaci�n estimada es
posterior a la fecha actual y su estado es �en espera�) .
2. Dado un recurso, devolver la lista de tareas que lo utilizan.
3. Dada una tarea, devolver los recursos involucrados (en caso de no ser una tarea
terminal es la suma de todos los recursos de las tareas que lo componen, SINREPETIDOS ).
4. Duraci�n estimada de una tarea.
5. Consultar si es posible asignar el recurso X a la tarea YY (tener en cuenta las fechas
de utilizaci�n de los recursos y si los mismos son o no exclusivos).
 */
public class MainWorkBreakdownStructure {

	public static void main(String[] args) {

		CompositeTask task00 = new CompositeTask("Preparar Materiales");
		CompositeTask task11 = new CompositeTask("Preparar la habitaci�n");
		CompositeTask task22 = new CompositeTask("Preparar paredes");

		SimpleTask task0 = new SimpleTask("Comprar pintura", LocalDate.of(2020, 10, 17), LocalDate.of(2020, 10, 17));
		SimpleTask task1 = new SimpleTask("Comprar Pinceles/Rodillos", LocalDate.of(2020, 10, 17), LocalDate.of(2020, 10, 17));

		SimpleTask task2 = new SimpleTask("Remover empapelado", LocalDate.of(2020, 10, 17), LocalDate.of(2020, 10, 17));
		SimpleTask task3 = new SimpleTask("Sacar toda la decoraci�n desmontable", LocalDate.of(2020, 10, 17), LocalDate.of(2020, 10, 18));

		SharedResourse sharedResourse1 = new SharedResourse("Pincel");
		SharedResourse sharedResourse2 = new SharedResourse("Brocha");
		SharedResourse sharedResourse3 = new SharedResourse("Pintura");
		SharedResourse sharedResourse4 = new SharedResourse("Lija");
		ExclusiveResourse exclusiveResourse1 = new ExclusiveResourse("Juan Carlos L�pez");

//		task00.addTask(task0);
//		task00.addTask(task1);
//		
//		task0.addResourse(sharedResourse1);
//		task0.addResourse(exclusiveResourse1);

		task1.addResourse(sharedResourse1);
		task1.addResourse(exclusiveResourse1);

		task3.addResourse(sharedResourse2);
		task2.addResourse(sharedResourse4);
		task3.addResourse(sharedResourse3);

		task22.addTask(task1);
		task22.addTask(task2);
		task22.addTask(task3);
		task11.addTask(task22);

//		System.out.println(task00.delayedTasks());
//		System.out.println(task11);

//		System.out.println(task22.getResourses());
//		System.out.println(task22.getDurationTask());
		System.out.println(task3.getResourses());
		System.out.println(task11.getDurationTask());
	}
}
