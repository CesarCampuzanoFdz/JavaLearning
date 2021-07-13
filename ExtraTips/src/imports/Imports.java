package imports;

import static java.lang.System.out;

/* Even if not shown in the imports, java import:
 *  import java.lang.*;
 * by default, so I have everything in there
 */

//import java.lang.*;
import java.math.BigDecimal; //always try to import specific classes, not .* that imports all
import java.util.ArrayList;

//import static java.lang.System.out; //with a static import, I can call System.out.print... with just "out."
import static java.util.Collections.*; //This imports every static method of Collections, but not collections

public class Imports {

    public static void main(String[] args) {

	String str = "Hey!";
	BigDecimal bd = new BigDecimal(12);
	out.println(bd);
	out.println(str);
	
	//Instead of Collections.sort(new ArrayList<String>()); , since I have imported all static methods in
	//Collections, I use:
	
	sort(new ArrayList<String>());
	
	
    }

}
