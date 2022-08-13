package sushant.code;

import java.util.*;

public class ThrottlingGateway {

    public static void main(String[] args) {
        List<Integer> requestTime = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7,7,7,7, 11, 11, 11, 11);
        System.out.println(requestTime);

        int dropped = 0;
        Map<Integer, Integer> prevDrop = new HashMap<>();

        for (int i=0; i<requestTime.size(); i++) {
            if(i>2 && (requestTime.get(i)==requestTime.get(i-3))) {
                if(!prevDrop.containsKey(requestTime.get(i)) || (prevDrop.get(requestTime.get(i)) != i)) {
                    prevDrop.put(requestTime.get(i), i);
                    dropped+=1;

                }
            }
           //else if(i>19 && )
        }
    }
}
