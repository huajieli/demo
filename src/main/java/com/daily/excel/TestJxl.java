package com.daily.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import com.alibaba.fastjson.serializer.FilterUtils;

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
	
	/**
	 * jxl读取excel信息
	 */
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
	
	/**
	 * POI导出excel
	 */
	@Test
	public void POIDemo1() {
		String[] title = {"id","name","sex"};
		//创建Excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("sheet1");
		//创建第一行
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		//插入第一行数据
		for(int i=0;i<title.length;i++) {
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		//追加数据
		for(int i=1;i<=10;i++) {
			HSSFRow nextrow = sheet.createRow(i);
			HSSFCell cell2 = nextrow.createCell(0);
			cell2.setCellValue("a" + i);
			cell2 = nextrow.createCell(1);
			cell2.setCellValue("user" + i);
			cell2 = nextrow.createCell(2);
			cell2.setCellValue("男");
		}
		
		//创建一个文件
		File file = new File("e:/poi_test.xls");
		try {
			file.createNewFile();
			//将内容存盘
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * POI读取excel内容
	 * @throws IOException classNotFind
	 * 疑问：为啥我用高版本的comms-IO提示FileUtils 
	 */
	@Test
	public void testPOIRead() throws IOException {
		File file = new File("d:/jxl_test.xls"); 
		//创建Excel,读取文件内容
		HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
		//获取sheet的两种方式
		workbook.getSheet("sheet0");
		HSSFSheet sheet = workbook.getSheetAt(0);
		//获取sheet中最后一行行号
		int lastRowNum = sheet.getLastRowNum();
		//遍历读取数据
		for(int i=0;i<=lastRowNum;i++) {
			HSSFRow row = sheet.getRow(i);
			//获取当前行的最后单元格列号
			int lastCellNum = row.getLastCellNum();
			//遍历每行的数据
			for(int j=0;j<lastCellNum;j++) {
				HSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println("");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
