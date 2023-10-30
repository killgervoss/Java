package listInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public void hashing(){
        Set<String> set = new HashSet<String>();
        set.add("cat");
        set.add("bat");
        set.add("rat");

        for (String st: set) {
            System.out.println(st);
        }
    }
    
}
 