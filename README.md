# WordsFinder
Finds all correct words from matrix of strings.

- Given an input of a list of strings representing a matrix of characters find all the valid words in that matrix. A valid words is a vertical or horizontal sequence of characters that are present in a dictionary   

The dictionary is defined by the following interface:
		
		public interface Dictionary {
	  	   boolean isValidWord(String word);
	    }	

# Sample Input
	   private static final String[] DEFAULT_PUZZLE = new String[] {

    	"akjbvaijdsbv_d_dbv",

    	"fjslkdfadsna_T_lfa",

       "asdfasdfsdfa_r_ads",

       "ckvsadfgfgjava_ajd",

       "akjbvaijdsbv_d_dbv",

       "cbvqiejdbfqi_e_qib",

       "asdjnaquekjdwdfabd",

       "asdk_word_kgrtuabd",

       "asdjnaquekjfghbdbd",

       "asewdfldfjdsfewrkf",

       "as_Shift_ejdccgabd",

    };

# Expectations:
* Can parse a list of strings into a proper data structure: matrix? tree?
* Realizes this is a DFS problem
* Implements a DFS algorithm
* Does not output repeated words
* Has/Proposes a way to test it
* Clear division of work between methods/classes/etc
    

# Bonus points:
* Actually creates a dictionary implementation
* Actually creates a dictionary implementation backed by a data store
* Changes algorithm to search words diagonally 