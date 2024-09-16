class BinSearch {
    /*@ private normal_behavior
      @   requires    0 <= low <= up <= a.length;
      @   requires    (\forall int x, y; 0 <= x < y < a.length; a[x] <= a[y]);
      @   ensures     \result == -1 || low <= \result < up;
      @   ensures     (\exists int idx; low <= idx < up; a[idx] == v) ?
      @                \result >= low && a[\result] == v : \result == -1;
      @   assignable  \nothing;
      @   measured_by up - low;
      @*/
    public static int binSearchR(int[] a, int v, int low, int up) {
        if (low < up) {
            int mid = low + ((up - low) / 2);
            if (v == a[mid]) {
                return mid;
            } else if (v < a[mid]) {
                return binSearchR(a, v, low, mid);
            } else {
                return binSearchR(a, v, mid + 1, up);
            }
        }
        return -1;
    }

    static public int binSearch(int[] a, int v) {
        int low = 0;
        int up = a.length;

        while (low < up) {
            int mid = low + ((up - low) / 2);
            if (v == a[mid]) { return mid;
            } else if (v < a[mid]) { up = mid;
            } else { low = mid + 1; }
        }
        return -1;
    }


}
