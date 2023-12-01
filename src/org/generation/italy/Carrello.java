package org.generation.italy;

import java.util.HashMap;

public class Carrello {
	
HashMap<Integer,Prodotto> carrello =new HashMap<>();

float totale;


public void aggiungiProdottoAlCarrello(Integer sceltaProdotto) {
	
	carrello.put(carrello.size()+1, elencoProdotti.get(sceltaProdotto)   );
}


	
	
}



