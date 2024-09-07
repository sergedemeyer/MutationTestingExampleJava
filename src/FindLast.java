public class FindLast {

    /*@ public normal_behavior
      @ requires   true;
      @ ensures    -1 <= \result < x.length;
      @ ensures    (\result == -1) ?
      @              (\forall int j; 0 <= j < x.length; x[j] != y) :
      @              x[\result] == y ;
      @ assignable \nothing;
      @*/
    public final static int findLast(int[] x, int y) {
        if (x.length == 0) return -1;
	/*@ loop_invariant i>=-1 && i<= x.length-1;
	  @ loop_invariant (\forall int j; i < j < x.length; x[j] != y);
	  @ decreases i+1;
	  @ assignable \nothing; @*/
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) return i;
        }
        return -1;
    }

}

