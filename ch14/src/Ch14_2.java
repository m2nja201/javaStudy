
interface MyFunct{
	void run();
}

class Ch14_2 {
	static void execute(MyFunct f) {
		f.run();
	}
	
	static MyFunct getMyFunc() {
		MyFunct f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunct f1 = () -> System.out.println("f1.run()");
		
		MyFunct f2 = new MyFunct() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("f2.run()");
			}
		};
		
		MyFunct f3 = getMyFunc();
		
		f1.run();
		f2.run();
		f3.run();
	}
}
