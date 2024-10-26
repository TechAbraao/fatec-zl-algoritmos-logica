package exercicios.fatec;
import java.util.ArrayList;

public class SomaNumerosArrayList {

	public static Integer sumNumbers(ArrayList<Integer> numbers) {
		//
		Integer sum = 0;
		
		for (int item = 0; item < numbers.size(); item++) {
			sum += numbers.get(item);
		}
		
		return sum;
	}
	//
	public static void main(String[] args) {
		Integer x1 = Integer.valueOf(20);
		Integer x2 = Integer.valueOf(30);
		Integer x3 = Integer.valueOf(50);
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		//
		System.out.println(SomaNumerosArrayList.sumNumbers(myList));
	}
}
