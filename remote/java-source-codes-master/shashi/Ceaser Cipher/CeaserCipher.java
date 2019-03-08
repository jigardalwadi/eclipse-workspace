package task2;

import java.io.*;
import java.util.Scanner;

public class CeaserCipher		//very well done Shashi
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
 
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
          // System.out.println(charPosition+"\n");
           if(charPosition==-1) {
        	   cipherText += " ";
           }
           else {
            int keyVal = (shiftKey + charPosition) % 26;
      //      System.out.println(keyVal+"\n");
            char replaceVal = ALPHABET.charAt(keyVal);
        //    System.out.println(replaceVal+"\n");
            cipherText += replaceVal;
        }
        }
        return cipherText;
    }
 
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
  //          System.out.println(charPosition+"\n");
            if(charPosition==-1) {
            	plainText += " ";
            }
            else {
            int keyVal = (charPosition - shiftKey) % 26;
    //        System.out.println(keyVal+"\n");
            char replaceVal = ALPHABET.charAt(keyVal);
      //      System.out.println(replaceVal+"\n");
            plainText += replaceVal;
            }
        
        }
        return plainText;
    }
 
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
    	String newMessage=new String();
    	newMessage=sc.nextLine();
    	String crypt=new String();
    	for(int i=0;i<newMessage.length();i++) {
    		int j=(int)newMessage.charAt(i);
    		j=j+3;
    		crypt+=(char)j;
    	}
    	System.out.println("encrypted with ASCII : "+ crypt);
        String message = new String();
       // message = sc.next();
        FileReader fileReader = new FileReader("sample.txt");
        
        String fileContents = "";
       
        int i ;
       
        while((i =  fileReader.read())!=-1){
         char ch = (char)i;
       
         fileContents = fileContents + ch; 
        }
       
        System.out.println(fileContents);
        message=fileContents;
        fileReader.close();
        System.out.println(encrypt(message, 3));
        try (PrintWriter out = new PrintWriter("result.txt")) {
            out.println((encrypt(message, 3)));
        }
        System.out.println(decrypt(encrypt(message, 3), 3));
        sc.close();
    }
}
