package objectTraining;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Code application logic here
		Scanner input = new Scanner(System.in);
		System.out.println("������Ա�������\n1.�̶�����Ա�� 2.�ӵ㹤 3.Ӷ��Ա��");
		int choice = input.nextInt();
		input.nextLine();
		
		String name = null;
		double salary = 0;
//		Employee employee = new Employee(name, salary);
		Employee employee;
	
		switch(choice){
		
		case 1:
			System.out.println("������");
			name = input.nextLine();
			System.out.println("���ʣ�");
			input.nextLine();//��һ��nextLine()��ȡ���з�������������(����׳��쳣)
			employee = new SalaryEmployee(name, salary);
			employee.printfMessage();
			break;
		case 2:
			double wage;
			double hour;
			
			System.out.println("������");
			name = input.nextLine();
			System.out.println("ʱн��");
			wage = input.nextDouble();
			System.out.println("����ʱ�䣺");
			hour = input.nextDouble();
			employee = new HourlyEmployee(name, salary,wage,hour);
			employee.printfMessage();
			break;
		case 3:
			double rate;
			double sales;
			
			System.out.println("������");
			name = input.nextLine();
			System.out.println("Ч�ʣ�");
			rate = input.nextDouble();
			System.out.println("ҵ����");
			sales = input.nextDouble();
			employee = new CommisionSalary(name,salary,rate, sales);
			employee.printfMessage();
			break;
		default:
			System.out.println("�������");
		}
	}

}
