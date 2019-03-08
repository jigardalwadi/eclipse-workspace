import java.lang.*;
import java.util.*;

public class Permutations {
	 public static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res = new ArrayList<>();
	        return permuteUtil(nums, 0, res);
	    }
		
	private static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    private static List<List<Integer>> permuteUtil(int[] num, int index, List<List<Integer>> res){
        if(num.length==index){
            List<Integer> temp = new ArrayList<>();
            for(int i:num) temp.add(i);
            res.add(temp);
        }
        else{
            for(int i = index; i<num.length; i++){
                swap(num, index, i);
                permuteUtil(num, index+1, res);
                swap(num, index, i);
            }
        }
        return res;
    }
   
	public static void main(String[] args) {
		 int[] list= new int[3];
		 list[0]=1;
		 list[1]=2;
		 list[2]=3;
		 //list[3]=4;
		 
		 System.out.println(Permutations.permute(list));
	}

}
