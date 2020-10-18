package prac01;

import java.util.HashSet;
import java.util.Set;

public class ZerglingMain {
	public static void main(String[] args) {
		Set<Zergling> set = new HashSet<>();
		
		Zergling z1 = new  Zergling("Zergling", 0, 0);		// 노업 저글링
		Zergling z2 = new  Zergling("Zergling", 0, 0);		// 노업 저글링
		Zergling z3 = new  Zergling("Zergling", 0, 0);		// 노업 저글링
		Zergling z4 = new  Zergling("Zergling", 3, 0);		// 공3업 저글링
		Zergling z5 = new  Zergling("Zergling", 3, 3);		// 풀업 저글링
		Zergling z6 = new  Zergling("Zergling", 3, 3);		// 풀업 저글링
		Zergling z7 = new  Zergling("Zergling", 1, 1);		// 공방1업 저글링
		
		set.add(z1);
		set.add(z2);
		set.add(z3);
		set.add(z4);
		set.add(z5);
		set.add(z6);
		set.add(z7);
		
		System.out.println("set.size(): " + set.size());
		for (Zergling z : set) {
			System.out.println(z.hashCode());
			System.out.println(z);
		}
		
	}
}
