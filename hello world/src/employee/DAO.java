package employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
	private Map<String,T>  maps;
	
	
	public DAO() {
		
		maps=new HashMap<String,T>();
	}

	public DAO(Map<String, T> maps) {
		this.maps = maps;
	}

	public void save(String id,T t) {
		maps.put(id, t);
	}
	
	public void del(String id) {
		maps.remove(id);
	}
	public void update(String id,T t) {
		maps.put(id, t);
	}
	/**
	 * 根据Key获取Value
	 * @param id
	 * @return value
	 */
	public T get(String id) {
		
		return maps.get(id);
	}
	
	public List<T> list(){
		List<T> list1=new ArrayList<>();
		for(String str:maps.keySet()) {
			list1.add(maps.get(str));
		}
		return list1;
	}
	public void numberof() {
		maps.size();
	}
	
	
}
