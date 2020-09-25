package class39Encapsulation;

/**
 * 23.09.2020
 * 
 * @author Eagle Encapsulation
 *
 */
public class Puppy {
	int naxNum = 5;
	public static int wag = 5;

	public void Puppy(int wag) {
		this.wag = wag;
	}

	public static void main(String[] args) {

		System.out.println(new Puppy().wag);

	}

	public static void swing() {
		System.out.println("swing");
	}

	public void climb() {
		System.out.println("climb");

	}
	public static void play() {
		swing();
//		climb();
	}
}
