package tril;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExternalData {

	public static void main(String[] args) {
		InputStream externalExcelFile=null;
		Workbook wbook=null;
		try {
			externalExcelFile=new FileInputStream("src\\main\\resources\\edata.xlsx");
			wbook=new XSSFWorkbook(externalExcelFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Sheet sheetObj=wbook.getSheet("Sheet1");
			int scount=sheetObj.getLastRowNum();
			System.out.println(scount);
			Row rowObj=sheetObj.getRow(8);
			int cellCount=rowObj.getLastCellNum();
			System.out.println(cellCount);
			Cell cellObj=rowObj.getCell(cellCount, MissingCellPolicy.CREATE_NULL_AS_BLANK);
			//Cell cellObj=rowObj.getCell(8);
			Double cellvalue=cellObj.getNumericCellValue();
		   Integer data=	cellvalue.intValue();
		String cev =   data.toString();
		System.out.println("data"+" "+cev);
			//String cellValue =cellObj.getStringCellValue();
			//System.out.println("data"+cellvalue);
	}

}
