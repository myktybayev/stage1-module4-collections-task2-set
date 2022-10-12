package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> res = new HashSet<>();
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);

        for (String w: firstSet) {
            if(secondSet.contains(w)){
                res.add(w);
            }
        }
        res.addAll(thirdSet);
        return res;
    }
}
