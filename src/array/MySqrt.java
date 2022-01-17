package array;

public class MySqrt {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (mid > x / mid) {
                right = mid - 1;
            }
            else if (mid < x / mid) {
                if ((long)(mid + 1) * (mid + 1) > x) {
                    return mid;
                }
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(64));
    }

}
