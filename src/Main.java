import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Esercizio del biglietto del cinema If ed Else
		 * 
		 * condizione1: sotto i 10 anni         prezzo1: 0€
		 * condizione2: tra i 10 e i 15 anni    prezzo2: 6€
		 * condizione3: sopra i 15 anni         prezzo3: 8€
		 * condizione4: giorno mercoledì        prezzo4: prezzo in base all'età meno 2€
		 */
	
    Scanner sc = new Scanner(System.in);
	int costo;
	char risposta;
	
	//introduzione del meccanismo di ciclo

	do {
	       System.out.print("Inserire la tua età: ");
	       int età = sc.nextInt();                                //con SCANNER La variabile dell'età deve essere inserita sulla console.
	       sc.nextLine();
	       
	       System.out.print("Specifica il giorno: ");
	       String giorno = sc.nextLine();                    
	   	sc.nextLine(); //inserire un invio in più sulla stampa


	//verifico la condizione dei bambini minori di 10 anni che non pagano, dichiarando l'età e il costo
	if (età < 10){
	    costo = 0;
	    
	//verifico la condizione con else if con i bambini di età compresa dai 10 ai 15 anni
	} else if (età >= 10 && età < 15) {
		costo = 6;
		
    //con else includo tutte le persone che hanno età >= di 15 anni
	} else
		costo = 8;
	   
	 //Verifico la condizione dello sconto settimanale   	
	  if (età >= 10 && giorno.equals("mercoledì"))     
		costo -= 2;
		System.out.println("Il costo del biglietto è " +costo +"€");
		
	 //domanda se si vuole ricominciare	a calcolare il costro di un nuovo biglietto
		 System.out.print("Vuoi verificare il costo di un'altra persona? (s o n): ");
		 risposta = sc.nextLine().charAt(0);
	       sc.nextLine();

    }
    while(risposta == 's');
    sc.close();
	      
	

	}}
