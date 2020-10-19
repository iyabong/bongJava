/*
 * Stream Filter Count Unit
 * ref: https://www.baeldung.com/java-stream-filter-count
 */
package prac01;

import java.util.Arrays;
import java.util.List;

public class UnitMain {
	public static void main(String[] args) {

		Unit u1 = new Unit("Marine", "Terran");
		
		Unit u2 = new Unit("Medic", "Terran");
		Unit u3 = new Unit("Tank", "Terran");
		Unit u4 = new Unit("Tank", "Terran");

		Unit u5 = new Unit("Battle", "Terran");
		
		List<Unit> unitList = Arrays.asList(u1, u2, u3, u4, u5);
		
		for (Unit unit : unitList) {
			System.out.println(unit);
			if (unitList.stream().filter(u -> u.name.equals(unit.name)).count() > 1) {
				System.out.println(unit.name + "은 중복입니다");
			}
			
		}
		
		
		
	}
}
