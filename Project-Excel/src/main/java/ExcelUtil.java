import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil {
	public static void Readfile(String filename) throws IOException{
		InputStream is  = new FileInputStream(new File(filename));
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		HSSFSheet sheet = workbook.getSheetAt(0);
		Iterator itRow = sheet.rowIterator();
		
		while(itRow.hasNext()) {
			HSSFRow row = (HSSFRow)itRow.next();
			Iterator itCell = row.cellIterator();
			while(itCell.hasNext()) {
				HSSFCell cell = (HSSFCell)itCell.next();
				System.out.print(cell + " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void Writefile(String filename, List<String[]> datalist) throws IOException{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Test sheet");
		HSSFRow row = sheet.createRow(0);
		
		HSSFCell cell1 = row.createCell(0);
		cell1.setCellValue("id");
		HSSFCell cell2  = row.createCell(1);
		cell2.setCellValue("name");
		HSSFCell cell3 = row.createCell(2);
		cell3.setCellValue("age");
		
		for(int i=0 ; i<datalist.size(); i++) {
			HSSFRow row1 = sheet.createRow(i+1);
			String[] rowdata = datalist.get(i);
			
			for(int j=0; j<rowdata.length; j++) {
				HSSFCell cell = row1.createCell(j);
				cell.setCellValue(rowdata[j]);
			}
			
			
		}
		FileOutputStream fis = new FileOutputStream(filename);
		wb.write(fis);
		fis.flush();
		fis.close();
		
		
	}

}
