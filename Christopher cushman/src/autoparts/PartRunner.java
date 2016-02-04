package autoparts;
import static java.lang.System.*;

import java.io.FileNotFoundException;

//Files needed
 	//Part.java
 	//PartList.java

public class PartRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		PartList prog = new PartList("partinfo.dat");
		out.println(prog.toString());
	}
}
