package part2.term1;

/**
 * Staticファクトリーメソッドで任意のサブタイプのクラスを返す
 */
public class CatBus implements Bus {
	
	private CatBus() {
		
	}
	
	public static Bus newInstance(int num) {
		if (num > 10) {
			return CatBigBus.newInstance();
		} else {
			return CatSmallBus.newInstance();
		}
	}
	
	private static class CatBigBus implements Bus {

		public static CatBigBus newInstance() {
			// TODO Auto-generated method stub
			return new CatBigBus();
		}
		
		@Override
		public String toString() {
			return "this is CatBigBus";
		}
	}
	
	private static class CatSmallBus implements Bus {
		public static CatSmallBus newInstance() {
			return new CatSmallBus();
		}
		
		@Override
		public String toString() {
			return "this is CatSmallBus";
		}
	}
}
