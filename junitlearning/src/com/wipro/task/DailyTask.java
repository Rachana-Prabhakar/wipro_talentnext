package com.wipro.task;
import java.util.Arrays;

public class DailyTask {
	    public String[] stringConcat(String[] arr1, String[] arr2) {
	        String[] output = new String[arr1.length + arr2.length];
	        int count = 0;

	        for (int i = 0; i < arr1.length; i++) {
	            output[count++] = arr1[i];
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            output[count++] = arr2[i];
	        }

	        return output;
	    }

	    public boolean checkPresence(String[] arr, String s) {
	        return Arrays.asList(arr).contains(s);
	    }
	}

