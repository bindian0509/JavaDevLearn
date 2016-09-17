package imported;

import java.io.*;

public class SeriesGenerator
{
	public static void main(String[] args) throws IOException
	{
			try
			{
				
				
				FileInputStream fstream = new FileInputStream("genfile.txt");
				int temp=1,i=0, temp2=0;
				
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine;
				
				while ((strLine = br.readLine()) != null)   {
				
				
					int key = Integer.parseInt(strLine);
					 key = key*10;
					 System.out.println(key);
					 for (i=1;i<10 ;i++ )
					 {
						
						System.out.println(key+i);
					 }

				}
				
				in.close();
			}
			catch (Exception e)
			{	
				System.err.println("Error: " + e.getMessage());
			}
	}
}