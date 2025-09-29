
public class ClassementV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tab[] = { 3, 4 , 17, 6, 9, 44, 22 } ;
		  int index=0;
		   int i;
		    for (i=0;i<tab.length;i++) {
		    	
		    	if(tab[i]%2!=0) {
		
		    		int temp=tab[i];
		    		  for (int j = i; j > index; j--) {
		                    tab[j] = tab[j - 1];
		    	}
		    	
		    		  tab[index] = temp;
		                index++;
		    	   
		
	}

}
		    System.out.print("Tableau réorganisé (impairs en tête) : ");
	        for (int val : tab) {
	            System.out.print(val + " ");
	}
	}
}
