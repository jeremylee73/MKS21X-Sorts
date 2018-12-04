public class Sorts{
  public static void swap(int[] ary, int a, int b){
    int c = a;
    ary[a] = ary[b];
    ary[b] = ary[c];
  }

  public static boolean isSorted(int[] ary){
    for (int i=0; i<ary.length-1; i++){
      if (ary[i] > ary[i+1]){
        return false;
      }
    }
    return true;
  }

  public static void selectionsort(int[] ary) {
    int smallest = ary[0];
    int smallestIndex = 0;
    for (int j=0; j<ary.length; j++){
      for (int i=j; i<ary.length; i++){
        if (ary[i] < smallest){
          smallest = ary[i];
          smallestIndex = i;
        }
      }
      swap(ary, 0, smallestIndex);
    }
  }
}
