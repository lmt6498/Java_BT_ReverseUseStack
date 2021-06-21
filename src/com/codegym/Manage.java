package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Manage {
    public static void stackOfStringReverse() {
        MyGenericStack<String> stack = new MyGenericStack();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 1 chuỗi: ");
        String input = sc.nextLine();
        String[] strings = input.split("");

        for (String s : strings) {
            stack.push(s);
        }
        System.out.println("Stack size:" + stack.size());
        System.out.printf("Đảo ngược chuỗi: ");
        while (!stack.isEmpty()) {
            System.out.printf(stack.pop());
        }

    }

    public static void stackOfNumReverse() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng: ");
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Nhập số thứ: " + (i + 1));
            array[i] = sc.nextInt();
            stack.push(array[i]);
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(array));
        System.out.println("Stack size:" + stack.size());
        System.out.printf("Đảo ngược chuỗi: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }

    }
}
