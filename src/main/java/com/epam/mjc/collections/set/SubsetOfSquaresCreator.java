package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> ns = new TreeSet<>();
        for (Integer n: sourceList) {
            ns.add(n*n);
        }

        return ns.subSet(lowerBound, upperBound+1);
    }
}
