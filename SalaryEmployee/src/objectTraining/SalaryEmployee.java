package objectTraining;
/*
 * ��������
 */
public class SalaryEmployee extends Employee{
	private String name;//Ա��������
	private double salary;//Ա��Ӧ�ù���
	
	public SalaryEmployee(String name,double salary){

		super(name, salary);
	}
	public double caculatorSalary(){
		return getSalary();
	}
	public void printfMessage () {
		System.out.println("������" + getName() + "\t�������ʣ�" + caculatorSalary());
	}
}
