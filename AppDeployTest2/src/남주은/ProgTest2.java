package 남주은;

import java.util.*;
import java.util.Map.Entry;

public class ProgTest2 {

//	MemberData da;
	Map<String, MemberData> mapList = new Hashtable<String, MemberData>();

	// mapList에 주어진 키와 값을 "추가"하는 메소드
	void mapListAdd(String memberID, String name, String tel, String gender) {
		/*
		 * da = new MemberData(memberID, name, tel, gender); da.setMemberID(memberID);
		 * da.setName(name); da.setTel(tel); da.setGender(gender); // //
		 * mapList.put(memberID, data); mapList.put(memberID, da);
		 */
		mapList.put(memberID, new MemberData(memberID, name, tel, gender));
//		System.out.println(mapList.size());

	}

	// mapList에서 주어진 키와 일치하는 값을 "삭제"하는 메소드
	void mapListRemove(String memberID) {
		mapList.remove(memberID);
//		System.out.println(mapList);
//		mapList.remove(da); // memberId
	}

	// mapList 객체에 저장된 데이터를 ArrayList 객체로 저장하여 반환
	/*
	 * String getMapList() { String li = ""; ArrayList<MemberData> list = new
	 * ArrayList<MemberData>();
	 */
	ArrayList<MemberData> getMapList() {
		ArrayList<MemberData> list = new ArrayList<MemberData>();
		Set<String> keyset = mapList.keySet(); 
		Iterator<String> e = keyset.iterator();
		while (e.hasNext()) {
		
//		da = e.next();
			/*
			 * list += da.getMemberID()+ "\t" + da.getName()+ "\t" + da.getTel()+ "\t" +
			 * da.getGender(); }
			 */
			list.add(mapList.get(e.next())); 
			System.out.println(list);
		}
		return list;
		}
}
