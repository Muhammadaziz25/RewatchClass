package class40_Encapsulation;

public class Song {

	/*
	 * Variables: 
	 * Instance: name, artist, genre, datePublished, publisher, isVinyl
	 * Static: numberOfSongs
	 * 
	 * Constructors:
	 * a) no-arg
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
	private boolean isVinly;
	private static int numberOfSongs = 0;
	
	public Song() {
		numberOfSongs++;
	}
	
	public Song(String name, String artist, String genre, String datePublished, String publisher, boolean isVinly) {

		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.datePublished = datePublished;
		this.publisher = publisher;
		this.isVinly = isVinly;
		numberOfSongs++;
		
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

	public boolean isVinly() {
		return isVinly;
	}

	public void setVinly(boolean isVinly) {
		this.isVinly = isVinly;
	}

	public static int getNumberOfSongs() {
		return numberOfSongs;
	}

	public static void setNumberOfSongs(int numberOfSongs) {
		Song.numberOfSongs = numberOfSongs;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + ", genre=" + genre + ", datePublished=" + datePublished
				+ ", publisher=" + publisher + ", isVinly=" + isVinly + "]";
	}
	
	
	
	
//	public String toString() {
//		
//	}
	
}
