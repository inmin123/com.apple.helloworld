public class array {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
			System.arraycopy(a,0,b,0,10);
			System.out.print(b[i]+" ");
		}
	}
	
}