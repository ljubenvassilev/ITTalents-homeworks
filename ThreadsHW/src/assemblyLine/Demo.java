package assemblyLine;

public class Demo {

	static class Frame extends Thread {

		@Override
		public void run() {

			System.out.println("A frame production starts.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Frame not created successfully!");
				return;
			}
			System.out.println("A frame was created.");
		}
		
	}
	
	static class Seat extends Thread {

		@Override
		public void run() {

			System.out.println("A seat production starts.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Seat not created successfully!");
				return;
			}
			System.out.println("A seat was created.");
		}
		
	}
	
	static class Engine extends Thread {

		@Override
		public void run() {

			System.out.println("An engine production starts.");
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				System.out.println("Engine not created successfully!");
				return;
			}
			System.out.println("An engine was created.");
		}
		
	}

	static class Tire extends Thread {

		@Override
		public void run() {
			System.out.println("A tire production starts.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Tire not created successfully!");
				return;
			}
			System.out.println("A tire was created.");
		}
		
	}
	
	public static void main(String[] args) {

		Thread tire1 = new Tire();
		Thread tire2 = new Tire();
		Thread tire3 = new Tire();
		Thread tire4 = new Tire();
		Thread seat1 = new Seat();
		Thread seat2 = new Seat();
		Thread seat3 = new Seat();
		Thread seat4 = new Seat();
		Thread seat5 = new Seat();
		Thread engine = new Engine();
		Thread frame = new Frame();
		
		Thread tires = new Thread(){
			@Override
			public void run() {
				try {
				tire1.start();
				tire1.join();
				tire2.start();
				tire2.join();
				tire3.start();
				tire3.join();
				tire4.start();
				tire4.join();
				} catch (InterruptedException e) {
					System.out.println("Tires not complete!");
				}
			}
		};
		Thread seats = new Thread(){
			@Override
			public void run() {
				try {
				seat1.start();
				seat1.join();
				seat2.start();
				seat2.join();
				seat3.start();
				seat3.join();
				seat4.start();
				seat4.join();
				seat5.start();
				seat5.join();
				
				} catch (InterruptedException e) {
					System.out.println("Seats not complete!");
				}
			}
		};
		Thread mainParts = new Thread(){
			@Override
			public void run() {
				try {
				engine.start();
				engine.join();
				frame.start();
				frame.join();
				} catch (InterruptedException e) {
					System.out.println("Frame and engine not complete!");
				}
			}
		};
		System.out.println("Car production starts.");
		mainParts.start();
		tires.start();
		seats.start();
		try {
			seats.join();
			mainParts.join();
			tires.join();
		} catch (InterruptedException e) {
			System.out.println("Not all parts built!");
			return;
		}
		System.out.println("A car was created!");
	}

}