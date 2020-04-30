package com.acti.Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
  XSSFWorkbook excel;
	
	
	public ExcelHelper()
	{
		try{
			File src = new File("./testdata/testdata.xlsx");
			FileInputStream fis = new FileInputStream(src);
			excel=new XSSFWorkbook(fis);
			
		
			
		}catch(Exception e)
		{
			System.out.println("file not found "+e.getMessage());
		}
		
		
	}
  
	public int getrowcount(int sheetno)
	{
		return excel.getSheetAt(sheetno).getLastRowNum()+1;
	}
	
	public int getrowcount(String sheetno)
	{
		return excel.getSheet(sheetno).getLastRowNum()+1;
	}
	
	
	public String getcelldata(int sheetno,int row,int col)
	{
		return excel.getSheetAt(sheetno).getRow(row).getCell(col).toString();
	}
	

}
