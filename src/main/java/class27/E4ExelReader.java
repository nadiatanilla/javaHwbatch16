package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special class knows how to read data from Excel files only
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");// this one give the name of the sheet file
        // excel use rows to get cells because rows can have diff

        int rowSize=sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows < rowSize; rows++) {
            Row row = sheet.getRow(rows);

            int cellSize=row.getPhysicalNumberOfCells();
            for (int col = 0; col <cellSize ; col++) {// or col<row.getPhysicalNumberOfCells
                System.out.print(row.getCell(col) + " ");
            }
            System.out.println();
        }

    }
}