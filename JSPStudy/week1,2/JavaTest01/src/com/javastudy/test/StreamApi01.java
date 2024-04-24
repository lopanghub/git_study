package com.javastudy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.IntStream;

public class StreamApi01 {
	public static void main(String[] args) {
		// 자바 StreamAPI를 사용해서 배열요소에서 중복되지 않은 7의 배수를 찾아서 문제의 결과와 같이 출력되도록
		// 9170564221

		int[] arr = { 80, 21, 33, 70, 91, 70, 56, 60, 21, 100, 42, 30, 91 };

		// StreamAPI 안쓰는 경우
		ArrayList<Integer> nList = new ArrayList<>();
		for (int n : arr) {
			if (n % 7 == 0) {
				nList.add(n);
			}
		}

		HashSet<Integer> set = new HashSet<>(nList);
		ArrayList<Integer> uList = new ArrayList<>(set);
		Collections.sort(uList, Comparator.reverseOrder());
		// 다시 int형 배열로
		arr = new int[uList.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = uList.get(i);
		}
		System.out.println(Arrays.toString(arr));

		// StreamAPI
		IntStream intStream = Arrays.stream(arr);

		//
		intStream.boxed().distinct().sorted().filter(n -> n % 7 == 0)
				// 21 42 56 70 91
				.map(n -> "" + n).reduce("", (a, b) -> b + a);
	}
}
