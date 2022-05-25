package ArrayExamples;

public class TaskParentExample {
	public static void main(String[] args) {
		String names[][] = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
		String grandFather = "ronaldo";
		int count = 0;
		String father = "";
		
		for(int i = 0; i<names.length; i++) {
			if(grandFather.equals(names[i][1])) {
				father = names[i][0];
				
			
			
				for(int j = 0; j<names.length; j++) {
					if(father.equals(names[j][1])) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
