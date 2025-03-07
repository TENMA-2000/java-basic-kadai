package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;

		speed = afterGear * 10;
		
		this.speed = speed;
		

	}

	public void run() {
		
		if(this.speed < 60) {
			System.out.println("速度は時速" + speed + "kmです");
		}else {
			System.out.println("速度は時速" + 10 + "kmです");
		}
	}
}