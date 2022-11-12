package demo1;

import java.util.Arrays;

public class FilterDublicate {
	void removeDublicate(int[] lst) {
	
        int index = 0; 
        int[] flst = new int[lst.length];
        
        for (int i = 0; i < lst.length; i++)   
        {      
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < lst.length; j++)   // or for(j=0; j<i ; j++)
            {   
                if (lst[i] == lst[j])   
                {   
                    break;   
                }   
            }   
    
            if (j == i)    
            {   
                flst[index++] = lst[i];   
            }   
        }  
        for(int k =0; k<index; k++) {
        	System.out.print(flst[k]+" ");
        }
        System.out.println();
       
    }   
	
	//or
	
	public static void filterdublicate(int[] arr) {
		int visited=-1;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==arr[i]) {
					arr[j]=visited;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=visited) {
				System.out.print(arr[i]+" ");
			}
		}
		}
    
	public static void main(String[] args) {
		int[] lst = new int[] {3,4, 6, 2, 4, 2, 4, 3, 2};
		FilterDublicate fd= new FilterDublicate();
		fd.removeDublicate(lst);  //or
		
		int[] arr = {3,4,6,2,4,2};
		fd.filterdublicate(arr);

}
	}
