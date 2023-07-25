package com.ActitimeGenricLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelibrary {
	public String readdatafromexcel(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Testdata/Advanced.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	public String readdataExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Testdata/AUTOMATION.data.XLsx");
		Workbook w = WorkbookFactory.create(fis);
		String value = w.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

}
