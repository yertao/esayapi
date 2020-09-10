package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Workbook;

import exceldata.Register;
import util.ExcelWriter;

public class WriterTest {
	private static Logger logger = Logger.getLogger(ReadTest.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建需要写入的数据列表
        List<Register> dataVOList = new ArrayList<Register>();
        Register dataVO = new Register();
        dataVO.setPhone("123");
        dataVO.setCode(111);
        Register dataVO2 = new Register();
        dataVO2.setPhone("456");
        dataVO2.setCode(222);
        dataVOList.add(dataVO);
        dataVOList.add(dataVO2);

        // 写入数据到工作簿对象内
        Workbook workbook = ExcelWriter.exportData(dataVOList);

        // 以文件的形式输出工作簿对象
        FileOutputStream fileOut = null;
        try {
            String exportFilePath = "res/writeExample.xlsx";
            File exportFile = new File(exportFilePath);
            if (!exportFile.exists()) {
                exportFile.createNewFile();
            }

            fileOut = new FileOutputStream(exportFilePath);
            workbook.write(fileOut);
            fileOut.flush();
        } catch (Exception e) {
            logger.warning("输出Excel时发生错误，错误原因：" + e.getMessage());
        } finally {
            try {
                if (null != fileOut) {
                    fileOut.close();
                }
                if (null != workbook) {
                    workbook.close();
                }
            } catch (IOException e) {
                logger.warning("关闭输出流时发生错误，错误原因：" + e.getMessage());
            }
        }
	}

}
