package MavenJavaProject.MavenJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		FileInputStream fis = new FileInputStream("C:\\Users\\gyalamat\\Desktop\\Selenium Training\\Excel Data driven\\ExcelDemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		System.out.println("Sheets present in an excel : "+sheets);
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				System.out.println(workbook.getSheetName(i));
				Iterator<Row> allRows = sheet.rowIterator();
				Row firstRow = allRows.next();
				Iterator<Cell> firstRowCells = firstRow.cellIterator();
				int k=0;
				int column =0;
				while(firstRowCells.hasNext())
				{
					Cell cells = firstRowCells.next();
					if(cells.getStringCellValue().equalsIgnoreCase("testcases"))
					{
						column=k;
					}
				k++;	
				}
				System.out.println("Testcases available in "+k+"th column");
				while(allRows.hasNext())
				{
					Row rows = allRows.next();
					if(rows.getCell(column).getStringCellValue().equalsIgnoreCase("Add profile"))
					{
						Iterator<Cell> mainRow=rows.cellIterator();
						while(mainRow.hasNext())
						{
							Cell mainCell=mainRow.next();
							System.out.println(mainCell);
							if(mainCell.getCellType()==CellType.STRING)
							{
								list.add(mainCell);
							}
							else
							{
								list.add(NumberToTextConverter.toText(mainCell.getNumericCellValue()));
							}
						}
					}
				}
			
			}
		}
		
		System.out.println("Values in array list are :");
		System.out.println(list.get(3));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		
		
		
	}
}