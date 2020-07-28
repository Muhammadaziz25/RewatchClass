package class24_ArraysCont;

public class WarmUp {

	public static void main(String[] args) {

		int a=1;
		int b=10;
		int c=7;
		int maxNumber =0;
		maxNumber = (a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c;
		System.out.println(maxNumber);
	}

}
