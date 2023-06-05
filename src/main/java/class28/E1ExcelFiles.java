package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFiles {
    public static void main(String[] args) throws IOException {
        // to read the exist file that we create
        String path=System.getProperty("user.dir")+"\\Files\\TestFiles.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        // how to create new file we need a software
        // software ====Path======Store the file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();// object of that class
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");//create sheet to create new one
        Row row=sheet.createRow(0);// create row
        // inside row there is cells
        Cell cell =row.createCell(0);
        cell.setCellValue("Wael");
        Cell cell1= row.createCell(1);
        cell1.setCellValue("Jacob");

        // used when we have to create new file or we write the data to a file we use fileoutput stream
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\usa20\\IdeaProjects\\SDET16\\Files\\TestExcelFiles.xlsx");
        //  FileOutputStream fileOutputStream=new FileOutputStream(System.getProperty("user.dir")+"\\Files\\TestExcelFIles.xlsx");
        // xssfWorkbook.write(fileOutputStream);
        xssfWorkbook.write(fileOutputStream);// is going to write the data in the file


    }
}
