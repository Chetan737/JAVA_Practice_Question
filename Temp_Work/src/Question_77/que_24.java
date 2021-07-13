package Question_77;

public class que_24 {

	public static void main(String[] args) {
		String abc[][]=new String[2][];
		abc[0]=new String[2];
		abc[1]=new String[5];
		
		int i=97;
		
		for(int a=0;a<abc.length;a++) {
			for(int b=0;b<abc.length;b++) {
				abc[a][b]=""+i;
				i++;
			}
		}
		for (String[] ca : abc) {
			for (String c : ca) {
				System.out.println(c+ " ");
			}
			System.out.println();
		}
			
	}

}
