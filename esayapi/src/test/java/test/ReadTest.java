package test;

import java.util.List;

import exceldata.Register;
import util.ExcelReader;

public class ReadTest {

	
	public static void main(String[] args) {
		// 设定Excel文件所在路径
		String excelFileName = "res/login.xlsx";
        // 读取Excel文件内容
        List<Register> readResult = ExcelReader.readExcel(excelFileName);
        for (int i = 0; i < readResult.size(); i++) {
			System.out.println(readResult.get(i).getPhone());
			System.out.println(readResult.get(i).getCode());
		}
	}

}
