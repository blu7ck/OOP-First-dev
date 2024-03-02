import java.util.Scanner;

public class Employee {

private		String name;
public		double salary;
private 	int work_hour,hire_date;
	
					Employee(int hire_date,int work_hour, double salary, String name) {
						this.hire_date = hire_date;
						this.salary = salary;
						this.work_hour = work_hour;
						this.name = name;
					}
	public double tax() {
		if(this.salary >= 1000) {
			return salary*0.03;
		}
				
		return 0.0;
	}
	public double bonus() {
		int extraHour = this.work_hour - 40;
		if(extraHour > 0) {
			return 30*extraHour;
		} 
		return 0.0; 
	}
	public double RoS() { //Raise of Salary
		int year= 2020 - this.hire_date;
		if(year < 10) {
			return salary*0.05;
			}
		else if(year >= 10 && year < 20) {
			return salary * 0.10;
		}
		else {
			return salary * 0.15;
	}
		

	}
	public void toString(Employee işçi1) {
		
		System.out.println("Tax: " + işçi1.tax());
		System.out.println("Bonus: " + işçi1.bonus());
		System.out.println("Raise of Salary: " + işçi1.RoS());
	
		double totalSalary = işçi1.salary - işçi1.tax() + işçi1.bonus();
		System.out.println("Total Salary with Taxes and Bonuses: " + totalSalary);
		System.out.println("Total Salary with the Raise of Salary: " + (işçi1.salary+işçi1.RoS()));
		System.out.println("Total Salary with Taxes and Bonuses + Raise of Salary: " + (totalSalary+işçi1.RoS()));
	}
}

