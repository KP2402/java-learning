package oracle.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CanConstruct {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String noteString = "visa";
//        int m = text.length()+1;
//        int n = noteString.length()+1;
        String magazine[] = noteString.split(" ");
        String note[] = text.split(" ");
                int m = magazine.length;
        int n = note.length;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<m;i++){
            if(hm.containsKey(magazine[i])){
                hm.put(magazine[i],hm.get(magazine[i])+1);
            }
            else
                hm.put(magazine[i],1);

        }

        boolean check=false;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(note[i]))
                check=true;
            else{
                if(hm.get(note[i])>1)
                    hm.put(note[i],hm.get(note[i])-1);
                else
                    hm.remove(note[i]);
            }
        }
        if(!check)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(canConstruct(noteString, text));
    }

    public static boolean canConstruct(String note, String text) {

        if (note==null || note.length() == 0) return true;
        if (text==null || text.length() == 0) return false;
        boolean flag=false;
        boolean visited[]=new boolean[text.length()];
//        Arrays.fill(visited,Boolean.FALSE);
        for(int i = 0; i < visited.length; i++) {
            visited[i] = Boolean.FALSE;
        }
        for(int i=0;i<note.length();i++){
            flag=false;
            for(int j=0;j<text.length();j++){
                if(note.charAt(i)==text.charAt(j) && !visited[j] ){
                    visited[j]=true;
                    flag=true;
                    break;
                }
            }
            if (!flag) return false;
        }
        return flag;
    }

//    public static boolean canConstruct(String text, String note) {
//
//        if (note==null || note.length() == 0) return true;
////        if (note==null || note.length() == 0) return false;
//        boolean flag=false;
////        boolean visited[]=new boolean[note.length()];
////        Arrays.fill(visited,Boolean.FALSE);
//        for(int i = 0; i < visited.length; i++) {
//            visited[i] = Boolean.FALSE;
//        }
//        for(int i=0;i<note.length();i++){
//            flag=false;
//            for(int j=0;j<note.length();j++){
//                if(note.charAt(i)==note.charAt(j) && !visited[j] ){
//                    visited[j]=true;
//                    flag=true;
//                    break;
//                }
//            }
//            if (!flag) return false;
//        }
//        return flag;
//    }
}
