/**
 * 
 */
package ch12;

import java.util.ListResourceBundle;

/**
 * @author Mohammad Najar
 *
 */
public class IndianArtLabelsBundle extends ListResourceBundle {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ListResourceBundle#getContents()
	 */
	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
				{ "total_bookings", "Total Bookings" }, 
				{ "when", "When" }, 
				{ "price", "Price" },
				{ "book_now", "Book Now" }, 
				{ "sample_art", "flag_fish.png" } 
			};
	}

}
