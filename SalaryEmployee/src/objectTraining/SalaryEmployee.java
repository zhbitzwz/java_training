package objectTraining;
/*
 * 基本工资
 */
public class SalaryEmployee extends Employee{
	private String name;//员工的姓名
	private double salary;//员工应得工资
	
	public SalaryEmployee(String name,double salary){

		super(name, salary);
	}
	public double caculatorSalary(){
		return getSalary();
	}
	public void printfMessage () {
		System.out.println("姓名：" + getName() + "\t基本工资：" + caculatorSalary());
	}
}
