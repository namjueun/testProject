package ������;

import java.util.*;
import java.util.Map.Entry;

public class ProgTest2 {

//	MemberData da;
	Map<String, MemberData> mapList = new Hashtable<String, MemberData>();

	// mapList�� �־��� Ű�� ���� "�߰�"�ϴ� �޼ҵ�
	void mapListAdd(String memberID, String name, String tel, String gender) {
		/*
		 * da = new MemberData(memberID, name, tel, gender); da.setMemberID(memberID);
		 * da.setName(name); da.setTel(tel); da.setGender(gender); // //
		 * mapList.put(memberID, data); mapList.put(memberID, da);
		 */
		mapList.put(memberID, new MemberData(memberID, name, tel, gender));
//		System.out.println(mapList.size());

	}

	// mapList���� �־��� Ű�� ��ġ�ϴ� ���� "����"�ϴ� �޼ҵ�
	void mapListRemove(String memberID) {
		mapList.remove(memberID);
//		System.out.println(mapList);
//		mapList.remove(da); // memberId
	}

	// mapList ��ü�� ����� �����͸� ArrayList ��ü�� �����Ͽ� ��ȯ
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
