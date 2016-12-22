package arrays;

/**
 * Created by WERT on 22.12.2016.
 */
public class Strings {
	
	public static boolean stringIsInteger( String input ) {
	    try {
	        Integer.parseInt( input );
	        return true;
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}
}