
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] grades = {7,12,10,12,9,6,10,12,8};
		int hightGrade = maxGrade(grades);
		System.out.print("All grade: ");
		printAll(grades);
		System.out.println("Hight grade: " + hightGrade);
		System.out.println("Midle grade: " + midGrade(grades));
		
		
	}
		
	public static  void printAll (int [] grades) {
		System.out.print("|");
		for (int num : grades) {
			System.out.print(num+ "|");
			
		}
		System.out.println();
	}
	
	public static double  midGrade (int [] numbers ) {
		int grade = 0;
		for (int num : numbers) {
			grade = num + grade;
			
		}
		return ((double)grade/numbers.length);
	}
	
	public static int maxGrade (int []numbers) {
		int maGrade = numbers[0];
		for (int num : numbers) {
			  maGrade =num;
		}
		return maGrade;
	}

}
