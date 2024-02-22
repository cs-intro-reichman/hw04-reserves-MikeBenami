import java.util.HashSet;
import java.util.Set;


public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
       int n = array.length;
       int total = (n * ( n + 1 )) / 2;
       int sum = 0;
    for(int num : array){
        sum += num;
       }
       return total - sum;
    }

    public static int secondMaxValue(int [] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
    for (int value : array) {
        if (value > max) {
            secondMax = max; 
            max = value;    
        } else if (value > secondMax && value < max) {
            secondMax = value; 
        }
    }
    return secondMax != Integer.MIN_VALUE ? secondMax : max;
}

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

    for (int i : array1) {
        set1.add(i);
    }
    for (int j : array2) {
        set2.add(j);
    }

    return set1.equals(set2);
}

    public static boolean isSorted(int [] array) {
        boolean ascending = true;
        boolean descending = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i + 1]){
                descending = false;
            }
            if (array[i] > array[i+1]) {
                ascending = false;
            }
        }
        return ascending || descending;
    }

}
