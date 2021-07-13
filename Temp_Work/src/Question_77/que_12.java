package Question_77;

import java.util.Iterator;

public class que_12 {

	public static void main(String[] args) {
		String a1="A ";
		a1=a1.concat("B ");
		String b1="C ";
		a1=a1.concat(b1);
		a1.replace('C','D');
		//a1=a1.replace('C','D'); //after this addition a1=a1.replace the correct output 
		a1=a1.concat(b1);
		System.out.println(a1);

		int a[]= {1,2,3,4,5};
		for (int i = 0; i <5; i+=2) {
			System.out.println(a[i]);
		}
	}

}

