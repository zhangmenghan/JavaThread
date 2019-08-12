package com.third.mythread15;

//生产者
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产者 "
							+ Thread.currentThread().getName() + " WAITING了★");
					lock.wait();
				}
				System.out.println("生产者 " + Thread.currentThread().getName()
						+ " RUNNABLE了");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notifyAll();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
