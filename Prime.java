package com.prime.p1;

import java.util.Arrays;

public class Prime {
	public  int[] king(int n){
	    int [] primes=new int[n];
		int k=0; 
	    for(int i=3;i<=n;i++) {
	    	int c=0;
	    	for(int j=2;j<i;j++) {
	    		if(i%j==0) {
	    			c++;
	    		}
	    		else {
	    		
	    		}
	    	}
	    	if(c==0) {
	    		primes[k]=i;
	    		k++;
	    	}
	    }
	    System.out.println(Arrays.toString(primes));
		return primes;
	}

}
