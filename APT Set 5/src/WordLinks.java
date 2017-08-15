import java.util.ArrayList;
import java.util.List;


public class WordLinks {
	
	public boolean isLinked(List<String> words, String from, String to,
			int links){
		if(isStep(from,to) && links > 0) { return true;
		}
		for(String s : words){ if(isStep(from,s)){
				List<String> copy = new ArrayList<String>(words); 
				copy.remove(s);
				if(isLinked(copy, s, to, links+1)) {
					return true;
				}
			} 
		}
	return false;
}
	
	public boolean isStep(String word1, String word2){
	int counter=0;
	for (int i=0; i<word1.length();i++) {
		if (word1.charAt(i)==(word2.charAt(i)))
			counter++;
	}
	if (counter>0)
	return true;
	else return false;
	}
	}
