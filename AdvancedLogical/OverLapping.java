import java.util.Scanner;
public class OverLapping
{
public static  int[][] merge(int[][] intervals) {
        
        int a[][]=intervals;
   int overlap[][]= new int [a.length][2];
   int b[][]=overlap;
    int start=a[0][0];
    int end=a[0][1];int k=1;
    overlap[0][0]=start;
    overlap[0][1]=end;
     for(int i=1;i<a.length;i++)
     {
        if(start<a[i][0] && end>=a[i][0])
        {
            if(end<a[i][1])
            {                                        // System.out.println(start+"-"+end+"| "+a[i][0]+","+a[i][1]);
                overlap[k][0]=start;
                overlap[k][1]=a[i][1];
                end=overlap[k][1];
                k++;
            }else{
                 overlap[k][0]=start;       
                overlap[k][1]=end;
                k++;
            }
       
        }else{
            overlap[k][0]=a[i][0];
            overlap[k][1]=a[i][1];
            start=a[i][0];
            end=a[i][1];
            k++;
            }
     }             
      System.out.print("[");int j;
     for( j=0;j<overlap.length-1;j++)
     {
         if(overlap[j][0]>=overlap[j+1][0])
         {                                         
             overlap[j][0]=0;
              overlap[j][1]=0;
         }else{
             System.out.print("["+overlap[j][0]+","+overlap[j][1]+"],");
         }
     }
     System.out.print("["+overlap[j][0]+","+overlap[j][1]+"]");
     System.out.print("]");
     System.out.println();
     /*int t[][]= new int[overlap.length-c][2];int h=0;
     for(int u[]:overlap)
     {
         if(u[0]!=0 && u[1]!=0)
         {
             t[h][0]=u[0];
             t[h][1]=u[1];
             h++;
         }
     }*/
       
   return null;
    }
	public static void main(String[] args) {
	 // int intervals[][] = {{1,3},{5,8},{4,10},{20,25}};
	  //int intervals[][] ={{1,4},{4,5}};
	 // int intervals[][] ={{1,3},{2,6},{8,10},{15,18}};
	// int intervals[][] = {{1,3},{2,4},{6,8},{9,10}}  ;           //{{1, 4}, {6, 8}, {9, 10}}
	 int intervals[][] ={{6,8},{1,9},{2,4},{4,7}};                 //1,9
	 //int s[][]= 
	 merge(intervals);//System.out.println(Arrays.deepToString(s));
	
	}

}

