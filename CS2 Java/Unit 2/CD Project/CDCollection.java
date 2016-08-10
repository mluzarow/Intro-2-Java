/*********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
8)	Add 4 methods to the CDCollection class that do the following: 
	- return information about a CD at a given index number
	- return the index number of a CD with a given title
	- return all the index numbers of the CDs by a given artist
	- One more of your own (it must be a useful, meaningful method!!)

	To do this correctly you will need to modify the CD class, but you'll have to figure out how.

Write a program that allows the user to create and use a CD collection.  Give the user options to add a CD to the collection, to display the collection, and to use all 4 of the methods you added to the class. 

********************************************************************
*/
import java.text.NumberFormat;

public class CDCollection {
   private CD[] collection;
   private int count;
   private double totalCost;

   //  Creates an initially empty collection.
   public CDCollection () {
      collection = new CD[100];
      count = 0;
      totalCost = 0.0;
   }

   //  Adds a CD to the collection, increasing the size of the collection if necessary.
   public void addCD (String title, String artist, double cost, int tracks) {
      if (count == collection.length)
         increaseSize();

      collection[count] = new CD (title, artist, cost, tracks);
      totalCost += cost;
      count++;
 	}
 	
 	// Returns information about a CD at a given index number.
 	public String getCD(int Num) {
 		String report = collection[Num].toString();
      	return(report);
 	}
 	
 	// Returns the index number of a CD with a given title.
 	public int getIndex(String Namewa) {
 		int index = 0;
 		for (int i = 0; i < count; i++) {
 			if (Namewa.equalsIgnoreCase(collection[i].Title())) {
         		index = i;
         	}
 		}
 		return(index);
 	}
 	
 	// Returns all the index numbers of the CDs by a given artist.
 	public String getIndexArtist(String Artista) {
 		String AllIndex = "";
 		for (int i = 0; i < count; i++) {
 			if (Artista.equalsIgnoreCase(collection[i].Artist())) {
         		AllIndex += "" + i;
         	}
 		}
 		return(AllIndex);
 	}
	
	// My own.
	public int getTracks(int IndexNumber) {
		int SongTracks = collection[IndexNumber].Trackz();
      	return(SongTracks);
 	}
	
   //  Returns a report describing the CD collection.
   public String toString() {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);
	  report += "\n\nCD List:\n\n";


      for (int cd = 0; cd < count; cd++) {
         report += collection[cd].toString() + "\n";
      }
      return (report);
   }

   //  Doubles the size of the collection by creating a larger array and copying the existing collection into it.
   private void increaseSize () {
      CD[] temp = new CD[collection.length * 2];

      for (int cd = 0; cd < collection.length; cd++) {
         temp[cd] = collection[cd];
	  }
      collection = temp;
   }
   
   
   
   
   
}
