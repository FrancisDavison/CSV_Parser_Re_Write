import org.apache.commons.csv.*;
import java.io.*;
public class CSV_Parser_Loop_Test
{
	public static void main(String[] args) throws IOException
	{
        CSVPrinter printer;
        String File_Name="_01.csv";
        int Current_seed=100;
        
        FileWriter writer = new FileWriter(File_Name);
        printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        
        for(int a=0;a<=100;a++)
        {
        	printer.printRecord(a,System.nanoTime());
            printer.flush(); 
        }
        printer.close();
	}
}
/*
//Compute here
			
			try
			{
				long This_Term=Current_Seed; //Create and initialise This_Term variable for tracking current seed number
				printer.printRecord(Current_Seed,System.nanoTime());
				while(This_Term!=1)
				{
					if(This_Term%2!=0) //If This_Term is odd:
					{
						This_Term=(3*This_Term)+1; //Multiply This_Term by 3 and add 1
						printer.printRecord(This_Term,System.nanoTime());
					}
					else //Else (If This_Term is even)
					{
						This_Term=This_Term/2; //Divide This_Term by 2
						printer.printRecord(This_Term,System.nanoTime());
					}
					printer.flush();
				}
				printer.close();
				//Re-construct message here
				Message_Out=(String.valueOf(Node_Id+900))+(String.valueOf(Seed_Status+900))+(String.valueOf(Current_Seed+900000000));
				return Message_Out;
			}
			catch(IOException e)
			{
				e.printStackTrace();
				//Re-construct message here
				Message_Out=(String.valueOf(Node_Id+900))+(String.valueOf(Seed_Status+900))+(String.valueOf(Current_Seed+900000000));
				return Message_Out;
			}
*/