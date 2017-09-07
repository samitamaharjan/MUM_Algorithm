package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
	public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println(powerSet(list));
    }
    
    public static List<Set<Integer>> powerSet(List<Integer> X) {
        List<Set<Integer>> P = new ArrayList<Set<Integer>>();
        Set<Integer> S = new HashSet<Integer>();
        P.add(S);
        if(X.isEmpty()) {
            return P;
        }
        else {
            while(!X.isEmpty()) {
                int f = X.remove(0);
                List<Set<Integer>> temp = new ArrayList<Set<Integer>>();
                for(Set<Integer> x : P) {            
                    temp.add(x);
                }
                for(Set<Integer> x : temp) {
                    S = new HashSet<Integer>();
                    S.add(f);
                    S.addAll(x);
                    P.add(S);                    
                }                    
            }            
        }
        return P;    
    }
}
