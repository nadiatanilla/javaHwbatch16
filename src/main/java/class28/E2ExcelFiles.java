package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFiles {
    public static void main(String[] args) throws IOException {
          String path="Files/Employees.xlsx";
          // to read data in our file
        FileInputStream fileInputStream=new FileInputStream(path);
        // sftware to read excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        //get the sheet in which we rhite data
       Sheet sheet= xssfWorkbook.getSheet("Sheet1");
       // create another row and send value
      Row row=sheet.createRow(5);
      row.createCell(0).setCellValue("Moncef");
      row.createCell(1).setCellValue("M");
      row.createCell(2).setCellValue("Belgas");
      // to send those data empty file
        FileOutputStream fileOutputStream1=new FileOutputStream(path);
        //data written to that file
        xssfWorkbook.write(fileOutputStream1);


    }
}
