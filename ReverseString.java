package com.ReverseString;

public class ReverseString {
    static String reverse(String s, int l, int r) {
        if(l>=r)
            return s;
        char[] arr=s.toCharArray();
        char temp =arr[l];
        arr[l] = arr[r];
        arr[right] = temp;
        s=new String(arr);
        return reverse(s, l + 1, r - 1);
    }
    public static void main(String[] args) {
        String str="abcabdae";
        String reversed = reverse(str, 0, str.length() - 1);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}

