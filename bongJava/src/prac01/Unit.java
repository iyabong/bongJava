/*
 * Stream Filter Count Unit
 * ref: https://www.baeldung.com/java-stream-filter-count
 */
package prac01;

public class Unit {
	String name;
	String species;
	
	public Unit(String name, String species) {
		super();
		this.name = name;
		this.species = species;
	}
	
	@Override
	public String toString() {
		return "Unit [name=" + name + ", species=" + species + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
