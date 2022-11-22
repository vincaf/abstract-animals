package org.company.italy;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Paolo", "Rossi", LocalDate.now(), 400, 12);
		Employee e2 = new Employee("Gianni", "Giannetti", LocalDate.now(), 1700, 12);
		Employee e3 = new Employee("Luca", "Nervi", LocalDate.now(), 1500, 14);

		Boss b1 = new Boss("Marino", "De Marinis", LocalDate.now(), 4300, 10000);
		Boss b2 = new Boss("Pietro", "La Pietra", LocalDate.now(), 3200, 8000);

		Person[] company = {e1, e2, e3, b1, b2};
		
		int minYearIncome = Integer.MAX_VALUE;
		int maxYearIncome = Integer.MIN_VALUE;
		
		Person minYearIncomePerson = null;
		Person maxYearIncomePerson = null;
		
		int maxIncomeBossValue = Integer.MIN_VALUE;
		int minIncomeEmployeeValue = Integer.MAX_VALUE;
		
		Person maxYearIncomeBoss = null;
		Person minYearIncomeEmployee = null;
		
		int sumCost = 0;
		
		for (int i=0; i<company.length; i++) {
			Person pMin = company[i];
			int minValue = pMin.getYearIncome();
			Person pMax = company[i];
			int maxValue = pMax.getYearIncome();
			
			if(minValue < minYearIncome ) {
				minYearIncome = minValue;
				minYearIncomePerson = pMin;
			}
			
			if(pMin instanceof Employee && minValue < minIncomeEmployeeValue) {
				minYearIncomeEmployee = pMin;
				minIncomeEmployeeValue =  minValue;
			}
			
			if(maxValue > maxYearIncome) {
				maxYearIncome = maxValue;
				maxYearIncomePerson = pMax;
			}

			if(pMax instanceof Boss && maxValue > maxIncomeBossValue) {
				maxYearIncomeBoss = pMax;
				maxIncomeBossValue = maxValue;
			}

			sumCost += maxValue;
			
		}
		
		int avgCost = sumCost/company.length;
		
		System.out.println("Incasso annuale massimo: " + maxYearIncomePerson 
				+ "\n----------" + "\nIncasso annuale minimo: " + minYearIncomePerson
				+ "\n----------" + "\nCosto annuale azienda: " + sumCost
				+ "\n----------" + "\nCosto medio per dipendente: " + avgCost
				+ "\n----------" + "\nBoss con incasso annuale maggiore: " + maxYearIncomeBoss
				+ "\n----------" + "\nImpiegato con incasso annuale minore: " + minYearIncomeEmployee);

	}

}
