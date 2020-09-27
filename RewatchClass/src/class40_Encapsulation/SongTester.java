package class40_Encapsulation;

public class SongTester {

	public static void main(String[] args) {

		Song s = new Song();
		Song s2 = new Song("Guli", "Bojalar", "Pop", "20.02.2020", "RizanovaUz" ,false);
		s.setArtist("You");
		s.setName("Setted name is wjdch");
		System.out.println(s.toString());
		System.out.println(s.getName());
		System.out.println(s.getArtist());
		System.out.println(s2.toString());
		System.out.println(Song.getNumOfSongs());
		System.out.println(s2.isVinyl());
		
	}

}
