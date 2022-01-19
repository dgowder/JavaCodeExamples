package javaCodeExamples;

import java.util.Arrays;
import java.util.HashSet;

public class FindingMissingAlbhabets {

	public static void main(String[] args) {
	//create string array and store a-z alphabets
		
		String[] alphabets="abcdefghijklmnopqrstuvwxyz".split("");
		
	//create input alphabet in string/string array
		String[] input = "a m".split(" ");
		
	//both string and string array pass to set
		HashSet<String> setAlpha = new HashSet<>(Arrays.asList(alphabets));
		HashSet<String> setInput = new HashSet<String>(Arrays.asList(input));
		
	//compare and remove the missing value in the set	
		
		setAlpha.removeAll(setInput);
		System.out.println(setAlpha);

		}

	}

