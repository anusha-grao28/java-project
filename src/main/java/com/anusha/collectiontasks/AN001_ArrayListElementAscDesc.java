package com.anusha.collectiontasks;

import java.util.ArrayList;
import java.util.Collections;

public class AN001_ArrayListElementAscDesc {
    private ArrayList<Integer> arrayList;

    public AN001_ArrayListElementAscDesc(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    public ArrayList<Integer> getArrayList() {
        return this.arrayList;
    }
    public ArrayList<Integer> sortAscending() {
        Collections.sort(this.arrayList);
        return this.arrayList;
    }
    public ArrayList<Integer> sortDescending() {
        Collections.sort(this.arrayList, Collections.reverseOrder());
        return this.arrayList;
    }
}
