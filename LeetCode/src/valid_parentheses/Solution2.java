package valid_parentheses;

public class Solution2 {

	public boolean run(String s) {
		int lastLen = -1;
		while(true){
			if (s.indexOf("()") != -1 ||  s.indexOf("[]") != -1 || s.indexOf("{}") != -1) {
				s = s.replace("()", "");
				s = s.replace("[]", "");
				s = s.replace("{}", "");
			}
			if (lastLen == s.length()) {
				break;
			}
			
			lastLen = s.length();
		}
			
		return s.isEmpty();
	}
		

}
