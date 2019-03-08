import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkChain {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) { // begin while loop
			String givenChain = scanner.nextLine();

			if (!givenChain.trim().equals("")) { // begin if input is not null
				String[] nodes = givenChain.split(";");

				List<String> nodeHeads = new LinkedList<>();
				List<String> nodeTails = new LinkedList<>();
				List<String> pairedNodeHeadsTails = new LinkedList<>();

				// begin for loop for chain array and populate the linked list
				for (String node : nodes) { 
					String[] headTails = node.split("-");
					if (!headTails[0].equals(headTails[1])) { // if assymmetric chain
						nodeHeads.add(headTails[0].toLowerCase());
						nodeTails.add(headTails[1].toLowerCase());
					} else { // if symmetric chain use push down automata
						if (!pairedNodeHeadsTails.contains(headTails[0].toLowerCase())) {
							pairedNodeHeadsTails.add(headTails[0]);
						} else {
							pairedNodeHeadsTails.remove(headTails[0]);
						}

					}
				} // end for loop for chain array

				// both nodeHeads and nodeTails should be equal in size
				// and paired node should be length zero
				if (nodeHeads.size() != nodeTails.size() || pairedNodeHeadsTails.size() != 0) {
					System.out.println("BAD");
				} else {

					// find and remove the word begin and end of the given chain
					int beginIndex = nodeHeads.indexOf("begin");
					int endIndex = nodeTails.indexOf("end");
					if (beginIndex > -1 && endIndex > -1) {
						nodeHeads.remove(beginIndex);
						nodeTails.remove(endIndex);
					} else {
						System.out.println("BAD");
					}

					// using iterator to find and remove simueltaneously
					Iterator<String> iters = nodeHeads.iterator();
					while (iters.hasNext()) {
						String s = iters.next();
						if (nodeTails.contains(s)) {
							nodeTails.remove(s);
							iters.remove();
						}
					}

					// after removal of the common elements,
					// both nodeHeads nad nodeTails should be zero size
					if (nodeHeads.size() == 0 && nodeTails.size() == 0) {
						System.out.println("GOOD");
					} else {
						System.out.println("BAD");
					}

				}
			} // end if input is not null
		} // end while loop
		scanner.close();
	}
}
