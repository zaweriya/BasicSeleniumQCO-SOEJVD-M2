package DataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRead {

	public static void main(String[] args) throws Throwable {
		
		//step 1: open the document in java Readable format
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData.xlsx");
		
		//step 2: Create a work book
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3: Navigate to required sheet
		Sheet sh = wb.getSheet("Sample");
		
		//step 4: Navigate to required row
		Row rw = sh.getRow(0);
		
		//step 5: Navigate to required cell
		Cell ce = rw.getCell(0);
		
		//step 6: Navigate to data present inside the cell
		String data = ce.getStringCellValue();
		System.out.println(data);
		
	}

}
