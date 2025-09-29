import java.util.Arrays;
public class ClassementV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[] = { 3, 4 , 17, 6, 9, 44, 22 } ;
	    int n=tab.length;
		int tab1[]=new int [n];
		int i;
		int t=0;
		for (i=0;i<n;i++)
		{ 
			if (tab[i]%2 !=0)
				tab1[t++]=tab[i];	
			
		}
	
		for (i=0;i<n;i++)
		{ 
			if (tab[i]%2==0)
				tab1[t++]=tab[i];		
		}
	

		System.out.println(Arrays.toString(tab1));
		
		
	}

}
