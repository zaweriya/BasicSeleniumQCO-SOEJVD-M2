package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataproviderPractice {

	@Test(dataProvider = "getData")//capturing data from dataProvider
	public void DataProviderDemo(String name, int price)
	{
		System.out.println("Phone is "+name+" and Price is "+price);
	}
	
	@DataProvider
	public Object[][] getData()//also working based on rows and columns
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="iphone"; //one dataSet
		data[0][1]=25000;
		
		data[1][0]="Samsung";//second dataset
		data[1][1]=20000;
		
		data[2][0]="Vivo";//third dataSet
		data[2][1]=15000;
		
		return data;
	}
}
