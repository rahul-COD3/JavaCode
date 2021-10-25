public class arrey21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = a.clone();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
    }
}
