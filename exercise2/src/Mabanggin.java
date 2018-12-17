//package exercise;
//
//import java.util.*;
//
//public class Mabanggin {
//	int[][] a;
//	public static Mabanggin myMabanggin;
//	Scanner sc = new Scanner(System.in);
//	int size = sc.nextInt();
//
//   public void resolveMabang(int size) {
//		int num = 1;
//		int max = size * size;
//
//		while (num <= max) {	
//			int i = 1;
//			int j = size / 2;
//			int[][] a = new int [size][size];
//			if (num % size == 0) {
//				i++;
//			} else {
//				i--;
//				j++;
//				if (i < 0)
//					i = a.length - 1;
//				if (j >= a.length)
//					j = 0;
//				}
//			num++;
//			}
//		
//	}
//   public void desplayMabang(int[][] a, int size) {
//	
//		for (int x = 0; x < size; x++) {
//			for (int y = 0; y < size; y++) {
//				System.out.print(a[x][y] + "\t");
//			}
//			System.out.println();
//			
//			}
//		}
//
//
//	public static void main(String args[]) {
//		int[][] a = new int[size][size];
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		System.out.print("¸¶¹æÁø size: ");
//		size = sc.nextInt();
//		int max = size * size;
//	
//		myMabanggin = new Mabanggin();
//		myMabanggin.resolveMabang(size);
//		myMabanggin.desplayMabang(a,size);
//
//
//	}	
//}
