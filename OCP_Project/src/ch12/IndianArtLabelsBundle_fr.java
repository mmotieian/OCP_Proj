/**
 * 
 */
package ch12;

import java.util.ListResourceBundle;

/**
 * @author Mohammad Najar
 *
 */
public class IndianArtLabelsBundle_fr extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { 
				{ "total_bookings", "Réservations totales" }, 
				{ "when", "Lors de" },
				{ "price", "Prix" }, 
				{ "book_now", "Réserver" }, 
				{ "sample_art", "flag_mango_oval.png" }
			};
	}
}
