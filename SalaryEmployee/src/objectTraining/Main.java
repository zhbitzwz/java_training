package objectTraining;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Code application logic here
		Scanner input = new Scanner(System.in);
		System.out.println("请输入员工的类别：\n1.固定工资员工 2.钟点工 3.佣金员工");
		int choice = input.nextInt();
		input.nextLine();
		
		String name = null;
		double salary = 0;
//		Employee employee = new Employee(name, salary);
		Employee employee;
	
		switch(choice){
		
		case 1:
			System.out.println("姓名：");
			name = input.nextLine();
			System.out.println("工资：");
			input.nextLine();//加一个nextLine()读取换行符，并不做处理(解决抛出异常)
			employee = new SalaryEmployee(name, salary);
			employee.printfMessage();
			break;
		case 2:
			double wage;
			double hour;
			
			System.out.println("姓名：");
			name = input.nextLine();
			System.out.println("时薪：");
			wage = input.nextDouble();
			System.out.println("工作时间：");
			hour = input.nextDouble();
			employee = new HourlyEmployee(name, salary,wage,hour);
			employee.printfMessage();
			break;
		case 3:
			double rate;
			double sales;
			
			System.out.println("姓名：");
			name = input.nextLine();
			System.out.println("效率：");
			rate = input.nextDouble();
			System.out.println("业绩：");
			sales = input.nextDouble();
			employee = new CommisionSalary(name,salary,rate, sales);
			employee.printfMessage();
			break;
		default:
			System.out.println("输入错误");
		}
	}

}
