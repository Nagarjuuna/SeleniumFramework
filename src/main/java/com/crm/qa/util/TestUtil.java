package com.crm.qa.util;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.crm.qa.base.TestBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestUtil extends TestBase {

    public static Object[][] getTestData(String sheetName) {
        try (FileInputStream file = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\com\\crm\\qa\\testdata\\ORANGEHRM_TESTDATA.xlsx");
             Workbook workbook = WorkbookFactory.create(file)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet not found in the Excel file!");
            }

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getPhysicalNumberOfCells();
            Object[][] data = new Object[rows - 1][cols];

            // Loop through the rows and columns to get the data
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    Cell cell = sheet.getRow(i).getCell(j);
                    if (cell != null) {
                        data[i - 1][j] = cell.toString();
                    } else {
                        data[i - 1][j] = "";  // Handle empty cells gracefully
                    }
                }
            }
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading the Excel file.", e);
        }
    }
    public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
      
    }   
    
}

