package solution;

/*当HashMap中key不重复时,返回的是null,当key已存在时,返回旧值
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
	public boolean wordPattern(String pattern, String str) {
	    String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (int i=0; i<words.length; ++i)
	        if (!Objects.equals(index.put(pattern.charAt(i), i),
	                            index.put(words[i], i)))
	            return false;
	    return true;
	}
}
