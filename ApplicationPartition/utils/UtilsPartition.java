package utils;


import java.util.*;

public class UtilsPartition {
	
public static List<List<Integer>> partion ( List<Integer> liste, int size)
{
	if(liste==null || size<=0) {
		return null;
	}
	
	List<List<Integer>> resultat = new ArrayList<>(); 
	int from =0;
	int to=0;
	while(from < liste.size())
	{
		to=from+size;
		if(to>liste.size()){
			to=liste.size();
		}
		
		resultat.add(liste.subList(from, to));
		from=to;
		
	}
return resultat;	
}

}
