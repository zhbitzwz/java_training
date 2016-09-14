package objectTraining;
/*
 * 业绩和工资奖励
 */
public class CommisionSalary extends Employee implements simulateData{
	
	private double rate;//员工效率
	private double sales;//员工业绩
	
	public CommisionSalary(String name,double salary,double rate,double sales){
		super(name, salary);
		this.setRate(rate);
		this.setSales(sales);
	}
	private double calculatorSalary() {
		// 公司规定自己实现接口，这里先模拟数据
		return simulateCaculator();
	}
	public void printfMessage() {
		System.out.println("姓名：" + getName() + "工作效率:"+ getRate() + "应得工资：" + calculatorSalary());
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
	 * 员工按照业绩和效率来计算奖金 接口方法实现
	 * @see objectTraining.simulateData#simulateCaculator()
	 */
	@Override
	public double simulateCaculator() {
		return (getRate()*PI > rateCompany ? getRate() : rateCompany) * 100 + (getSales()*PI > saleCompany ? getSales():saleCompany);
	}
}
