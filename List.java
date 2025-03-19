package Abstract_List;


public abstract class List<T> {
	

	public abstract List emptyList();
	
	public abstract List insert(List L,int p,T e);
	
	public abstract List delete(List L,int p);
	
	public abstract T access(List L,int p);
	
	public abstract boolean isEmpty(List L);
	
	public abstract int length(List L);
	
	public List concatenate(List L1,List L2) {
		List L =new ArrayList();
		int size = L1.length(L1) + L2.length(L2);

		for(int i = 1; i <= L1.length(L1);i++)
		{
			
			L = L.insert(L, i, L1.access(L1, i));
				
		}
			
		for(int i = 1; i <= L2.length(L2);i++)
		{
			
			L = L.insert(L, i + L1.length(L1), L2.access(L2, i));
				
		}
				
		
		return L;
	}
	
	public List reverse(List L) {
		List<T> newList;
		if(L instanceof ArrayList){
			newList = new ArrayList();
		}
		else {
			newList = new LinkedList();
		}
		for(int i = 1;i <= L.length(L);i++) {
			newList = newList.insert(newList,i,(T) L.access(L, L.length(L) + 1 - i));
		}
		return newList;
	}
	
}
