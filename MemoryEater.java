import java.io.PrintWriter;
import java.io.File;
import java.util.Vector;
import java.util.Date;
import java.util.*;
import java.lang.*;
public class MemoryEater
{
  public static void main(String[] args)
  {
    Vector v = new Vector();
    while (true)
    {
      byte b[] = new byte[1048576];
      v.add(b);
      Runtime rt = Runtime.getRuntime();
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
            System.out.println(e);
         }
      Date date = new Date();
     System.out.println( date.toString() + " " + "free memory: " + rt.freeMemory() );
try   (  PrintWriter out = new PrintWriter( "/var/www/html/index.html" )  ){
    out.println(  date  );
    out.println(  "freeMemory is " );
    out.println(  rt.freeMemory()  );
} catch (Exception ex) {
         ex.printStackTrace();
      }


    }
  }
}
