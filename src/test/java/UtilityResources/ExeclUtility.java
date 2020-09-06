package UtilityResources;

public class ExeclUtility {
public void ExcelInitialize(){
	System.out.println("initialize excel book");
}

public void readcelldat() {
	System.out.println("Reading Cell data");
}

public void writecelldat() {
	System.out.println("write data to excel");
}

public int getRowCount() {
	System.out.println("get row count");
	return 2;
}

public int getCellCount() {
	System.out.println("get row count");
	return 3;
}
}
