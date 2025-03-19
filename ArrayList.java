package Abstract_List;

public class ArrayList<T> extends List<T>{

	private static final int MaxSize = 1000;
	private T[] tab ;
	private int length;
	
	public ArrayList() {
		tab = (T[]) new Object[MaxSize];
	}
	
	@Override
	public List emptyList() {
		ArrayList<T> L = new ArrayList<>();
		length = 0;
		return L;
	}

	@Override
	public List insert(List L, int p, T e) {
		p = p - 1;
		if(p <= MaxSize) {
			if(p != length + 1) {
				for(int i = length; i >= p;i--) {
					 tab[i+1] = tab[i];
				}
		
			}
			tab[p] = e;
			length = length + 1;
		}
		else {
			System.out.println("the array is full.");
		}
		return L;
	}

	@Override
	public List delete(List L, int p) {
		p = p - 1;
		if(length != 1) {
			for(int i = p;i < length;i++) {
				tab[i] = tab[i+1];
			}
			
		}
		length = length - 1;
		return L;
	}

	@Override
	public T access(List L, int p) {
		p = p - 1;
		return tab[p];
	}
	
	@Override
	public boolean isEmpty(List L) {
		
		return length == 0;
		
	}
	
	@Override
	public int length(List L) {
		return length;
	}

}
