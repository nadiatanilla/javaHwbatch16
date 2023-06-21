package class29Maps;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E2ExcelFiles {
    public static void main(String[] args) {
        // identify the location
        String path = "C:\\Users\\usa20\\IdeaProjects\\SDET16\\Files\\Employees.xlsx ";
        // absolute path is different from one user to another so we can not share it
        // bring data or navigate to the file

// brings that in the form of bytes from the RAM
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
          Sheet sheet=  xssfWorkbook.getSheet("Sheet1");
          int noOfRows=sheet.getPhysicalNumberOfRows();// get phisical too but it does not work with empty ones

            for(int i=0;i<noOfRows;i++){// <= we need to use  this loop will get us all the rows
                Row row= sheet.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                for(int j=0;j<noOfCells;j++){
                    System.out.println(row.getCell(j)+" ");
                }
                System.out.println();
            }
          Row row=sheet.getRow(0);
            System.out.println(row.getCell(0));
        }catch(IOException io){// we can use IOException more greter or Exception
            io.printStackTrace();
        }
    }
}