
public class CompareMergeAndQuick {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();
		  int[] arr = {4,99,2,1,77,55,33,2,4,5,6,55,66,77,88,99,33,22,55,444,456};
		  int[] arrQ = new int[arr.length];
		  for(int i = 0 ;i<arr.length;i++) {
			  arrQ[i]=arr[i];
		  }
		  mergeSort(arr);
		  
		  for(int i = 0;i<arr.length;i++) {
			  System.out.print(arr[i]+" ");
		  }
		  long end =System.currentTimeMillis();
	        
	        System.out.println();
	        System.out.println("Time of execution for SortMerge is:");
	        System.out.println((end-start)+"millesec");
	        
	        
	        long start2 =System.currentTimeMillis();
	    	
	        int n = arrQ.length;
	 
	        QuickSort ob = new QuickSort();
	        ob.sort(arr, 0, n-1);
	 
	        
	        //printArray(arrQ);
long end2 =System.currentTimeMillis();
	        
	        

System.out.println("Time of execution for QuickSort is:");
	        System.out.println((end2-start2)+"millesec");
	  }

	private static void mergeSort(int[] arr) {
		int length = arr.length;
		if(length<=1) {
			return;
		}
		
		int middle = length/2;
		int[] leftarr = new int[middle];
		int[] rightarr = new int[length-middle];
		
		
		int j = 0;
		
		for(int i = 0;i<length;i++) {
			if(i<middle) {
				leftarr[i] = arr[i];
			}else {
				rightarr[j]=arr[i];
				j++;
			}
		}
		mergeSort(leftarr);
		mergeSort(rightarr);
		merge(leftarr,rightarr,arr);
		
	}
	
	
	private static void merge(int []leftarr,int[]rightarr,int[] arr) {
		int leftSize = arr.length/2;
		int rightSize = arr.length-leftSize;
		int i =0,l=0,r=0;
		
		while(l<leftSize && r < rightSize ) {
			if(leftarr[l]<rightarr[r]) {
				arr[i] = leftarr[l];
				i++;
				l++;
			}
			else {
				arr[i] = rightarr[r];
				i++;
				r++;
			}
		}
		while(l<leftSize) {
			arr[i]=leftarr[l];
			i++;
			l++;
			
		}
      while(r<rightSize) {
			arr[i] = rightarr[r];
			i++;
			r++;
			
		}
	}
      
      //for QuickMerge
      
      int partition(int arrQ[], int low, int high)
	    {
	        int pivot = arrQ[high];
	        int i = (low-1); 
	        for (int j=low; j<high; j++)
	        {
	        
	            if (arrQ[j] <= pivot)
	            {
	                i++;
	 
	               
	                int temp = arrQ[i];
	                arrQ[i] = arrQ[j];
	                arrQ[j] = temp;
	            }
	        }
	 
	       
	        int temp = arrQ[i+1];
	        arrQ[i+1] = arrQ[high];
	        arrQ[high] = temp;
	 
	        return i+1;
	    }
	 
	 
	   
	    void sort(int arrQ[], int low, int high){
	        if (low < high)
	        {
	            
	            int pi = partition(arrQ, low, high);
	 
	            
	            sort(arrQ, low, pi-1);
	            sort(arrQ, pi+1, high);
	        }
	    }
	 
	   
	    static void printArray(int arrQ[])
	    {
	        int n = arrQ.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arrQ[i]+" ");
	        System.out.println();
	    }

	

}
