import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class MethodObject {
	List<ValueObject> list = new ArrayList<>();

	public void inputData(String name, String phone, String gender, String habit) { // -> gui ������Ʈ ������ �ȵ�
	/*	// ��� 1 
		ValueObject value = new ValueObject(name, phone, gender, habit);
		value.setName(name);
		value.setPhone(phone);
		value.setGender(gender);
		value.setHabit(habit);
		list.add(value);*/
		
		// ��� 2
		
		list.add(new ValueObject(name, phone, gender, habit));
		// �� ����� ����ƴ��� Ȯ�� 
		System.out.println(list.get(list.size()-1).getName());

		/*
		 * �õ� 2 // �̸� list.add("�̸�: " + name, phone, gender,habit) + "\n"); // ��ȭ��ȣ
		 * list.add("����ó: " + phone + "\n"); // ���� list.add("����: " + gender + "\n"); //
		 * �������� list.add("���: " + habit + "\n");
		 */

		/*
		 * �õ� 1 // ���� if (rabn1.isSelected()) { list.add(rabn1); } else {
		 * list.add(rabn2); } // �������� if (ch1.isSelected()) { list.add(ch1); } else if
		 * (ch2.isSelected()) { list.add(ch2); } else { list.add(ch3); }
		 */
	}

	public String outputData() {// ����Ʈ�� ��Ʈ������ Ǯ�
		String obj = "";
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			
			obj += list.get(i).getName() + "\n" + list.get(i).getPhone() + "\n" +list.get(i).getGender() + "\n" +(list.get(i).getHabit().trim().isEmpty()?"����": list.get(i).getHabit());
			// list.get(i)�� valueObject ��ü�� ����Ű�� ������ �� �ȿ� ���� ������ "valueObjct.�޼ҵ�"�� �����
			//(list.get(i).getHabit().trim().isEmpty()?"����": list.get(i).getHabit()) -> ������ "����" ����Ѵٴ� ���ǹ�
			System.out.println(obj);
		}
		return obj;
	}
//	Iterator e = list.iterator();  // index ��ȣ ���� ��� �����   ex. Map
//	while(e.hasNext()) { 
//		e.next();
//	}

}
