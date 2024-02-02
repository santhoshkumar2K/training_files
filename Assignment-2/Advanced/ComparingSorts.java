import java.util.Arrays;
import java.util.Scanner;
public class ComparingSorts
{ 
    public static long insersionSort(int []arr)
     {
         long start=0 , end=0;
       start= System.currentTimeMillis();
         for(int i=1;i<arr.length;i++)
         {
             for(int j=i;j>0;j--)
             {
                  if(arr[j]<arr[j-1])
                  {
                      int tem=arr[j];
                      arr[j]=arr[j-1];
                      arr[j-1]=tem;
                  }else{
                      break;
                  }
             }
         }
       end= System.currentTimeMillis();  
       return end-start;  
     }
     public static long selectionSort(int []arr)
     {
         int min=0,minIndex=0; long start=0 , end=0;
       start= System.currentTimeMillis();
         for(int i=0;i<arr.length;i++)
         {
             min=arr[i];
             minIndex=i;
             for(int j=i+1;j<arr.length;j++)
             {
                 if(min>arr[j])
                 {
                     min=arr[j];
                     minIndex=j;
                 }
             }
              int tem =arr[i];
              arr[i]=arr[minIndex];
              arr[minIndex]=tem;
         }
        end= System.currentTimeMillis(); 
        return end-start;  
     }
     public static long bobbleSort(int arr[])
     {
          long start=0 , end=0;
        start= System.currentTimeMillis();
         for(int i=1;i<arr.length;i++)
         {
             for(int j=0;j<arr.length-i;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int tem=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=tem;
                 }
             }
         }
        end= System.currentTimeMillis();   
        return end-start; 
     }
     public static void quickSort(int arr[],int low,int high)
     {
         int start=low;
         int end=high;
         int holdIndex=(low+high)/2;
         int hold=arr[holdIndex];
       if(start>=end)
       {
           return;
       }
        while(start<=end)
        {
            while(arr[start]<hold)
            {
                start++;
            }
            while(arr[end]>hold)
            {
                end--;
            }
            
            if(start<=end)
            {
                int tem=arr[start];
                arr[start]=arr[end];
                arr[end]=tem;
                start++;
                end--;
            }
        }
        quickSort(arr,start,high);
        quickSort(arr,low,end);
     }
     private static int[] arrayDeclare(int num)
     {
        int []tem=new int[num];  
          for(int i=0;i<num;i++)
          {
		     tem[i]=(int)(Math.random()*num*2);
          }
        return tem  ;
     }
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	 int element=0;
	 System.out.println("Enter a huge length for huge array");
	 try
	 {
		     element=scan.nextInt();
	 }catch(java.util.InputMismatchException e)
	 {
	      System.out.println("                                    Invalied Input please enter a number:");
	      main(new String[]{"",""});
	      return; 
	 }	    	     
		 int []array=new int[element];  
		 long insersion=0, selection=0 ,bubble=0, quick=0;
		 long start=0, end=0;
          bubble= bobbleSort(arrayDeclare(element));
          System.out.println("Bubble sort takes "+bubble);
              insersion=insersionSort(arrayDeclare(element));
              System.out.println("Insersion sort takes "+insersion);
                      selection=selectionSort(arrayDeclare(element)); 
                      System.out.println("Selection sort takes "+selection);
                            int []a=arrayDeclare(element);
                            start= System.currentTimeMillis();
		               quickSort(a,0,a.length-1);
		            end= System.currentTimeMillis();
		            quick=end-start;
		            System.out.println("Quick sort takes "+quick);  
		            scan.close();
       
	}
}

