import java.util.*;
public class MapDemo1
{
	public static void main(String args[])
	{
		HashMap map = new HashMap();
		//Adding elements to the map
		map.put(1,"Amit");
		map.put(5,"Rahul");
		map.put(2,"Jai");
		map.put(6,"Amit");
		//Traversing Map
		Set set = map.entrySet();	//Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			//Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		String s = (String)map.get(5);
		System.out.println(s);
		System.out.println(map);
	}
}
