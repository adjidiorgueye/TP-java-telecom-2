import java.util.Scanner;

public class Devinmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Min=0;
		int Max=99;
		int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
		int i=0;
		int imax=6;
		System.out.println("voici la valeur :"+nombreAleatoire);
		
	while(i<imax) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int entier = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " + entier);
        i++;
		if(entier==nombreAleatoire) { 
			
		System.out.println("bravo");
		break;
		}
		else if (entier>nombreAleatoire) {
			System.out.println("trop grand");	
		}
		else
			System.out.println("trop petit");
		
		
		
		sc.close();
		}
	
		
	
	
	
	}

	  
	
	
	
	
}
