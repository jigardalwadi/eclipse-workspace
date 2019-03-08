import java.util.Arrays;
import java.util.HashMap;

public class CropRatio {
  

    public static void main(String[] args) {
    	String name = "wd,wd" ;
    	
    	char[] ch = name.toCharArray();
    	String[] ch1 = name.split(",");
    	Arrays.sort(ch1);
    	System.out.println(ch1[1]);
    	for(int i=0;i<ch.length; i++) {
    		System.out.println(ch[i]);
    	}
    	
    }
}