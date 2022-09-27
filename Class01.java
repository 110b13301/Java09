class CRectangle {
	private int width, height;
	public CRectangle(int w,int h) {
		width = w;
		height = h;
	}
	public CRectangle() {
		width = 10;
		height = 8;
	}
}
public class Class01 {
	public static void main(String[] args) {
		CRectangle a = new CRectangle();
	}
}