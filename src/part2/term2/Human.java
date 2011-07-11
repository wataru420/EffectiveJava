package part2.term2;

public class Human {
	
	private String name;
	private int sex;
	private int height;
	private int fat;
	
	public static class BuilderImpl implements Builder<Human> {
		private String name;
		
		private int sex = 1;
		private int height = 0;
		private int fat = 0;
		
		public BuilderImpl(String name) {
			this.name = name;
		}
		
		public BuilderImpl sex(int val) {
			sex = val;
			return this;
		}
		
		public BuilderImpl height(int val) {
			height = val;
			return this;
		}
		
		public BuilderImpl fat(int val) {
			fat = val;
			return this;
		}
		
		public Human build() {
			return new Human(this);
		}
	}
	
	private Human(BuilderImpl builder) {
		name = builder.name;
		sex = builder.sex;
		height = builder.height;
		fat = builder.fat;
	}

}
