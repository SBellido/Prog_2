package MeteorologicalEstimate;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
	private String name;
	private List<Double> registers;

	public Sensor(String name) {
		this.name = name;
		this.registers = new ArrayList<>();
	}

	public double getTheHighest(int lastRegisters) {
		double theBest = Double.MIN_NORMAL;
		int start = getStart(lastRegisters);
		if (!this.isEmpty()) {
			for (int i = start; i < this.registers.size(); i++) 
				if (this.registers.get(i) > theBest)
					theBest = this.registers.get(i);
		} 	
		return theBest;
	}
	
	public double average(int lastRegisters) {
		double average;
		double sum = Double.MIN_NORMAL;
		int total = Integer.MIN_VALUE;
		if (!this.isEmpty()) {
			int start = getStart(lastRegisters);
			for (int i = start; i < this.registers.size(); i++) {
				sum += this.registers.get(i);
				total++;
			}			
		} else { return total; }
		average = sum / total;
		return average;
	}

	private boolean isEmpty() {
		return this.registers.isEmpty();
	}
	
	private int getStart(int lastRegisters) {
		int start = 0;
		if (this.registers.size() >= lastRegisters)
			start = this.registers.size() - lastRegisters;
		return start;
	}

	public void addRegister(Double value) {
		this.registers.add(value);
	}

	public String getName() {
		return name;
	}

	public List<Double> getRegisters() {
		return new ArrayList<>(this.registers);
	}
	
}
