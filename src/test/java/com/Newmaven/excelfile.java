package com.Newmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile {

 public static void excelfiles() throws IOException {
	 File f = new File("C:\\Users\\USER\\Desktop");
     FileInputStream fis = new FileInputStream(f);
     Workbook wb = new XSSFWorkbook();
     wb.createSheet("Data").createRow(0).createCell(0).setCellValue("username");
     wb.createSheet("Data").getRow(0).createCell(1).setCellValue("Password");
     wb.createSheet("Data").createRow(1).createCell(0).setCellValue("James");
     wb.createSheet("Data").getRow(1).createCell(1).setCellValue("James123");
     FileOutputStream fos = new FileOutputStream(f);
     
    
     wb.write(fos);
     
     wb.close();
 }

 public static void main(String[] args) throws IOException {
	
	 excelfiles(); 
}
}
