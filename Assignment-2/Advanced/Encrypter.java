import java.util.Scanner;
import java.io.*;
public  class Encrypter
{ 
  public static void process(Scanner scan)throws IOException
  { 
	      FileInputStream fileIn=null;
	try{
	    System.out.println("Enter a Source file name:");
	    fileIn= new FileInputStream(scan.next());
	 }catch(FileNotFoundException e)
         {
	      System.out.println("             ! This file not found! so try again..");
	        encrypted(scan);
	        return;
         }
   	     System.out.println("enter a encryptor: ");
    	      char encKey=scan.next().charAt(0);
             System.out.println("Enter a destination (encrypted) file name:");	 
	  FileOutputStream fileOut= new FileOutputStream(scan.next());
	       int data=0;
	       while((data=fileIn.read())!=-1)
	       {
	           fileOut.write((encKey^(char)data));
	       }
	          fileOut.flush();
	          fileOut.close();
	          fileIn.close();         
  }
  public static void encrypted(Scanner scan)throws IOException
  {
     process(scan);  
  }
  public static void decrypted(Scanner scan)throws IOException
  {
     process(scan);   
  }
public static void main(String[]arg)throws IOException
{
     Scanner scan = new Scanner(System.in); 
           encrypted(scan);
      System.out.println("          Encrypted Successfully"); 
      System.out.println("Are you decrypted ! enter 1:");
      int input=scan.nextInt();
       if(input==1)
       {
           decrypted(scan);
           System.out.println("          Decrypted Successfully"); 
       } 
     System.out.println("          thank you ");   
             scan.close(); 
}
}
