package class40_Encapsulation;

import java.util.Date;

public class Song {

	/*
	 * Variables: 
	 * Instance: name, artist, genre, datePublished, publisher, isVinyl
	 * Static: numberOfSongs
	 * 
	 * Constructors:
	 * a) no-arg >>>numberOfSongs++;
	 * b) all instance Variables
	 * 
	 * Methods: a) getter and setter methods
	 * b) toString() method that returns all the info about the song >>>> name, artist, 
	 * genre, datePublished, publisher, isVinyl
 	 * 
	 */
	
	private String name;
	private String artist;
	private String genre;
	private String datePublished;
	private String publisher;
	private boolean isVinyl;
	private static int numOfSongs = 0;
	
	public Song() {
		numOfSongs++;
		
	}

	public Song(String name, String artist, String genre, String datePublished, String publisher, boolean isVinyl) {
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.datePublished = datePublished;
		this.publisher = publisher;
		this.isVinyl = isVinyl;
		numOfSongs++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isVinyl() {
		return isVinyl;
	}

	public void setVinyl(boolean isVinyl) {
		this.isVinyl = isVinyl;
	}

	public static int getNumOfSongs() {
		return numOfSongs;
	}

	public static void setNumOfSongs(int numOfSongs) {
		Song.numOfSongs = numOfSongs;
	}

//	@Override
//	public String toString() {
//		return "name=" + name + ", artist=" + artist + ", genre=" + genre + ", datePublished=" + datePublished
//				+ " , publisher=" + publisher + " , isVinyl=" + isVinyl;
//	}
	
	
	public String toString() {
		return "name[=" + name + " , artist=" + artist + " , genre=" + genre + ", datePublished" + datePublished + ", publisher= "
	+ publisher + ", isVinyl=" + isVinyl + "]" ;
	}
	
}
