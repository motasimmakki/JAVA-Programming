import java.util.*;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Comparator c=(o1,o2)->{String s1=(String)o1;String s2=(String)o2;return s1.compareTo(s2);};
        TreeSet ts=new TreeSet(c);
        
        for(String myString : names1){
            ts.add(myString);
        }
        
        for(String myString : names2){
            ts.add(myString);
        }

        Object[] newString=ts.toArray();
        String[] finalString=new String[newString.length];

        System.arraycopy(newString,0,finalString,0,newString.length);

        return finalString;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}

// class MyComparator implements Comparator
// {
//     public int compare(Object o1,Object o2){
//         String s1=(String)o1;
//         String s2=(String)o2;
//         return s1.compareTo(s2);
//     } 
// }