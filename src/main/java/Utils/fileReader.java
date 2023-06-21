package Utils;

import Utils.Constants;
import Utils.Constants2;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class fileReader {
    public static void main(String[] args) {
//String path="C:\\Users\\usa20\\IdeaProjects\\SDET16\\Files\\HRMSEmployeesData.xlsx";
       // String path = "C:\\Users\\usa20\\Desktop\\HRMSEmployeesData.xlsx";
       var excelData= readGetData(Constants2.EXCEL_FILE_PATH,"Sheet2");
        System.out.println(excelData);
    }
    public static List<Map<String,String>>readGetData(String filePath,String sheetName){
        List<Map<String,String>>mapListData=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            // we need to make sure that we have dependency for Excel file
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet= xssfWorkbook.getSheet(sheetName);
            // we create list all file data in form of maps that make data flexible

            // the first row is the header that contains keys of the map so we need to extract it
            Row headerRow=sheet.getRow(0);
            int numberOFRows= sheet.getPhysicalNumberOfRows();// to get number of rows
            // loop through all the rows
            for(int i=1;i<numberOFRows;i++){
                // we need to create map for evry row otherwise we will only see the last one
                Map<String,String> mapRow=new LinkedHashMap<>();
                Row row=sheet.getRow(i);
                // THEN I NEED TO GET NUMBER OF CELLS
                int numberOfCells=row.getPhysicalNumberOfCells();
                // then loop to get all the cells starting from 0
                for(int j=0;j<numberOfCells;j++){
                    // to get each cell
                    Cell cell=row.getCell(i);
                    // to get the key for evry map
                    String key=headerRow.getCell(j).toString();// because this returns Cell so we convert it to string
                    String value=row.getCell(j).toString();
                    // method to put them in map
                    mapRow.put(key,value);

//IF WE GOT ANY ISSUES WE FIRST GO AND READ THE EXCEPTION THEN DEBUG FROM THE LINE BEFORE THE ERROR
                    // when you test you can write a condition on debug pointer and it will go to the line that has that issue

                }
                mapListData.add(mapRow);
            }


        }catch (IOException f){
            f.printStackTrace();
        }
        return mapListData;
    }
}