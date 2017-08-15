import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Name: John Parker Pearson
 * 
 * Instructions: Complete all of the TODO's
 */
/*
 * http://www.cs.duke.edu/csed/newapt/thesaurus.html
 */
public class Thesaurus {
  /**
   * Converts the elements of a String to a set. The format of a n-word String should be
   * "word1 word2 word3... wordn" That is, each word should be separated by exactly one space and
   * there should be no leading or trailing spaces.
   * 
   * @param s words with individual spaces separating words
   * @return elements of s as a Set
   */
	
  public Set<String> sToSet(String s) {
    // TODO: complete sToSet
	  String[] temp;
	 temp= s.split(" ");
	TreeSet<String> tempSet= new TreeSet<String>();
	for (int i=0; i<temp.length;i++)
	{
		tempSet.add(temp[i]);
  }
    return tempSet;
  }

  /**
   * Converts the elements in a collection to a space-separated list. That is, if the collection
   * contains [A, B, C, D], the method should return "A B C D". There should be no leading or
   * trailing spaces
   * 
   * @return the elements of elems as a space-separated String
   */
  public String collToS(Collection<String> elems) {
    // TODO: complete collToS
	  String collection="";
	  for (String s : elems){
		  collection=collection+s+" "; 
	  }
	  //System.out.println(collection + " " + collection.length());
	  collection=collection.substring(0,collection.length()-1);
    return collection;
  }


  /**
   * Returns the number of elements contained in both sets. The sets passed in should not be
   * changed.
   * 
   * @param a a set of words
   * @param b another set of words
   * @return number of elements in common to a and b
   */
  public int numInCommon(Set<String> a, Set<String> b) {
    // TODO: complete numInCommon
	  int common=0;
	  for (String s1: a ) 
	  for (String s2: b)
	  {
		  if (s1.equals(s2))
			  common=common+1;
	  }
	  
	  return common;
  }


  /**
   * Creates a new set that is the union of the given sets. The union of two sets is the set that
   * contains all of the elements of both sets.
   * 
   * Important: The sets passed in should not be modified.
   *
   * @param a a set of words
   * @param b another set of words
   * @return union of sets a and b
   */
  public Set<String> union(Set<String> a, Set<String> b) {
    // TODO: complete union
	  TreeSet<String> union = new TreeSet<String>(a);
	  union.addAll(b);
    return union;
  }

  /**
   * Creates an edited version of Thesaurus entries.
   * 
   * If any two entries have 2 or more words in common then they should be combined into a single
   * entry. The final Thesaurus must contain no pair of entries that have 2 or more words in common.
   * Each entry must contain no duplicates. The words within each element of the returned value must
   * be in alphabetical order, and the elements must appear in alphabetical order
   * 
   * @param entry each element is a list of words that are all synonyms
   * @return edited version of Thesaurus entries
   */
  public String[] edit(String[] entry) {
    // TODO: Convert entries from array of Strings to ArrayList of Sets
	 ArrayList<Set<String>> listOfSets = new ArrayList<Set<String>>(); 
    for( String s : entry)
    {
    	
    	listOfSets.add(sToSet(s));
    	//System.out.println("Adding: " + sToSet(s).size());
    }
	 /*
     * TODO: Keep merging entries until nothing gets merged
     * 
     * Pseudocode:
     * 
     * While merging still needed
     *   Let n be the number of elements in entrySet
     *   For every pair (i,j) where 0 <= i,j < n and i < j
     *      if entrySet[i] and entrySet[j] have >= 2 in common
     *          merge entrySet[i] and entrySet[j]
     */
    

    // TODO: Convert list of Sets to an array of Strings
    
    // TODO: Sort entries in alphabetical order
	boolean needsMerging=true;
	while (needsMerging)
	{
		int n=listOfSets.size();
		if (n<2)
			break;
		mainloop:
		for (int i=0; i<n-1;i++)
		{
		
			for (int j=i+1;j<n;j++)
			{
				
				if(numInCommon(listOfSets.get(i),listOfSets.get(j))>=2)
				{	
					
					listOfSets.add(union(listOfSets.get(i),listOfSets.get(j)));
					
					listOfSets.remove(j);
					listOfSets.remove(i);
					
					break mainloop;
				}
				
			}
			if (i==n-2)
			{
				
				needsMerging=false;
			}
		}
	}
	String[] answer=new String[listOfSets.size()];

	
	for (int i=0; i<listOfSets.size();i++)
	{
		answer[i]=collToS(listOfSets.get(i));
	}
	
	Arrays.sort(answer);
    return answer;
  }

  
   
    /*
     * TODO: add more tests below for the methods you wrote (Note: later you learn a better way to
     * test through JUnit)
     */
  }

