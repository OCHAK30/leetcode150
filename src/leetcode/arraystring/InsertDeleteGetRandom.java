package leetcode.arraystring;


import java.util.*;

class RandomizedSet {
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> hm = new HashMap<>();
    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;

        list.add(val);
        hm.put(val, list.size());
        return true;
    }

    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;

        int idx = hm.get(val);
        int lastVal = list.size()-1;

        //swap val with lastVal
        list.set(idx, lastVal);
        hm.put(lastVal,idx);

        //last element
        list.remove(list.size()-1);
        hm.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}
public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_3 = obj.insert(2);
        boolean param_2 = obj.remove(2);
        int param_4 = obj.getRandom();
    }
}
