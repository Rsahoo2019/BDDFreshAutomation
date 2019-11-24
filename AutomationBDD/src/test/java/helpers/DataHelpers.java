package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelpers {
	
	public static HashMap<String,String> StoreValues = new HashMap();
	
	public static List<HashMap<String,String>> data(String FilePath, String Sheetname) throws IOException 
	{
		List<HashMap<String,String>> mydata= new ArrayList();
		
		try {
			FileInputStream fs = new FileInputStream(FilePath);
			XSSFWorkbook workbook= new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(Sheetname);
			Row Headerrow =sheet.getRow(0);
			for(int i = 0;i<sheet.getPhysicalNumberOfRows();i++)
			{
			   Row currentrow=sheet.getRow(i);
			   
			   HashMap<String,String> currenthash = new HashMap<String,String>();
			   for(int j=0;j<currentrow.getPhysicalNumberOfCells();j++)
			   {
				   Cell currentcell = currentrow.getCell(j);
				   switch(currentcell.getCellType())
				   {
				   
				     case Cell.CELL_TYPE_STRING:
				    	 System.out.println(currentcell.getStringCellValue());
				         currenthash.put(Headerrow.getCell(j).getStringCellValue(),currentcell.getStringCellValue());
				         break;
						   
				
				   }
				   
			   }
			   
			   mydata.add(currenthash);
			   
			   
				
			}
			fs.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mydata;
		
		
	}
	

}
