package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer n: sourceList) {
            if(n%2==0) {
                while (n % 2 == 0) {
                    set.add(n);
                    n /= 2;
                }
                set.add(n);
            }else{
                set.add(n);
                set.add(n*2);
            }
        }

        return set;
    }
}
