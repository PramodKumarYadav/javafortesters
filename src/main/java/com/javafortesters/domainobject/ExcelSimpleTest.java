package com.javafortesters.domainobject;

import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSimpleTest
{
    String path;
    public FileInputStream fis = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row   =null;
    private XSSFCell cell = null;


    public ExcelSimpleTest() throws IOException
    {
        path = System.getProperty("D:\\StarWars\\TestData\\StarWarsDataBase.xlsm");
        fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
    }
    public void ExelWorks()
    {
        int index = workbook.getSheetIndex("Sheet1");
        sheet = workbook.getSheetAt(index);
        int rownumber=sheet.getLastRowNum()+1;

        for (int i=1; i<rownumber; i++ )
        {
            row = sheet.getRow(i);
            int colnumber = row.getLastCellNum();
            for (int j=0; j<colnumber; j++ )
            {
                cell = row.getCell(j);
                System.out.println(cell.getStringCellValue());
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        ExcelSimpleTest excelwork = new ExcelSimpleTest();
        excelwork.ExelWorks();
    }
}

