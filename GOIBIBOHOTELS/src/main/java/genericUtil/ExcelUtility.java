package genericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	public String readStringDataFromExcel(String filepath,String sheetname,int rownum,int cellnum) {
		File abspath=new File(filepath);
	Workbook workbook = null;
	try {
		 FileInputStream fis=new FileInputStream(abspath);
		workbook = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		
		
	}

}
