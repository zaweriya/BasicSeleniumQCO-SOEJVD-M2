package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite {

	public static void main(String[] args) throws Throwable {
		
		//step 1: Open the file in java readable format
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\testData.xlsx");
		
		//step 2: create a work book
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3: create a new sheet
		Sheet sh = wb.createSheet("Trial");
		
		//step 4: navigate to required row
		Row rw = sh.createRow(3);
		
		//step 5: navigate to cell
		Cell ce = rw.createCell(2);
		
		//step 6: provide data to be written
		ce.setCellValue("Qspiders");
		
		//step 7: open the document in java write format
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\testData.xlsx");
		wb.write(fos);
		System.out.println("data added");
		
		

	}

}
