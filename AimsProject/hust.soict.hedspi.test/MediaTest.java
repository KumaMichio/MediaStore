package hust.soict.hedspi.test.disc.TestPassingParameter;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
public class MediaTest {
	public static void main(String[] args) {
        // Create an ArrayList of Media
        ArrayList<Media> mediaList = new ArrayList<>();
        


        // Add some media (CD, DVD, Book) to the list
        mediaList.add(new CompactDisc("The Best of Music", null, 12, 0, null, null, null));
        mediaList.add(new DigitalVideoDisc("Inception"));
        mediaList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Iterate through the list and print out the information using toString()
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
        
        // Sort by Title, then Cost
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        System.out.println("\nSorted by Title, then Cost:");
        for (Media media : mediaList) {
            System.out.println(media);
        }

        // Sort by Cost, then Title
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted by Cost, then Title:");
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}
