
public class Main {
    public static void main(String[] args) {
	
	Bitmap bitmap = new Bitmap(100, 100);

	bitmap.setColor(10, 10, 127, 127, 0);
	System.out.println(bitmap.getColor(10, 10));

	/*Car car1 = new Car(0);
	Car car2 = new Car(1);

	System.out.println("car1: " + car1);
	System.out.println("car2: " + car2);

	felkialtojel("szoveg with felkijaltojel");

	System.out.println(hatvanyozas(3, -1)+""); //
	car1.setId(3); 
	System.out.println("car1: " + car1);
	System.out.println(Car.getNum());*/ // static var

    }

	static void felkialtojel(String text){
		System.out.println(text + "!!!");
	}

	static double hatvanyozas(int alap, int kitevo) {
		int result = 1;
		boolean negative = false;

		if(kitevo < 0)
		{
			negative = true;
			kitevo *= -1;
		}
		for (int i=0; i<kitevo; i++) {
			result = result * alap;
		}
		
		if(negative){
			return 1.0/result;
		}
		return result;
		
	}
}
