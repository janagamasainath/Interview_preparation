package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreak {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
		SingletonClass original = SingletonClass.getInstance();

		System.out.println(original.hashCode());

		// using clone
		SingletonClass clone = (SingletonClass) original.clone();
		System.out.println(clone.hashCode());

		// using reflection

		/*
		 * Class<SingletonClass> forName = (Class<SingletonClass>)
		 * Class.forName("singleton.SingletonClass"); Constructor<SingletonClass>
		 * declaredConstructors = forName.getDeclaredConstructor();
		 * declaredConstructors.setAccessible(true); SingletonClass newInstance =
		 * declaredConstructors.newInstance();
		 * System.out.println(newInstance.hashCode());
		 */

		// using serilization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(original);
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SingletonClass instanceTwo = (SingletonClass) in.readObject();
		in.close();
		System.out.println(instanceTwo.hashCode());

	}

}
