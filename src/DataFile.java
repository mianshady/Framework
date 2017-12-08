
public class DataFile {
	
	Xls_Reader d = new Xls_Reader("C:\\TEstNG\\NikulTest.xlsx");
	
	String ValidEmail = d.getCellData("Data1", "UserName", 2);
	String invalidEmail = d.getCellData("Data1", "UserName", 3);
	String invalidpassword = d.getCellData("Data1", "Password", 2);
	String EmailError = d.getCellData("Data1", "Email Error", 2);
	String PasswordError = d.getCellData("Data1", "Password Error", 2);

}
