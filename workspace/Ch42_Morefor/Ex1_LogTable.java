import java.io.*;
import java.util.Scanner;
import java.lang.*;
import javax.swing.JFileChooser;

/**
   Prints out a table of x and ln(x) so that the table is formatted using HTML.
   A web page is created by first printing:
   
      <html>
      <body>
      <table cellspacing=10>
      <tr><th>x</th><th>ln(x)</th></tr>
   
   Next, for each iteration of the loop, x and log(x) are calculated and
   the following line is printed:
   
      "<tr><td>" + x + "</td><td>" + Math.log(x) + "</td></tr>"
   
   The web page is finalized by printing:
   
      </table>
      </body>
      </html>
   
   TWhen run the program writes the output to a disk file named myLogs.html.

   @author  Tanmay Chordia
   @version January 23

   @author  Period 1
   @author  Assignment - Ex1_LogTable

   @author  Sources - TODO list collaborators
 */
public class Ex1_LogTable
{
    public static void main( String[] args ) throws FileNotFoundException
    {
       

        File file = new File("myLogs.html");
        PrintStream  print = new PrintStream( file );
        
        print.println("<html>");
        print.println("<body>");
        print.println(" <table cellspacing=10>");
        print.println("<tr><th>x</th><th>ln(x)</th></tr>");
        print.println("");
        
        for ( int j = 1; j <= 20; j++ )
        {
            double x = j / 10.0;
            print.println("<tr><td>" + x + "</td><td>" + Math.log(x) + "</td></tr>");
        }
        
        print.println("</table>");
        print.println("</body>");
        print.println("</html>");}
        
  
       
        
      
    
       
}