package com.modernjava.lamda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Traditional 
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i=0; i<10; i++){
					sum = sum+i ;
				}
				System.out.println("Traditional : " +sum);
			}
					
		};
		new Thread(runnable).start();
		
		
		
		//using lambda expression
		Runnable runnable1 =()->{
			int sum = 0;
			for (int i=0; i<10; i++){
				sum = sum+i ;
			}
			System.out.println("Lambda : " +sum); 
		};
		new Thread(runnable1).start();
		
		
		
		
		//implement using Thread with lambda
		new Thread(  () -> {
			int sum = 0;
			for (int i=0; i<10; i++){
				sum = sum+i ;
			}
			System.out.println("Thread Lambda : " +sum); 
		}
		).start();
		
	}

}
