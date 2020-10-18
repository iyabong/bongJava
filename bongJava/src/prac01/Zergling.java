package prac01;

public class Zergling {
	// 필드
	String name;		// 유닛명
	int attackUp;		// 공업 단계(0~3)
	int armorUp;		// 방업 단계(0~3)
	
	// 생성자
	public Zergling(String name, int attackUp, int armorUp) {
		this.name = name;
		this.attackUp = attackUp;
		this.armorUp = armorUp;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.attackUp + this.armorUp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Zergling) {
			Zergling tmp = (Zergling)obj;
			if (this.attackUp == tmp.attackUp && this.armorUp == tmp.armorUp) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Zergling [name=" + name + ", attackUp=" + attackUp + ", armorUp=" + armorUp + "]";
	}

	
}
