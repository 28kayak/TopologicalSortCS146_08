
public class TestGraph
{
	public static void main(String [] args)
	{
		String inputFile1 = "/Users/kaya/Documents/LunaWorkspace/TopologicalSortCS146/src/input.txt";
		Graph graph = new Graph();
		String[] returned = graph.readInput(inputFile1);
		for(int i = 0; i < returned.length; i++)
		{
			System.out.println(returned[i]);
		}
		
	}

}
