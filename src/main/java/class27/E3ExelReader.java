package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3ExelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special class knows how to read data from Excel files only
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");// this one give the name of the sheet file
        Row row=sheet.getRow(0);// and the next row is 1 and 2 and 3 so we can use lloop
        // in axel columns are cell
        Cell cell=row.getCell(0);
        System.out.println(cell);
        System.out.println(row.getCell(1));
        System.out.println(row.getCell(2));
        System.out.println(row.getCell(3));
        System.out.println(row.getCell(4));
    }
}
