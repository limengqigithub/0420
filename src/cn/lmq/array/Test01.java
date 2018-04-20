package cn.lmq.array;

public class Test01 {
		/**
		 * 数组的基本概念
		 * 1.数组是相同数据类型的有序集合。
		 * 2.数组也是对象。数组元素相当于对象的成员变量。
		 * 3.数组长度是确定的不可变的。如果越界，则报错：ArrayIndexOutOfBoundsException. 
		 * */
		public static void main(String[] args) {
			int[] a=new int[3];
			a[0]=21;
			a[1]=22;
			a[2]=23;
		 
			Car[] cars=new Car[4];
			cars[0]=new Car("奥迪");
			System.out.println(cars[0].name);
			System.out.println(a.length);
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}
	
		
	

}
