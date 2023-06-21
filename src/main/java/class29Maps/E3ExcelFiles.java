package class29Maps;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFiles {
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
            List<Map<String,String>> allDta=new ArrayList<>();// windows v show your history of copy past
            Row row0=sheet.getRow(0);

          int noOfRows=sheet.getPhysicalNumberOfRows();// get phisical too but it does not work with empty ones

            for(int i=0;i<noOfRows;i++){// <= we need to use  this loop will get us all the rows
                Row row= sheet.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                LinkedHashMap<String,String>linkedHsh=new LinkedHashMap<>();

                for(int j=0;j<noOfCells;j++){
                    String key=row0.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    linkedHsh.put(key,value);
                //    System.out.println(row.getCell(j)+" ");
                }
                allDta.add(linkedHsh);
               // System.out.println();
            }
            System.out.println(allDta);

        }catch(IOException io){// we can use IOException more greter or Exception
            io.printStackTrace();
        }
    }
}