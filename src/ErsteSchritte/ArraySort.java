/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErsteSchritte;

/**
 * Verschiedene Sortieralgorithmen 
 * @author Markus Badzura
 */
public class ArraySort 
{
    
    /**
     * Sortieralgorithmus Bubblesort
     * @param zahlen Array mit Int-Werten
     * @return durchsortierte Array-Liste
     */
    public static int[] sortBubble(int[] zahlen)
    {
        int temp;
	for(int i=1; i<zahlen.length; i++) 
        {
            for(int j=0; j<zahlen.length-i; j++) 
            {
		if(zahlen[j]>zahlen[j+1]) 
                {
                    temp=zahlen[j];
                    zahlen[j]=zahlen[j+1];
                    zahlen[j+1]=temp;
		}				
            }
        }
        return zahlen;
    }
    
    /** 
     * Sortieralgorithmus Insertion-Sort
     * @param zahlen mit Int-Werten
     * @return durchsortiertes Array mit Int-Werten
     */
    public static int[] sortInsertion(int[] zahlen) 
    {
	int temp;
        for (int i = 1; i < zahlen.length; i++) 
        {
            temp = zahlen[i];
            int j = i;
            while (j > 0 && zahlen[j - 1] > temp) 
            {
                zahlen[j] = zahlen[j - 1];
		j--;
            }        
            zahlen[j] = temp;
	}
	return zahlen;
    } 
    
    /**
     * Sortieralgorithmus Selection Sort
     * @param zahlen Array mit Int-Werten
     * @return durchsortiertes Array mit IntWerten
     */
    public static int[] sortSelection(int[] zahlen) 
    {
	for (int i = 0; i < zahlen.length - 1; i++) 
        {
            for (int j = i + 1; j < zahlen.length; j++) 
            {
		if (zahlen[i] > zahlen[j]) 
                {
                    int temp = zahlen[i];
                    zahlen[i] = zahlen[j];
                    zahlen[j] = temp;
		}
            }
	}
	return zahlen;
    }    
}
