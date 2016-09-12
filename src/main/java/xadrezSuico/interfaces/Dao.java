package xadrezSuico.interfaces;

import java.util.Map;

public interface Dao<T, K> {
	public void insert(T t);
	public T search(K k);
	public void update(T t, K k);
	public void delete(K k);
	public Map<Integer,T> all();
}
