package innerclasses.nested_static.human;

public class Human {

	Relations relations;

	public static class Relations {

		private String relations;

		Relations(String relations) {
			this.relations = relations;
		}

		String getRelatons() {
			return relations;
		}

	}

}
