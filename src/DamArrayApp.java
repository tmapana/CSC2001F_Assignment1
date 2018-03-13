// DamArrayApp program
// Tlotliso Mapana
// 06 March 2018

public class DamArrayApp
{

  public static void main (String[] args) throws Exception
  {
    //This is the main function
    DamArray damArray = new DamArray();

    if (args.length==0) { damArray.printAllDams(); }

    else
    {
      String name = args[0];
      damArray.printDam(name);
    }

  }

}
