package DBS2.bad_jdbc;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/**
 * Created by kenneth on 23-10-2017.
 */
public class JxlTest {


    public static void main(String... args) {



        // Lets create a times font
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        // Define the cell format
        WritableCellFormat times;
        times = new WritableCellFormat(times10pt);
        // Lets automatically wrap the cells
        try {
            times.setWrap(true);
        } catch (WriteException e) {
            e.printStackTrace();
        }

        // creating excel file
        File file = new File("C:\\Users\\kenneth\\Desktop\\test4.xls");
        WorkbookSettings settings = new WorkbookSettings();
        settings.setLocale(new Locale("en", "EN"));

        WritableWorkbook workbook = null;
        try {
            workbook = Workbook.createWorkbook(file, settings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creating the sheet
        workbook.createSheet("Report", 0);
        WritableSheet excelSheet = workbook.getSheet(0);


        //don't know what this does
        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setAutosize(true);
        //create content
        Label label = new Label(0,0,"colum one, and row one", times);
        try {
            excelSheet.addCell(label);
            System.out.println("did the add cell happen");
        } catch (WriteException e) {
            e.printStackTrace();
        }


        try {
            workbook.write();
            workbook.close();
            System.out.println("did this happen");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }


}
