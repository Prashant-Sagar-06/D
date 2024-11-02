package Java_Collection_Framework;

import java.util.Set;

public class Learn_LinkedHashset {
    public static void main(String[] args) {
        Set<Integer> st = new java.util.LinkedHashSet<>();
        //Add
        st.add(66);
        st.add(55);
        st.add(44);
        st.add(33);
        st.add(11);
        st.add(22);
        System.out.println("Elements of LINKEDHASHSET : " + st);
        //Remove
        st.remove(44);
        System.out.println("Elements of LINKEDHASHSET(AFTER REMOVE 44 ) : " + st);
        //Contains
        System.out.println("Is 33 present in LINKEDHASHSET : " + st.contains(33));
        //Size
        System.out.println("Size of LINKEDHASHSET : " + st.size());
        //Clear
        st.clear();
        System.out.println("Elements of LINKEDHASHSET(AFTER CLEAR) : " + st);
        //IsEmpty
        System.out.println("Is LINKEDHASHSET empty : " + st.isEmpty());
        //AddAll
        Set<Integer> st1 = new java.util.LinkedHashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st.addAll(st1);
        System.out.println("Elements of LINKEDHASHSET(AFTER ADDALL) : " + st);
        //RetainAll
        st.retainAll(st1);
        System.out.println("Elements of LINKEDHASHSET(AFTER RETAINALL) : " + st);
        //ToArray
        Object[] arr = st.toArray();
        System.out.print("Elements of LINKEDHASHSET(AFTER TOARRAY) : ");
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Equals
        System.out.println("Is st and st1 equal : " + st.equals(st1));
        //HashCode
        System.out.println("Hashcode of st : " + st.hashCode());
        //RemoveAll
        st.removeAll(st1);
        System.out.println("Elements of LINKEDHASHSET(AFTER REMOVEALL) : " + st);
    }
}
