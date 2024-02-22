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
        if (array.length < 2) return Integer.MIN_VALUE; // Edge case, not enough elements

        int max = array[0] > array[1] ? array[0] : array[1];
        int secondMax = array[0] > array[1] ? array[1] : array[0];
    
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
    
        return secondMax;
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
