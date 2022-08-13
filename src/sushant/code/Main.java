package sushant.code;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(3, 16,new int[][]{{2,8},{4,5},{5,1}}));;
    }

    static long solve(int l, int r){

        List<Long> list=new ArrayList();
        for(int i=l; i<=r;i++){

            if(beautiful(i)){
                list.add(Long.valueOf(i));
            }


        }

        long sum=0;

        for(Long value :list){
            sum=sum+value;

        }

        return sum;

    }

    public static boolean beautiful(int i){
        while(true){

            if(i==1)
                return true;

            i=sumDigitSquare(i);

            if(i==4)
                return false;
        }
    }

    public static int sumDigitSquare(int n)
    {
        int sq=0;

        while(n!=0){

            int digit=n%10;
            sq+=digit*digit;

            n=n/10;
        }
        return sq;

    }

    public static int method(int n, int t, int[][] tasks) {
        int maxTasks = 0;
        Arrays.sort(tasks, (r1,r2)->Integer.compare(r1[0],r2[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            if(t-(2*tasks[i][0])-tasks[i][1]>=0) {
                queue.add(tasks[i][1]);
                t-=tasks[i][1];
                maxTasks = Math.max(maxTasks,queue.size());
            }else if((!queue.isEmpty() && queue.peek()<=tasks[i][1])) {
                continue;
            }
            else {
                while (!queue.isEmpty() && (t-2*tasks[i][0]-tasks[i][1])<0) {
                    int maXConsumed = queue.remove();
                    t+=maXConsumed;
                }
                if(t-2*tasks[i][0]-tasks[i][1]>0) {
                    queue.add(tasks[i][1]);
                    maxTasks = Math.max(maxTasks,queue.size());
                }
            }
        }
        return maxTasks;

    }
}
