package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special class knows how to read data from Excel files only
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");// this one give the name of the sheet file
        // excel use rows to get cells because rows can have diff

        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow= sheet.getRow(0); // the header part

        int rowSize=sheet.getPhysicalNumberOfRows();
        //start loop from 1 to give us all data in row 2
        for (int rows = 1; rows < rowSize; rows++) {//=1 because if we did 0 it will give us the header too
            Row row = sheet.getRow(rows);
            // create the map key and value so we need the cells to finish the values
            Map<String,String>rowMap=new HashMap<>();

            int cellSize=row.getPhysicalNumberOfCells();
            // this one will give us key and its value for the first map at index 0 inside the list
            for (int col = 0; col <cellSize ; col++) {// or col<row.getPhysicalNumberOfCells
             //   System.out.print(row.getCell(col) + " ");
                String key=headerRow.getCell(col).toString();// give us the key
                String value=row.getCell(col).toString();// insert the value
                rowMap.put(key,value);// insert in form of key and value
            }
            excelData.add(rowMap);
           // System.out.println();
        }
        System.out.println(excelData);

    }
}