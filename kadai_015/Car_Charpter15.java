package kadai_015;

public class Car_Charpter15 {

	
	private int gear = 1;
	private int speed = 10;
	
	
	
	

	public void gearChage(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
		speed = afterGear * 10;
	}
	
	public void 	 run(){
		
		switch(gear) {
		case 1 -> System.out.println("速度は時速" + speed + "kmです");
		case 2 -> System.out.println("速度は時速" + speed + "kmです");
		case 3 -> System.out.println("速度は時速" + speed + "kmです");
		case 4 -> System.out.println("速度は時速" + speed + "kmです");
		case 5 -> System.out.println("速度は時速" + speed + "kmです");
		default -> System.out.println("速度は時速" + 10 + "kmです");
		}
		
	}
}