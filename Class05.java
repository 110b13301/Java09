class CCount {
	public static int cnt = 0;
	public CCount() {
		cnt ++;
	}
	public static void setZero() {
		cnt = 0;
	}
	public static void setVaule(int n) {
		cnt = n;
	}
	public static void show() {
		System.out.println(cnt);
	}
}
public class Class05 {
	public static void main(String[] args) {
		CCount a = new CCount();
		CCount b = new CCount();
		CCount.show();
		CCount.setZero();
		CCount.show();
		CCount.setVaule(5);
		CCount.show();
	}
}