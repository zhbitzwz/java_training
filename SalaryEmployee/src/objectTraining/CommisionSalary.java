package objectTraining;
/*
 * ҵ���͹��ʽ���
 */
public class CommisionSalary extends Employee implements simulateData{
	
	private double rate;//Ա��Ч��
	private double sales;//Ա��ҵ��
	
	public CommisionSalary(String name,double salary,double rate,double sales){
		super(name, salary);
		this.setRate(rate);
		this.setSales(sales);
	}
	private double calculatorSalary() {
		// ��˾�涨�Լ�ʵ�ֽӿڣ�������ģ������
		return simulateCaculator();
	}
	public void printfMessage() {
		System.out.println("������" + getName() + "����Ч��:"+ getRate() + "Ӧ�ù��ʣ�" + calculatorSalary());
	}
	public void setRate(double rate){
		this.rate = rate;
	}
	public double getRate(){
		return rate;
	}
	public void setSales(double sales){
		this.sales = sales;
	}
	public double getSales(){
		return sales;
	}
	/*
	 * Ա������ҵ����Ч�������㽱�� �ӿڷ���ʵ��
	 * @see objectTraining.simulateData#simulateCaculator()
	 */
	@Override
	public double simulateCaculator() {
		return (getRate()*PI > rateCompany ? getRate() : rateCompany) * 100 + (getSales()*PI > saleCompany ? getSales():saleCompany);
	}
}
