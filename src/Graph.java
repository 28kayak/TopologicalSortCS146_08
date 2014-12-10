import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Graph 
{
	private ArrayList<Vertex>[] edges;
	private int [] vertexList;//hold 

	public Graph()
	{
		edges = (ArrayList<Vertex>[]) new ArrayList[100];
		vertexList = new int[100];
	}
	
	public String[] readInput(String inputFilePath)
	{
		File input = new File(inputFilePath);
		String data;
		String info = "";
		String[] splitInfo;
		try
		{
			FileInputStream fis = new FileInputStream(inputFilePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while((data = br.readLine()) != null)
			{
				info += data + ",";//insert , line by line later to split out
			}
		}
		catch(IOException ex)
		{
			ex.getStackTrace();
		}
		splitInfo = info.split(",");
		return splitInfo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
