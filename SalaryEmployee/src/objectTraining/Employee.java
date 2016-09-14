package objectTraining;
/*
 * Employee 父类
 */
public class Employee {
	
	private String name;//姓名
	private double salary;//工资
	
	public Employee(String name,double salary){
		setName(name);
		setSalary(salary);
	}
	//计算工资
	public double caculatorSalary(){
		System.out.println("此次打印双精度数值");
		return 0.0;
	}
	//打印信息
	public void printfMessage(){
		System.out.println("此处打印信息！！");
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
