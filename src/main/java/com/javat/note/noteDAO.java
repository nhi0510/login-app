package com.javat.note;
import java.util.ArrayList;
import java.util.List;

public class noteDAO {
	public static List<note> ls = new ArrayList<note>();
	public note findByTitle(String title) {
		for (note note : ls) {
			if (note.getTitle().equals(title)) {
				return note;
			}
			
		}
		return null;
	}
public int update(note note) {
	for(int i=0;i< ls.size();i++)
	{
		if(ls.get(i).getTitle().equals(note.getTitle())) {
			ls.set(i, note);
			return i;
		}
	}
	return -1;
}
public int save(note note) {
	if(findByTitle((String) note.getTitle()) != null ) {
		update(note);
	}else {
		ls.add(note);
	}
	return 1;
}
public int delete(String Title) {
	note t = findByTitle(Title);
	if(t != null) {
		ls.remove(t);
		return 1;
	}
	return 0;
	}
public List<note>getAll(){
	return ls ;
}
}