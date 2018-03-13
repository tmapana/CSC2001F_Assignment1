// DamArray program
// Tlotliso Mapana
// 06 March 2018

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DamArray
{
  //
  Dam[] allDams = new Dam[211];
  Scanner inputFile = null;
  Scanner nameOfDam = new Scanner (System.in);

  public DamArray ()  { makeDamArray("Dam_Levels.csv"); } // Constructor to create Dam array object

  public void makeDamArray (String fileName)
  {
    // Loads file and creates an array of all dams
    try
    {
      inputFile = new Scanner (new FileReader (fileName));

      inputFile.nextLine();
      for (int i=0; i<211; i++)
      {
        String[] damDetails = inputFile.nextLine().split(",", -1);
        Dam dam = new Dam(damDetails[2].trim(), damDetails[10].trim(), damDetails[42].trim());
        allDams[i] = dam;
      }
    }

    catch (FileNotFoundException err)
    {
      System.out.println("Error! Problem Opening File");
      System.exit(0);
    }
  }

  public void printAllDams ()
  {
    for (int j=0; j<211; j++) { System.out.println(allDams[j]);}
  }

  public void printDam(String query)
  {
    int opCount = 0;
    for (int k=0; k<211; k++)
    {
      opCount++;
      if (allDams[k].equalsTo(query))
      {
        System.out.println(allDams[k]);
        System.out.println("The number of comparison operations made for the search of " + query + " is " + opCount);
        System.exit(0);
      }
    }

    System.out.println("Dam is not in the list.");

  }

}
