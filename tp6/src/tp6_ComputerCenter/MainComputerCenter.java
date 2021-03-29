package tp6_ComputerCenter;
/* 4. Centro de Cómputos
Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas.
 */
public class MainComputerCenter {

	public static void main(String[] args) {
		ComputerCenter computerCenter = new ComputerCenter();
		Computer computer1 = new Computer(2000);
		Computer computer2 = new Computer(300);
		Computer computer3 = new Computer(200);
		Computer computer4 = new Computer(1000);
		ProcessToRun processToRun1 = new ProcessToRun(350);
		ProcessToRun processToRun2 = new ProcessToRun(500);
		ProcessToRun processToRun3 = new ProcessToRun(10);
		ProcessToRun processToRun4 = new ProcessToRun(700);
		ProcessToRun processToRun5 = new ProcessToRun(300);
		ProcessToRun processToRun6 = new ProcessToRun(500);
		ProcessToRun processToRun7 = new ProcessToRun(300);
		ProcessToRun processToRun8 = new ProcessToRun(100);
		ProcessToRun processToRun9 = new ProcessToRun(300);

		computerCenter.addComputer(computer1);
		computerCenter.addComputer(computer3);
		computerCenter.addComputer(computer2);
		computerCenter.addComputer(computer4);
		
		computerCenter.runProcess(processToRun1);
		computerCenter.runProcess(processToRun2);
		computerCenter.runProcess(processToRun3);
		computerCenter.runProcess(processToRun4);
		computerCenter.runProcess(processToRun5);
		computerCenter.runProcess(processToRun6);
		computerCenter.runProcess(processToRun7);
		computerCenter.runProcess(processToRun8);
		computerCenter.runProcess(processToRun9);
		
		System.out.println(computerCenter);
		computerCenter.finalizeRun(processToRun1);
		System.out.println(computerCenter);
	}

}
