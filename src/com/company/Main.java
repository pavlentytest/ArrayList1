package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,545,234234,4,7};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<data.length;i++)  list.add(data[i]);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<list.size();i++) {
            Integer x = list.get(i);
            if(x%2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

    }
}
