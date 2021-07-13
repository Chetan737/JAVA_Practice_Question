package Question_77;

import java.util.Iterator;

public class que_18 {

	public static void main(String[] args) {
		String abc[][]=new String[2][2];
		abc[0][0]="Red ";
		abc[0][1]="Blue ";
		abc[1][0]="Small ";
		abc[1][1]="Medium ";
		
		for(int i=0;i<2;)
		{
			for(int j=0;j<2;)
			{
				System.out.print(abc[i][j]+" : ");
				j++;
			}
			i++;
		}

	}

}
