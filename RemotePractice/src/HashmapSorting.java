import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapSorting {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Jigar");
		hm.put(20, "Dalwadi");
		hm.put(15, "Yash");
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.putAll(hm);
		for(Map.Entry<Integer, String> m : hm.entrySet()){
			System.out.println(m);
		}
		System.out.println("new line");
		for(Map.Entry<Integer, String> m : tm.entrySet()){
			System.out.println(m);
		}
	}

}
