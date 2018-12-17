import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ValueObject  { // ����� ���� �ڷ��� 
	private String name;
	private String phone;
	private String gender;
	private String habit;

	

// ++++++++++++ �ʵ� ������ ������ �ϴ� ������  +++++++++++++++++++++++ 
public ValueObject(String name, String phone, String gender, String habit) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.habit = habit;
	}
public ValueObject() { 
	super();
}
	// +++++++++++++++++ getter / setter ++++++++++++++++++++++++++ 	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHabit() {
		return habit;
	}

	public void setHabit(String habit) {
		this.habit = habit;
	}

}
