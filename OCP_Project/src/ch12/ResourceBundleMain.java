/**
 * 
 */
package ch12;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author Mohammad Najar
 *
 */
public class ResourceBundleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Java:\t" + IndianArtLabelsBundle.class.getName());
		System.out.println(".properties:  IndianArtLabelsBundle");
		System.out.println("--------------------------------");
		
		ResourceBundle rb = ResourceBundle.getBundle(IndianArtLabelsBundle.class.getName());//, new Locale("fr", "FR"));
		

		Enumeration<String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + ": " + rb.getString(key));
		}

	}

}
