/**
 * Created by Darpan Shah Jul 20, 2017
 */ 
package com.parth.mate.che.mavo;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.SynchronousQueue;

import com.parth.mate.che.service.Dictionary;

/**
 * @author DARPAN
 *
 */
public class ValidWords {
	private static Set<String> set = new TreeSet<>();
	private static Dictionary dic;
	
	public static String[] findValidWords(String[] input){
		char[][] matrix = new char[input.length][];
		for(int i=0; i<input.length; i++){
			String si = input[i];
			for(int j=0; j<si.length(); j++){
				matrix[i][j] = si.charAt(j);
			}
		}
		for(int i=0; i<input.length-1; i++){
			for(int j=(i+1); j<matrix[i].length; j++){
				if(dic.isValidWord(""+matrix[i][i] + "" +matrix[i][j])){
					set.add(""+matrix[i][i] + "" +matrix[i][j]);
				}
				
				if(dic.isValidWord(""+matrix[i][j] + "" +matrix[i][i])){
					set.add(""+matrix[i][j] + "" +matrix[i][i]);
				}
			}
		}
		
		for(int i=0; i<matrix[i].length; i++){
			for(int j=(i+1); j<input.length-1; j++){
				if(dic.isValidWord(""+matrix[i][i] + "" +matrix[j][i])){
					set.add(""+matrix[i][i] + "" +matrix[j][i]);
				}
				if(dic.isValidWord(""+matrix[j][i] + "" +matrix[i][i])){
					set.add(""+matrix[j][i] + "" +matrix[i][i]);
				}
			}
		}
		System.out.println(set);
		return new String[] {""};
	}
}
