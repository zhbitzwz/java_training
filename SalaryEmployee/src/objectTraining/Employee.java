package objectTraining;
/*
 * Employee ����
 */
public class Employee {
	
	private String name;//����
	private double salary;//����
	
	public Employee(String name,double salary){
		setName(name);
		setSalary(salary);
	}
	//���㹤��
	public double caculatorSalary(){
		System.out.println("�˴δ�ӡ˫������ֵ");
		return 0.0;
	}
	//��ӡ��Ϣ
	public void printfMessage(){
		System.out.println("�˴���ӡ��Ϣ����");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSalary(double saraly){
		this.salary = saraly;
	}
	public double getSalary() {
		return salary;
	}

}
