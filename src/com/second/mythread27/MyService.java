package com.second.mythread27;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
			if (list.getSize() < 1) {
				Thread.sleep(2000);
				list.add(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}

}
