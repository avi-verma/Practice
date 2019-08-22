import java.util.List;
import java.util.Set;

public class FBuser {
	String name;
	Set<FBuser> frndList;
	public FBuser(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<FBuser> getFrndList() {
		return frndList;
	}
	public void setFrndList(Set<FBuser> frndList) {
		this.frndList = frndList;
	}
	public void addFrnd(FBuser user) {
		this.getFrndList().add(user);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FBuser other = (FBuser) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
