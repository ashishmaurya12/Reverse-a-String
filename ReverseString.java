package com.ReverseString;

public class ReverseString {
    static String reverse(String s, int left, int right) {
        if (left >= right)
            return s;
        char[] arr = s.toCharArray();
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        s = new String(arr);
        return reverse(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        String str = "abcabdae";
        String reversed = reverse(str, 0, str.length() - 1);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
