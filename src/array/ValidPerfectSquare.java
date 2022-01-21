package array;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        int left = 1;
        int right = num;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if ((long)mid * mid == num) {
                return true;
            }
            else if ((long)mid * mid > num) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return false;
    }

}
