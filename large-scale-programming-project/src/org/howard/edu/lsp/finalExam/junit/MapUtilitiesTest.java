package org.howard.edu.lsp.finalExam.junit;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.howard.edu.lsp.finalExam.MapUtilities;
import org.howard.edu.lsp.finalExam.NullMapException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * @author julianf17
 */

class MapUtilitiesTest {

        @Test
    	@DisplayName("Test with two Hash-Maps for common key value pairs")
        void testCommonKeyValuePairs() throws NullMapException {
                HashMap <String, String> map1 = new HashMap <String, String>();
                map1.put("Alice", "Healthy");
                map1.put("Mary", "Ecastic");
                map1.put("Bob", "Happy");
                map1.put("Chuck", "Fine");
                map1.put("Felix", "Sick");
                
                
                
                HashMap <String, String> map2 = new HashMap <String, String>();
                map2.put("Mary" , "Ecastic");
                map2.put("Felix", "Healthy");
                map2.put("Ricardo", "Subperb");
                map2.put("Tam", "Fine");
                map2.put("Bob", "Happy");

                assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
        }
        
        @Test
    	@DisplayName("Test with one null Hash-Map")
        void testCommonKeyValuePairs2() {
                HashMap <String, String> map1 = new HashMap <String, String>();
                map1.put("Alice", "Healthy");
                map1.put("Mary", "Ecastic");
                map1.put("Bob", "Happy");
                map1.put("Chuck", "Fine");
                map1.put("Felix", "Sick");
                HashMap <String, String> map2 = null;
                int counter = 0;
                try {
                        counter = MapUtilities.commonKeyValuePairs(map1, map2);
                }
                catch(Exception e) {
                        assertEquals("One of the maps is empty!", e.getMessage());
                        assertEquals(0, counter);
                }
        }

        @Test
    	@DisplayName("Test with two null Hash-Maps")
        void testCommonKeyValuePairs3() {
                HashMap <String, String> map1 = null;
                HashMap <String, String> map2 = null;
                int counter = 0;
                try {
                        counter = MapUtilities.commonKeyValuePairs(map1, map2);
                }
                catch(Exception e) {
                        assertEquals("One of the maps is empty!", e.getMessage());
                        assertEquals(0, counter);
                }
        }


}