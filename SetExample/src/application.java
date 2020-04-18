import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class application {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>(Arrays.asList("Chocolate","Pizza","BatataFrita", "Hamburguer","Sorvete"));
		Set<String> s2 = new LinkedHashSet<>(Arrays.asList("Chocolate","Pizza","BatataFrita", "Hamburguer","Sorvete"));
		Set<String> s3 = new TreeSet<>(Arrays.asList("Chocolate","Pizza","BatataFrita", "Hamburguer","Sorvete"));

		System.out.println("HashSet is more faster,but doesn't guarantee order");
		System.out.println(s1);
		System.out.println();
		System.out.println("LinkedHashSet is intermediate. Guarantee order in which they were inserted");
		System.out.println(s2);
		System.out.println();
		System.out.println("TreeSet is slower. Guarantees the order as CompareTo");
		System.out.println(s3);
	}
}
