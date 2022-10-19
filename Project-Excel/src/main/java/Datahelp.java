import java.util.List;
import java.util.ArrayList;

public interface Datahelp {
	default List<String[]> getData(){
		List<String[]>datalist = new ArrayList<String[]>();
		String[] row1 = new String[] {"1","dihung","21"};
		String[] row2 = new String[] {"2","yuwilly","22"};
		String[] row3 = new String[] {"3","wayne","23"};
		datalist.add(row1);
		datalist.add(row2);
		datalist.add(row3);
		return datalist;
		
	}
}
