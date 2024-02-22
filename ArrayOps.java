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
        boolean[] visitedInArray2 = new boolean[array2.length];
    int uniqueElementsFound = 0;

    for (int elementArray1 : array1) {
        for (int j = 0; j < array2.length; j++) {
            if (elementArray1 == array2[j] && !visitedInArray2[j]) {
                visitedInArray2[j] = true;
                uniqueElementsFound++;
                break;
            }
        }
    }

    if (uniqueElementsFound < array2.length) {
        return false;
    }

    boolean[] visitedInArray1 = new boolean[array1.length];
    uniqueElementsFound = 0;

    for (int elementArray2 : array2) {
        for (int j = 0; j < array1.length; j++) {
            if (elementArray2 == array1[j] && !visitedInArray1[j]) {
                visitedInArray1[j] = true;
                uniqueElementsFound++;
                break;
            }
        }
    }

    return uniqueElementsFound >= array1.length;
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
