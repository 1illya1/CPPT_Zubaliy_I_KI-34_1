/**
 * lab 6 package
 */
package lab6;

import java.util.Scanner;
import java.io.*;

import static java.lang.System.out;

/**
 * Class EquationsApp demonstrate program
 * 
  * @version 1.0
 */
public class EquationsApp {

	/**
	 * Method main
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		try {
			out.print("Enter file name: ");
			Scanner in = new Scanner(System.in);
			String fName = in.nextLine();
			PrintWriter fout = new PrintWriter(new File(fName));
			try {
				try {
					CalcWFio obj = new CalcWFio();

                    Equations eq = new Equations();
                    
                    
                    
//                    out.print("Enter X: ");
                    
                    
                    for (int i=5;i<=10;i+=1) {
                    	double result = eq.calculate(i);
                        fout.println(result);
                        obj.writeResTxt("textRes.txt", result);
                          obj.writeResBin("BinRes.bin", result);
                      }
                    
                   
                  
//                    System.out.println("Result is: " + result);
//                    obj.writeResTxt("textRes.txt", result);
//                    obj.writeResBin("BinRes.bin", result);
//
//                    obj.readResBin("BinRes.bin");
//                    obj.readResTxt("textRes.txt");


				} finally {

					fout.flush();
					fout.close();
				}
			} catch (CalcException ex) {


				out.print(ex.getMessage());
			}
		} catch (FileNotFoundException ex) {


			out.print("Exception reason: Perhaps wrong file path");
		}
	}
}

