import java.io.*;
import java.util.*;
/**
* Клас Lab2 реалізує приклад програми до лабораторної роботи №2
* 
* @author Zubalii Illya
* @version 1.0
* @since version 1.0
* 
*/
public class lab2
{
/**
* Статичний метод main є точкою входу в програму
* 
* @param args
* @throws FileNotFoundException
* 
*/
	public static void main(String[] args) throws FileNotFoundException
	 {
	 int nRows;
	 char[][] arr;
	 String filler;

	 Scanner in = new Scanner(System.in);
	 File dataFile = new File("MyFile.txt");
	 PrintWriter fout = new PrintWriter(dataFile);

	 System.out.print("Enter a size of matrix: ");
	 nRows = in.nextInt();
	 in.nextLine();

	 arr = new char[nRows][];
	 for(int i = 0; i < nRows; i++)
	 { 
	   arr[i]= new char[nRows];
	 }
	 
	 System.out.print("\nEnter a placeholder symbol: ");
	 filler = in.nextLine();
	int temp = 0;
	 exit:
	 for(int i = 0 ; i < nRows/2; i++)
	 {
	   for(int j = 0  ; j < nRows - temp; j++)
	   {
	     if(filler.length() == 1)
	     {
	       if(j >= temp) {
	       arr[i][j] = (char) filler.codePointAt(0);
	       System.out.print(arr[i][j] + " ");
	       fout.print(arr[i][j] + " ");
	       }
	       else
	       {
	         arr[i][j] = (char) filler.codePointAt(0);
	         System.out.print("  ");
	         fout.print("  ");
	       }
	     }
	     else if (filler.length() == 0)
	     {
	       System.out.print("\nThere is no placeholder symbol");
	       break exit;
	     }
	     else
	     {
	       System.out.print("\nToo much placeholder symbols");
	       break exit;
	     }
	  }
	   System.out.print("\n");
	   fout.print("\n");
	 temp++;
	 }
	 temp = nRows/2;
	 exit1:
	 for(int i = temp; i < nRows; i++)
	 {
	   for(int j = 0  ; j < nRows - temp; j++)
	   {
	     if(filler.length() == 1)
	     {
	       if(j >= temp) {
	       arr[i][j] = (char) filler.codePointAt(0);
	       System.out.print(arr[i][j] + " ");
	       fout.print(arr[i][j] + " ");
	       }
	       else
	       {
	         arr[i][j] = (char) filler.codePointAt(0);
	         System.out.print("  ");
	         fout.print("  ");
	       }
	     }
	     else if (filler.length() == 0)
	     {
	       System.out.print("\nThere is no placeholder symbol");
	       break exit1;
	     }
	     else
	     {
	       System.out.print("\nToo much placeholder symbols");
	       break exit1;
	     }
	  }
	   System.out.print("\n");
	   fout.print("\n");
	 temp--;
	 }
	 
	 fout.flush();
	 fout.close();

	 }

}
