package singleton;

import java.io.Serializable;

public class SingletonClass implements Cloneable ,Serializable{

	private static final long serialVersionUID = 1L;
	private static SingletonClass setInstance;
	
	private  SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if (setInstance==null) {
			setInstance = new SingletonClass();
		}
		return setInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
