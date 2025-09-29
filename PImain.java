


public class PImain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double pi;
		int termes=100000;
		double somme=0.0;
	for (int i=0;i<termes;i++) {
		
		if (i%2==0)
			somme+=1.0/(2*i+1);
		else 
			somme+=-1.0/(2*i+1);
	}
		
		pi=somme*4;
		System.out.println("voici le PI original de java: "+Math.PI);
		System.out.println("voici le PI calcule: "+pi);
		
		System.out.println("passons a la comparaison");
	if((Math.PI-pi)<0.1) {
		System.out.println("les deux nombres sont presque identiques");
		
		
	}
	}

}
