package it.polito.tdp.spellchecker.model;

import java.io.*;
import java.util.*;

public class Dictionary {

	List<String> dictionary;
	String language;
	

	
	public boolean loadDictionary(String language) {
		
		if (dictionary!=null && this.language.equals(language)){
			return true;
		}
		
		dictionary = new ArrayList<String>();
		this.language = language;
		
		try {

			FileReader fr = new FileReader("src/main/resources/" + language + ".txt");
			BufferedReader br = new BufferedReader(fr);
			String word;

			while ((word = br.readLine()) != null) {
				dictionary.add(word.toLowerCase());
			}

			Collections.sort(dictionary);

			br.close();
			System.out.println("Dizionario " + language + " loaded. Found " + dictionary.size() + " words.");
			
			return true;

		} catch (IOException e) {
			System.err.println("Errore nella lettura del file");
			return false;
		}
	}
	
	public List<RichWord> spellCheckText(List<String> inputTextList){
		List<RichWord> ltemp = new ArrayList<RichWord>();
		
		for(String parola: inputTextList) {
			
			RichWord richword = new RichWord(parola);
			
			if(dictionary.contains(parola.toLowerCase())) {
				richword.setCorrect(true);
				}
			else {
				richword.setCorrect(false);
			}
			
			ltemp.add(richword);
		}
		
		return ltemp;	
				
	}

}
