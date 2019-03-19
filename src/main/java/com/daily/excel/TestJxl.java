package com.daily.excel;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestJxl {
	/**
	 * JXL创建文件
	 */
	@Test
	public void testJxl() {
		//表头
		String[] title = {"id","name","sex"};
		//创建文件
		File file = new File("d:/jxl_test.xls");
		//创建工作簿
		try {
			WritableWorkbook workBook = Workbook.createWorkbook(file);
			//创建sheet
			WritableSheet sheet = workBook.createSheet("sheet1", 0);
			//设置第一行列名
			Label label = null;//这样写很通用啊感觉，不错
			for(int i=0;i<title.length;i++) {
				//第一行：构造函数中的参数分别是第几列，第几行，名称（jxl的特点，用坐标来表示）
				label = new Label(i, 0, title[i]);
				sheet.addCell(label);
			}
			//添加数据
			for(int i=1;i<10;i++ ) {
				label = new Label(0,i,"a" + i);
				sheet.addCell(label);
				label = new Label(1,i,"user" + i);
				sheet.addCell(label);
				label = new Label(2,i,"男");
				sheet.addCell(label);
			}
			//写入数据
			workBook.write();
			workBook.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void readExcel() {
		//创建workbook
		try {
			Workbook workbook = Workbook.getWorkbook(new File("d:/jxl_test.xls"));
			//获取第一个sheet(工作表)
			Sheet sheet = workbook.getSheet(0);
			for(int i=0;i<sheet.getRows();i++) {
				for(int j=0;j<sheet.getColumns();j++) {
					//(列，行)
					Cell cell = sheet.getCell(j, i);
					System.out.print(cell.getContents()+"  ");
				}
				
				System.out.println();
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
