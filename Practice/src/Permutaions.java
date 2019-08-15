import java.util.HashSet;

public class Permutaions {
	public HashSet<String> permuation(String s){
		HashSet<String> list=new HashSet<String>();
	
		permuation(s,"",list);
		return list;
	}

	private void permuation(String suffix, String prefix, HashSet<String> list) {
		if(suffix.isEmpty()) {
			list.add(prefix);
		}
		else {
			for(int i=0;i<suffix.length();i++) {
				list.add(suffix.substring(0,i)+suffix.substring(i+1,suffix.length()));
				permuation(suffix.substring(0,i)+suffix.substring(i+1,suffix.length()), prefix+suffix.charAt(i), list);
		}
		}
		
	}
	
}
