public class SelectionSort {

    /*@
      requires true;
      ensures true;
      assignable \everything;
    */
    public static int[] sort(int[] a){
        for(int i = 0; i < a.length; i++){
            int m = min(a,i);
            swap(a,m,i);
        }
        return a;
    }

    /*@
      requires true;
      ensures true;
      assignable \everything;
    */
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /*@
      requires true;
      ensures true;
      assignable \everything;
    */
    private static int min(int[] a, int start){
        int res = start;
        for(int i = start; i < a.length; i++){
            if(a[i] < a[res]){
                res = i;
            }
        }
        return res;
    }
}
