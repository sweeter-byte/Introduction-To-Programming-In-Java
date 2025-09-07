/*
 * Java API
 * Reuse classes to avoid extra work
 * https://docs.oracle.com/javase/6/docs/api/
 */

/*
 * ArrayList:
 * 1. Modifiable list
 * 2. Internally implemented with arrays
 * 
 * Features:
 * 1. Get/put items by index
 * 2. Add items
 * 3. Delete items
 * 4. Loop over all items
 */
package Lect5;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");

        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println();

        strings.set(0,"Goodbye");
        strings.remove(1);

        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println();
        for(String s : strings) {
            System.out.println(s);
        }
    }
}

/*
 * Sets:
 * Only one copy of each object
 * No array index (important)
 * 
 * Features:
 * Add objects to the set
 * Remove objects from the set
 * Is an object in the set?
 * 
 * TreeSet: Sorted(lowest to highest)
 * HashSet: Unordered(pseudo-random)
 */

class SetExample{
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");

        System.out.println(strings.size());
        System.out.println(strings.first());
        System.out.println(strings.last());

        strings.remove("Eugene");

        for(String s : strings) {
            System.out.println(s);
        }
    }
}

/*
 * Maps:
 * Stores a (key,value) pair of objects
 * Look up the key, get back the value
 * 
 * Example: Address Book
 * Map from names to email addresses
 * 
 * TreeMap: Sorted(lowest to highest)
 * HashMap: Unordered(pseudo-random)
 */

class MapExample{
    public static void main(String[] args) {
        HashMap<String,String> strings = new HashMap<String,String>();
        strings.put("Evan", "abb@mit.edu");
        strings.put("Eugene", "cee@mit.edu");
        strings.put("Adam", "iwdh@mit.edu");

        System.out.println(strings.size());
        strings.remove("Evan");
        System.out.println(strings.get("Eugene"));

        for(String s: strings.keySet()) {
            System.out.println(s);
        }

        for(String s: strings.values()) {
            System.out.println(s);
        }

        for(Map.Entry<String,String> pairs:strings.entrySet()) {
            System.out.println(pairs);
        }
    }
}