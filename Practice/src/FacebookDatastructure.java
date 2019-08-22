import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FacebookDatastructure {
	static HashMap<FBuser,Set<FBuser>> map=new HashMap<>();
	static {
		FBuser user1=new FBuser("Avinash");
		user1.addFrnd(new FBuser("Swati"));
		user1.addFrnd(new FBuser("Anurag"));
		user1.addFrnd(new FBuser("Abhay"));
		user1.addFrnd(new FBuser("Ambrish"));
		FBuser user2=new FBuser("Neha");
		user2.addFrnd(new FBuser("Abhay"));
		user2.addFrnd(new FBuser("Ambrish"));
		map.put(user1,user1.getFrndList() );
		map.put(user2, user2.getFrndList());
	}
	public List<FBuser> getRecommendations(String user){
		List<FBuser> list=new ArrayList<>();
		if(map.containsKey(user)) {
			for(Map.Entry<FBuser,Set<FBuser>>entry:map.entrySet()) {
				FBuser key=entry.getKey();
				if(!user.equals(key) && Math.abs(map.get(user).size()-map.get(key).size())>=2) {
					list.add(key);
				}
			}
		}
		return list;
		
	}
}
