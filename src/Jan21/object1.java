package Jan21;

class Point {
	int x;
	int y;
}

public class object1 {
	
	private static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;

	}

	public static void main(String[] args) {
		Point p1 = null;
		p1 = new Point(); // 참조변수는 4바이트 무조건 무조건

		p1.x = 100;
		p1.y = 200;

		swap(p1);

		System.out.println("p1.x:" + p1.x + ", p1.y" + p1.y);

	}

}
