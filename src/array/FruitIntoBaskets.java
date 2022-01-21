package array;

public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {

        int sum = 0;
        int result = -1;
        int len = fruits.length;

        int fruit1 = -1;
        int fruit2 = -1;
        int left = 0;

        for (int right = 0; right < len; right++) {

            if (fruit1 == -1) {
                sum++;
                fruit1 = fruits[right];
                continue;
            }
            if (fruits[right] == fruit1) {
                sum++;
                continue;
            }

            if (fruit2 == -1) {
                sum++;
                fruit2 = fruits[right];
                continue;
            }


            if (fruits[right] != fruit1 && fruits[right] != fruit2) {
                result = Math.max(sum, result);
                left = right - 1;
                fruit1 = fruits[left];
                fruit2 = fruits[right];
                while (fruits[left] == fruit1) {
                    left--;
                }
                sum = right - left;
                continue;
            }

            sum++;
        }
        return Math.max(sum, result);
    }

}
