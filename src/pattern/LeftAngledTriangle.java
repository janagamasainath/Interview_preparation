package pattern;

import java.util.Iterator;

public class LeftAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for (int i = 1; i <=n; i++) {
			for (int j = n-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
