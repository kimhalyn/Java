package p330;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		String[] arr = {"ȫ�浿","�̼���","������","������"};
		Arrays.fill(arr, "�Ӳ���");
		for(String n : arr) System.out.println(n + ",");
		System.out.println();
		Arrays.fill(arr, 1,3, "X");
		for(String n : arr) System.out.println(n+ ",");
		}
	}

