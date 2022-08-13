package sushant.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static long solve(int l, int r){

        List<Long> list=new ArrayList<>();
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

            if(i==1){
                return true;
            }
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

}

