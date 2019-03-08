

public class GcmAlgorithm {
	public static int findGcm(int n, int m) {
		if(n>m) {
			int remainder = n%m;
			if(remainder == 0) {
				return m;
			}else {
				return findGcm(m, remainder);
			}
		}
		else {
			int remainder = m%n;
			if(remainder == 0) {
				return n;
			}else {
				return findGcm(n, remainder);
			}
		}
		
	}
	public static void main(String[] args) {

		System.out.println(GcmAlgorithm.findGcm(12, 30));
		System.out.println(GcmAlgorithm.findGcm(GcmAlgorithm.findGcm(15, 200), 30));
		
		// fing gsm of an array
		int[] array = new int[] {24,44,58,98};
		int gsm = array[0];
		for(int i = 1 ; i< array.length; i++) {
			gsm = GcmAlgorithm.findGcm(gsm, array[i]);
		}
		System.out.println(gsm);
		int a1 = 97;
		double d = 97.00;
		System.out.println(a1==d);
		
	}

}
