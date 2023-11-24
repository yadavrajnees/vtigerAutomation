package tril;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	public static void main(String[] args) throws IOException {
		//parent                         //child
		InputStream fileExcelObj = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\edata.xlsx");   // read the external file
		//OutputStream outputStream=new FileOutputStream("");  //write the external file
		Workbook workBook=new XSSFWorkbook(fileExcelObj); //this class is work for extenshion xlsx 
		Sheet sheet=workBook.getSheet("Sheet1");
		Row rowObj=sheet.getRow(1);
		Cell cellObj=rowObj.getCell(2);
		String getFirstRowFirstCellData=cellObj.getStringCellValue();
		System.out.println(getFirstRowFirstCellData);
	}

}
