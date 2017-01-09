package utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UtilsPartitionTest {
	
	@Test
	public void test_List6_Size2_Resultat3()
	{
	List <Integer> liste = new ArrayList<Integer>();
	liste.add(1);
	liste.add(2);
	
	liste.add(3);
	liste.add(4);
	
	liste.add(5);
	liste.add(6);	
	List<List<Integer>> resultat = UtilsPartition.partion(liste, 2);
	assertTrue(resultat.size()==3);
	System.out.println(resultat);
	
	
	}
	@Test
	public void test_List6_Size7_Resultat4()
	{
	List <Integer> liste = new ArrayList<Integer>();
	liste.add(1);
	liste.add(2);
	
	liste.add(3);
	liste.add(4);
	
	liste.add(5);
	liste.add(6);
	liste.add(7);
	List<List<Integer>> resultat = UtilsPartition.partion(liste, 8);
	assertTrue(resultat.size()==1);
	System.out.println(resultat);
	
	
	}
	@Test
	public void test_ListVide_Size2_Resultat0()
	{
	List <Integer> liste = new ArrayList<Integer>();
	List<List<Integer>> resultat = UtilsPartition.partion(new ArrayList(), 2);
	assertTrue(resultat.size()==0);
	//System.out.println(resultat);
	
	
	}
	@Test
	public void test_ListNull_Size2_ResultatNull()
	{
	List <Integer> liste = new ArrayList<Integer>();
	List<List<Integer>> resultat = UtilsPartition.partion(null, 2);
	assertTrue(resultat==null);
	//System.out.println(resultat);
	
	
	}



}
