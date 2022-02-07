package Mang;

public class MangMotChieu {
	public static void main(String[] args) {
		int[] id = {1 , 2, 3};
		String[] name = {"Thang" , "Huy" ,"Thu"};
		float[] marks = {6.5f , 4.4f , 6.6f};
		
		System.out.println("do dai cua mang id la:  " + id.length);
		System.out.println("do dai cua mang name la: " + name.length);
		System.out.println("do dai cua mang marks la: " + marks.length );
		
		System.out.println("phan tu thu ba cua mang name la: " + name[2] );
		System.out.println("phan tu dau tien cua mang marks la: "  + marks[0]);
		
		//thay doi phan tu cua mang
		name[2] = "Lan";
		System.out.println("phan tu dau tien cua mang name la: " + name[2] );

		//hien thi mang 
		for(int i = 0; i < name.length ; i++) {
			System.out.println("name " + i + " " + name[i]);		
		}
		
//		//tinh tong array
//		int[] array = {1, 3 ,4 , 6, 8};
//		int sum =0;
//		for(int x = 0; x < array.length; x ++) {
//			sum += array[x];
//		}
//		System.out.println(sum);
//		
		
		//cap phat bo nho cho mang
		int[] array = new int[20];
		char[] array1 = new char[20];
		byte[] array2 = new byte[20];
		boolean[] array3 = new boolean[20];
		short[] array4 = new short[20];
		long[] array5 = new long[20];
		float[] array6 = new float[20];
		double[] array7 = new double[20];
		String[] array8 = new String[20];
		
		System.out.println(array[10]);
		System.out.println(array1[10]);
		System.out.println(array2[10]);
		System.out.println(array3[10]);
		System.out.println(array4[10]);
		System.out.println(array5[10]);
		System.out.println(array6[10]);
		System.out.println(array7[10]);
		System.out.println(array8[10]);
		
		
		
	}
}
