
public class ConcatenatingStrings {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		String s1 = "Stol";
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		String s = "P";
		
		for (int i = 0; i < 100000; i++) {
			s+="P";
		}
		long duration = System.currentTimeMillis() - start;
		System.out.println("duration with plus = " + duration);
		
		System.out.println("------------------------------------");
		long start1 = System.currentTimeMillis();
		
		s = "P";
		for (int i = 0; i < 100000; i++) {
			s = s.concat("P");
		}
		long duration1 = System.currentTimeMillis() - start1;
		System.out.println("duration with concat = " + duration1);
		
		System.out.println("------------------------------------");
		long start2 = System.currentTimeMillis();
		
		
		StringBuilder sb = new StringBuilder("P");
		for (int i = 0; i < 100000; i++) {
			sb.append("P");
		}
		long duration2 = System.currentTimeMillis() - start2;
		System.out.println("duration with stringbuilder = " + duration2);
	}
}
