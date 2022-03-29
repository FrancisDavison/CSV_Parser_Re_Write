import org.apache.commons.csv.*;
import java.io.*;
public class CSV_Parse_Test
{
	public static void main(String[] args) throws IOException
	{
        CSVPrinter printer;
        String File_Name="_01.csv";
        FileWriter writer = new FileWriter(File_Name);
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecord("Person1", 20, "Female");
        printer.printRecord("Person2", 23, "Male");
        printer.printRecord("Person3", 18, "Male");
        printer.flush(); 
        printer.close();
    }
}