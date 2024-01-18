public class StringReversal {
    public static void main(String[] args) {
        String input = "retlaohS";
        String reversed = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + reversed);
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the indices inward
            left++;
            right--;
        }

        return new String(chars);
    }
}