package objectTraining;
/*
 * 按小时计算工资
 */
public class HourlyEmployee extends Employee{
	
	private double wage;//钟点工均的工资
	private double hour;//工作时间
	
	public HourlyEmployee(String name,double salary,double wage,double hour) {
		super(name,salary);
		this.setHour(hour);
		this.setWage(wage);
	}
	public double calculatorSalary() {
		return getHour()*getWage();
	}
	public void printfMessage() {
		System.out.println("姓名：" + getName() + "\t工作时间：" + getHour() + "\t总工资：" + calculatorSalary());
		
	}
	
	public double getWage(){
		return wage;
	}
	public void setWage(double wage){
		this.wage = wage;
	}
	public double getHour(){
		return hour;
	}
	public void setHour(double hour){
		this.hour = hour;
	}
}
