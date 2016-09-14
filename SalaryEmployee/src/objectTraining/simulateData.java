package objectTraining;
/*
 * 标准数据的模拟现在只是测试值，后期公司自己实现接口方法
 */
public interface simulateData {
	double PI = 3.141526;//标准值
	double rateCompany = 3.0;//公司标准效率值
	double saleCompany = 7.0;//公司标准业绩
	/*
	 * 模拟数据接口方法
	 */
	
	//员工按照业绩和效率来计算奖金
	public double simulateCaculator();
}
