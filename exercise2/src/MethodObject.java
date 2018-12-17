import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class MethodObject {
	List<ValueObject> list = new ArrayList<>();

	public void inputData(String name, String phone, String gender, String habit) { // -> gui 컴포넌트 넣으면 안됨
	/*	// 방법 1 
		ValueObject value = new ValueObject(name, phone, gender, habit);
		value.setName(name);
		value.setPhone(phone);
		value.setGender(gender);
		value.setHabit(habit);
		list.add(value);*/
		
		// 방법 2
		
		list.add(new ValueObject(name, phone, gender, habit));
		// 값 제대로 저장됐는지 확인 
		System.out.println(list.get(list.size()-1).getName());

		/*
		 * 시도 2 // 이름 list.add("이름: " + name, phone, gender,habit) + "\n"); // 전화번호
		 * list.add("연락처: " + phone + "\n"); // 성별 list.add("성별: " + gender + "\n"); //
		 * 광고유형 list.add("취미: " + habit + "\n");
		 */

		/*
		 * 시도 1 // 성별 if (rabn1.isSelected()) { list.add(rabn1); } else {
		 * list.add(rabn2); } // 광고유형 if (ch1.isSelected()) { list.add(ch1); } else if
		 * (ch2.isSelected()) { list.add(ch2); } else { list.add(ch3); }
		 */
	}

	public String outputData() {// 리스트를 스트링으로 풀어냄
		String obj = "";
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			
			obj += list.get(i).getName() + "\n" + list.get(i).getPhone() + "\n" +list.get(i).getGender() + "\n" +(list.get(i).getHabit().trim().isEmpty()?"없음": list.get(i).getHabit());
			// list.get(i)는 valueObject 자체를 가르키기 떄문에 그 안에 내용 쓸려면 "valueObjct.메소드"로 써야함
			//(list.get(i).getHabit().trim().isEmpty()?"없음": list.get(i).getHabit()) -> 없으면 "없음" 출력한다는 조건문
			System.out.println(obj);
		}
		return obj;
	}
//	Iterator e = list.iterator();  // index 번호 없는 경우 사용함   ex. Map
//	while(e.hasNext()) { 
//		e.next();
//	}

}
