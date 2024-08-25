package com.evergent.corejava.Strings;

 
public class coding 
{
	public static void main(String[] args) 
	{
	       String str="ABCDEFGHIJKLMNOPQRSTUVWXYZA";
	       int[] arr=new int[str.length()];
	       int i,j,k;
	       for(i=0;i<str.length();i++)
	       {
	    	   if(arr[i]==0)
	    	   {
	    		   for(j=i+1;j<str.length()-2;j++)
		    	   {
		    		   if(arr[j]==0)
		    		   {
		    			   break;
		    		   }
		    	   }
		    	   for(k=j+1;k<str.length();k++)
		    	   {
		    		   if(arr[k]==0)
		    		   {
		    			   System.out.print(str.charAt(i)+""+str.charAt(k)+" ");
		    			   arr[i]=1;
		    			   arr[k]=1;
		    			   break;
		    		   }
		    	   } 
	    	   }  
	       }      
	}

}
