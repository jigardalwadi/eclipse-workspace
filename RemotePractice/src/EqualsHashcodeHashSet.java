import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EqualsHashcodeHashSet implements Comparable<EqualsHashcodeHashSet> {

	private static final int List = 0;
	int id;
	String firstName;
	String lastName;
	static String mname ="Jigar";
	
		
	public EqualsHashcodeHashSet() {
		super();
	}

	public EqualsHashcodeHashSet(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashcodeHashSet other = (EqualsHashcodeHashSet) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EqualsHashcodeHashSet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public int compareTo(EqualsHashcodeHashSet o) {
		return this.id - o.id == 0 ? this.firstName.compareTo(o.firstName) : this.id - o.id;
	}
	static int i =0;
	
	static {
		System.out.println(i);
	}

	
	public static void main(String[] args) {

		//HashSet<EqualsHashcodeHashSet> hs = new HashSet<>();

		/*hs.add(new EqualsHashcodeHashSet(11, "Jigar", "Dalwadi"));
		hs.add(new EqualsHashcodeHashSet(11, "Jar", "Daadi"));
		hs.add(new EqualsHashcodeHashSet(1, "Jiar", "Dlwadi"));
		hs.add(e2);

		Set<EqualsHashcodeHashSet> hs1 = new HashSet<>(Arrays.asList(new EqualsHashcodeHashSet[] { e1, e2, e3, e4 }));
		// hs1.forEach(x -> System.out.println(x));

		// hs1.add(null);

		TreeSet<EqualsHashcodeHashSet> ts = new TreeSet<>((x, y) -> x.firstName.compareTo(y.firstName));
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4); 
		ts.forEach(x -> System.out.println(x));

		Set<EqualsHashcodeHashSet> s = Collections.synchronizedSet(hs1);
		// s.forEach(System.out::println);
		Collections.unmodifiableSet(s);

		// System.out.println(s.contains(15));
		TreeSet<EqualsHashcodeHashSet> copyTS = new TreeSet<>();
		// copyTS = (TreeSet<EqualsHashcodeHashSet>)
		// Collections.unmodifiableCollection(ts);
		// copyTS.add(e4);
		ts.add(new EqualsHashcodeHashSet(15, "FF", "FSFS"));
		// ts.add(null);
		EqualsHashcodeHashSet e6;
		copyTS.forEach(System.out::println);
		System.gc();
		// hs1.forEach(System.out::println);
		
		 * for (EqualsHashcodeHashSet temp : hs) { System.out.println(temp); }
		 */

		EqualsHashcodeHashSet e1 = new EqualsHashcodeHashSet(101, "Jigar", "Dalwadi");
		EqualsHashcodeHashSet e2 = new EqualsHashcodeHashSet(101, "w", "DEDe");
		EqualsHashcodeHashSet e3 = new EqualsHashcodeHashSet(103, "JR", "FGE");
		EqualsHashcodeHashSet e4 = new EqualsHashcodeHashSet(104, "RJD", "eed");

		EqualsHashcodeHashSet e5 = new EqualsHashcodeHashSet();

		/*e5.setFirstName("fvvffff");
		e5.setId(50);
		e5.setLastName("eded");*/
		
		System.out.println(e5);
		
		List<EqualsHashcodeHashSet> list1 = Arrays.asList(e1,e2,e3,e4,e5);
		List<EqualsHashcodeHashSet> list2 = list1
		//.stream()
		.parallelStream()
		//.filter(x->x.getId()>49)
		//.sorted((x1,x2)-> x1.getFirstName().compareTo(x2.getFirstName()))
		//.forEach(x->System.out.println(x));
		.collect(Collectors.toList());
		
		for(EqualsHashcodeHashSet e : list2) {
			System.out.println(e);
		}
		
		
		
		
	}
	
	
}
