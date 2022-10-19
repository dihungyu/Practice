import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ReadFileName = "/Users/dihung/Downloads/read.xls";
//		try {
//			ExcelUtil.Readfile(ReadFileName);
//		}
//		catch(IOException e){
//			e.printStackTrace();
//		}
		
		String WriteFilename = "/Users/dihung/Downloads/write.xls";
		Datahelp datahelp = new DatahelpImpl();
		List<String[]> list = datahelp.getData();
		try {
			ExcelUtil.Writefile(WriteFilename, list);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Write excel end");
		
	}

}
