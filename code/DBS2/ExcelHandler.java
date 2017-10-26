package DBS2;

import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.*;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/**
 * Created by kenneth on 23-10-2017.
 * Only works with .xls files not with the newer .xlsx files
 */
public class ExcelHandler {
    private File file;
    private WritableWorkbook writableWorkbook;

    public ExcelHandler(String fileNameWithPath) throws RuntimeException, IOException, BiffException{
        this.file = new File(fileNameWithPath);
        WorkbookSettings wbSettings = new WorkbookSettings();
        Workbook workbook = null;
        if (file.exists()) {
            workbook = Workbook.getWorkbook(file, wbSettings);
            this.writableWorkbook = Workbook.createWorkbook(this.file, workbook);
        } else {

            this.writableWorkbook = Workbook.createWorkbook(this.file);
        }
        wbSettings.setLocale(new Locale("en", "EN"));

            try {

                WritableSheet aSheet = writableWorkbook.getSheet(0);
            } catch (IndexOutOfBoundsException e) {
                writableWorkbook.createSheet("Report", 0);
            }


    }

    public void addLabel(int column, int row, String content) throws WriteException{
        WritableSheet sheet = this.writableWorkbook.getSheet(0);
        Label label = new Label(column, row, content);
        sheet.addCell(label);

    }

    public void finish() throws IOException, WriteException {
        System.out.println("finished with the file");
        this.writableWorkbook.write();
        this.writableWorkbook.close();
    }
}
