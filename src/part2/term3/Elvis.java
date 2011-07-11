package part2.term3;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Elvis implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
		System.out.println("Elvisは一度しか生成されないはず！");
	}

	public void sing() {
		System.out.println("Love Love Love");
	}

	private Object readResolve() throws ObjectStreamException {
		// デシリアライズしたインスタンスは破棄する。
		return INSTANCE;
	}
}
