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
        int max , secondMax;
        if(array[0] > array[1]){
            max = array[0];
            secondMax = array[1];
        } else{
            max = array[1];
            secondMax =array[0];
        } 
        for(int i = 2 ; i < array.length ; i++){
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            } else if(array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        if(array1.length != array2.length){
            return false;
        }
        boolean[] visited = new boolean[array2.length];
        int matchCount = 0;

        for(int i = 0; i < array1.length; i++){
            boolean matchFound = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j] && !visited[j]){
                    visited[j] = true;
                    matchFound = true;
                    matchCount++;
                    break;
                }
            }
            if(!matchFound){
                return false;
            }
        }
        return matchCount == array1.length;
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
