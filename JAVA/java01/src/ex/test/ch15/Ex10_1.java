package ex.test.ch15;
import java.util.*;
public class Ex10_1 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,40,30,20};
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			System.out.println(i+"\t"+(set.add(i)?"true":"중복"));
		}
		System.out.println("set"+set);
	}
}
