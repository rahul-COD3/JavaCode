import java.util.ArrayList;

public class Solution1 {
    public int perfectPeak(ArrayList<Integer> A) {
        int armin[] = new int[A.size()];
        if (A.isEmpty())
            return 0;
        for (int i = A.size() - 1; i >= 0; i--)
            if (i == A.size() - 1)
                armin[i] = A.get(i);
            else
                armin[i] = Integer.min(A.get(i), armin[i + 1]);
        int max = A.get(0);

        for (int i = 1; i < A.size() - 1; i++)
            if (A.get(i) > max) {

                if (A.get(i) < armin[i + 1])
                    return 1;
                max = A.get(i);
            }
        return 0;

    }
}
