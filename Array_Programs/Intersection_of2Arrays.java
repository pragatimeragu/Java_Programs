public class Intersection_of2Arrays {
    static void findIntersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr1[k] == arr1[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 5, 6 };
        int[] arr2 = { 4, 5, 6, 7, 8, 9 };
        findIntersection(arr1, arr2);
    }
}
