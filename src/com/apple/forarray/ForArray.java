public class ForAttay {
	public static void main(String[] atgs) {
		int[] array = new int[(int)(Math.random() * 10)+1];
		for(int i = 0;i < array.length;++i)
			array[i] = (int)(Math.random() * 100);
		for(int value:array)
			System.out.println(value);
	}
}