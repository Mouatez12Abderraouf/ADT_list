package Abstract_List;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> L1 = new LinkedList<>();
		List<Integer> L2 = new ArrayList<>();
		
		L1 = creation(L1);
		L2 = creation(L2);
		
		
		List<Integer> LResult = L2.concatenate(L1, L2);
		
		LResult = LResult.reverse(LResult);
		print(LResult);
		

	}
	
	
	
	public static List creation(List L) {
		int N;
		int e;
		System.out.println("Enter the size of List:");
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		for(int i = 1;i <= N;i++) {
			System.out.println("Enter the element: ");
			e = input.nextInt();
			L = L.insert(L, i, e);
		}
		return L;
	}
	
	public static void print(List L) {
		for(int i = 1;i <= L.length(L);i++) {
			System.out.println(L.access(L, i));
		}
	}
}
