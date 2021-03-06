package core.com.udemy.timbuchalka.section15_IO.filewriter;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    // Use PrintWriter
//    public static void main(String[] args) {
//        PrintWriter fileWriter = null;
//        try {
//            fileWriter = new PrintWriter("locations.txt");
//            for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
//                fileWriter.write( entry.getKey() + ", " + entry.getValue().getDescription() + "\n");
//            }
//        } catch (IOException e) {
//            System.out.println("In catch block");
//        } finally {
//            fileWriter.flush();
//            fileWriter.close();
//            System.out.println("In finally block");
//        }
//    }

    // Use FileWriter
//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("locations.txt");
//            for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
//                fileWriter.write( entry.getKey() + ", " + entry.getValue().getDescription() + "\n");
//            }
//        } catch (IOException e) {
//            System.out.println("In catch block");
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("In catch of filewriter close block");
//            }
//            System.out.println("In finally block");
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken = " + (endTime - startTime));
//    }

    // Use FileWriter + BufferWriter(use bufferwriter will make your write process become faster)
    public static void main(String[] args) {
        try {
            writeProcess();
        } catch (IOException e) {
            System.out.println("Excpetion is thrown from previous method called");
        }
    }

    // the method that use try-with-resource
    public static void writeProcess() throws IOException {
        long startTime = System.currentTimeMillis();
        try (
            FileWriter fileWriter = new FileWriter("locations.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
                bufferedWriter.write( entry.getKey() + ", " + entry.getValue().getDescription() + "\n");
//                throw new IOException();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = " + (endTime - startTime));
    }

    // the method that propagates the exception through stack trace and handled at other method that calls this method
//    public static void writeProcess() throws IOException {
//        long startTime = System.currentTimeMillis();
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter("locations.txt");
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
//                bufferedWriter.write( entry.getKey() + ", " + entry.getValue().getDescription() + "\n");
//                throw new IOException("throw a temp exception");
//            }
//        }
//        finally {
//            bufferedWriter.close();
//            fileWriter.close();
//            System.out.println("In finally block");
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken = " + (endTime - startTime));
//    }

    // the method that do not propagate the exception above the stack trace
//    public static void writeProcess(){
//        long startTime = System.currentTimeMillis();
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter("locations.txt");
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
//                bufferedWriter.write( entry.getKey() + ", " + entry.getValue().getDescription() + "\n");
//                throw new IOException("throw a temp exception");
//            }
//        } catch (IOException e) {
//            System.out.println("In catch block");
//        }
//        finally {
//            try {
//                bufferedWriter.close();
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("In catch of filewriter close block");
//            }
//            System.out.println("In finally block");
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken = " + (endTime - startTime));
//    }

    public Locations() {
        System.out.println("This is default constructor!");
    }

    static {
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
//        locations.put(0, new Location(0, null,null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
