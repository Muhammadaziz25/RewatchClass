package class40_Encapsulation;

public class SongTester {

	public static void main(String[] args) {

		Song s = new Song();
		Song s2 = new Song("Ona", "ABC", "Lyric", "20.05.1978", "Gold Media", false);
		
		System.out.println(s2.toString());
		System.out.println(Song.getNumberOfSongs());
	}

}
