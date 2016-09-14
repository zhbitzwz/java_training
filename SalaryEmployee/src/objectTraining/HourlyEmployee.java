package objectTraining;
/*
 * ��Сʱ���㹤��
 */
public class HourlyEmployee extends Employee{
	
	private double wage;//�ӵ㹤���Ĺ���
	private double hour;//����ʱ��
	
	public HourlyEmployee(String name,double salary,double wage,double hour) {
		super(name,salary);
		this.setHour(hour);
		this.setWage(wage);
	}
	public double calculatorSalary() {
		return getHour()*getWage();
	}
	public void printfMessage() {
		System.out.println("������" + getName() + "\t����ʱ�䣺" + getHour() + "\t�ܹ��ʣ�" + calculatorSalary());
		
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
