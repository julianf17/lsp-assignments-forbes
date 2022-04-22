package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author julianf17
 * MapUtilities: offers a method for determining if two hash-maps have any common key-value pairs.
 *
 */


public class MapUtilities {
	/**
	 * finds typical key value pair of two HashMaps.
	 * @param map1, map2
	 * @return If either or both maps passed are empty;returns zero 
	 * @throws NullMapException
	 */
        public static int commonKeyValuePairs(HashMap < String, String > map1, HashMap < String, String > map2) throws NullMapException {
                int i = 0;
                if(map1 == null || map2 == null)
                        throw new NullMapException("One of the maps is empty!");
                for (Map.Entry < String, String > set:
                        map1.entrySet()) {
                        if(map2.containsKey(set.getKey()))
                        {
                        	if(set.getValue().equals(map2.get(set.getKey())))
                        		i++;
                        }
                }
                return i;
        }
}
