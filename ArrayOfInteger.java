import java.util.Scanner;
public class ArrayOfInteger {
 private int []a; private int n;
 //ham khoi tao khong doi so
 public  ArrayOfInteger () {
	 Scanner kb=new Scanner (System.in);
	 a=new int[10];
	 n=0;
 }
 //ham khoi tao co doi so
 //
 //nhan
 public  ArrayOfInteger (int capacity) {
	 a=new int[capacity];
	 n=0;
 }
 //them e(element) vao cuoi mang
 public void add (int e) {
	 //ktr mang day, neu mang chua day thi bien thanh mang day
	if (n==a.length) {
		int[]b=new int[a.length*2];  //khai bao va cap phat mang moi
		//di chuyen cac phan tu tu a ->b
		for (int i=0;i<n;i++) 
			b[i]=a[i];
			a=b;
		}
		a[n]=e;n++;
 }
 public void output () {
	 for (int i=0;i<n;i++)
		 System.out.print(a[i]+" ");
 }
 //ham tra ve 1 phan tu o vi tri index
 public Integer get(int index) {
	 if (index <0 || index>=n) {
		 System.out.print("invalid index"); return null;
	 }
	 return a[index];
}
 public void set(int index,int x) {
	 if (index<0 || index>=n) 
		 System.out.print("invalid index");
	 else
		 a[index]=x;
 }
 public void remove (int index) {
	 if (index<0 || index>=n) 
		 System.out.print("invalid index");
	 else {
		 for (int i=index;i<n-1;i++)
			 a[i]=a[i+1];
	 n--;
	 }
 }
 public boolean contains (int x) {
	 System.out.println("\nNhap so can tim: "+x);
	 for (int i=0;i<a.length;i++)
		 if (a[i]==x) return true;
	 return false;
 }
 //ham chen 1 gia tri x vao vi tri nao do trong mang a
 public void add (int x, int index) {
	 if (index<0 || index>=n) 
		 System.out.print("invalid index");
	 else {
		 if (n==a.length) {
			int[]b=new int[a.length*2];
			for (int i=0;i<n;i++) 
				b[i]=a[i];
				a=b;
		 }
		 if (n==index) a[n]=x;
		 else {
			 for (int i=n;i>index;i--) 
				 a[i]=a[i-1];
			 a[index]=x; 
	 }
		 n++;
	 }
 }
 public int indexOf (int x) {
	 for (int i=0;i<n;i++)
		 if (a[i]==x) return i;
	return -1;
 }
 public int lastIndexOf (int x) {
	 for (int i=n-1;i>=0;i--)
		 if (a[i]==x) return i;
	 return -1;
 }
 @Override
 public String toString () {
	 String s="";
	 for (int i =0;i<n;i++) s=s+a[i]+" ";
	 return s;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//con new con, xai tat ca ca ham lop cha va lp con
	ArrayOfInteger arr= new ArrayOfInteger (100);
	arr.add(8);arr.add(1);arr.add(9);arr.add(2);arr.add(7);arr.add(6); arr.add(4);
	arr.add(3); arr.add(10); arr.add(5);
	arr.output();
	System.out.println ("\n"+arr.get(2));
	arr.set(3, 100); arr.output(); System.out.print ("\n");
	arr.remove(3); arr.output();
	System.out.println (arr.contains(4));
	arr.add(6, 3); arr.output();
	//System.out.println ("\nVi tri dau tien cua so can tim la: "+ arr.indexOf(2));
	//System.out.println ("Vi tri cuoi cung cua so can tim la: "+ arr.lastIndexOf(4));
	
	//goi ham lop con vi lop con co toString
	//se goi ham lop cha neu lop con ko co toString
	//con-->thua ke tu cha,in ra dia chi
	//goi ham tuong minh
	System.out.println (arr.toString());
	//goi ham k tuong minh, java tu dong goi ham arr.toString
	System.out.println (arr /*tra ve 1 doi so chuoi */);
	String s="Abc "+arr+"hello"; //arr cho nay co the goi ham toString
	//arr;//ko the goi ham toString vi ko co doi so chuoi
	//lop cha new cha
	Object obj=new Object();
	System.out.println (obj.toString());
	//lop cha new con
	Object obj1=arr;
	System.out.println (obj1.toString());//tinh da hinh
	}

}
