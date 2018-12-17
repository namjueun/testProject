package 남주은;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.xml.crypto.Data;

public class MainClass extends JFrame implements ActionListener {
	JPanel pn1, pn2, pn3; // 회원등록 삭제 조회, 구구단, 결과
	JTextField tf1, tf2, tf3;
	JRadioButton rbn1, rbn2; // 여, 남
	JButton bn1, bn2, bn3, bn4; // 회원등록, 회원삭제, 전체회원조회, 구구단보기
	JLabel jl1, jl2, jl3, jl4; // 회원ID, 회원이름, 전화번호, 성별
	JTextArea ta; // 결과 -> 패널에 추가
	ButtonGroup bg;
	String id, nam, phone, gen;
	String str;

	ProgTest1 test1 = new ProgTest1();
	ProgTest2 test2 = new ProgTest2();
	MemberData memberdata = new MemberData();

	MainClass() {
		setLayout(new FlowLayout());

		// <회원등록, 삭제, 조회>
		Box vBox = Box.createVerticalBox();
		Box hBox = Box.createHorizontalBox();
		hBox.add(jl1 = new JLabel("회원ID: "));
		hBox.add(tf1 = new JTextField(10));
		hBox.add(jl2 = new JLabel("회원이름: "));
		hBox.add(tf2 = new JTextField(10));
		hBox.add(jl3 = new JLabel("전화번호 :"));
		hBox.add(tf3 = new JTextField(10));
		hBox.add(Box.createHorizontalStrut(20));
		hBox.add(jl4 = new JLabel("성별: "));
		hBox.add(rbn1 = new JRadioButton("여자"));
		hBox.add(Box.createHorizontalStrut(10));
		hBox.add(rbn2 = new JRadioButton("남자"));
		Box h2Box = Box.createHorizontalBox();
		h2Box.add(bn1 = new JButton("회원등록"));
		h2Box.add(Box.createHorizontalStrut(30));
		h2Box.add(bn2 = new JButton("회원삭제"));
		h2Box.add(Box.createHorizontalStrut(30));
		h2Box.add(bn3 = new JButton("전체회원조회"));
		h2Box.add(Box.createHorizontalStrut(30));

		vBox.add(hBox);
		vBox.add(h2Box);
		add(vBox);

		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);

		pn1 = new JPanel(new BorderLayout());
		pn1.setBorder(new TitledBorder(new EtchedBorder(), "회원등록, 삭제, 조회"));
		pn1.add(vBox, BorderLayout.CENTER);

		// <구구단>
		pn2 = new JPanel(new BorderLayout());
		Box h3Box = Box.createHorizontalBox();
		h3Box.add(bn4 = new JButton("구구단보기"));
		bn4.addActionListener(this);

		pn2.setBorder(new TitledBorder(new EtchedBorder(), "구구단"));
		pn2.add(h3Box, BorderLayout.CENTER);

		// <결과>
		pn3 = new JPanel(new BorderLayout());
		ta = new JTextArea(10, 10);
		pn3.setBorder(new TitledBorder(new EtchedBorder(), "결과"));
		pn3.add(ta, BorderLayout.SOUTH);

		// <저장>
		Box verBox = Box.createVerticalBox();
		verBox.add(pn1);
		verBox.add(pn2);
		verBox.add(pn3);
		add(verBox);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainClass();
	}

	public void actionPerformed(ActionEvent e) {
		// 회원등록 눌렀을 떄
		if (e.getSource() == bn1) {
			int select1 = JOptionPane.showConfirmDialog(null, "회원을 등록하시겠습니까");
			// 그냥 창을 닫은 경우
			if (select1 == JOptionPane.CLOSED_OPTION) {
				// yes
			} else if (select1 == JOptionPane.YES_OPTION) {
				id = tf1.getText();
				nam = tf2.getText();
				phone = tf3.getText();
				// 성별
				if (rbn1.isSelected())
					gen = "여자";
				if (rbn2.isSelected())
					gen = "남자";

				str = id + "\t" + nam + "\t" + phone + "\t" + gen + "\n";
				test2.mapListAdd(tf1.getText(), tf2.getText(), tf3.getText(), gen);

//				System.out.println(test2.mapListAdd(id,nam,phone,gen));
				clear();

				/*
				 * Enumeration<AbstractButton> enums = bg.getElements();
				 * while(enums.hasMoreElements()) { AbstractButton ab = enums.nextElement();
				 * JRadioButton jb = (JRadioButton) ab; if(jb.isSelected()) gen = jb.getText();
				 * }
				 */
				// no
			} else if (select1 == JOptionPane.NO_OPTION) {
				clear();
				// cancel
			} else {
			}
		}

		// 회원 삭제 눌렀을 때
		if (e.getSource() == bn2) {
			int select2 = JOptionPane.showConfirmDialog(null, "회원을 삭제하시겠습니까");
			// 그냥 창을 닫은 경우
			if (select2 == JOptionPane.CLOSED_OPTION) {
				// yes
			} else if (select2 == JOptionPane.YES_OPTION) {
				test2.mapListRemove(id);
				clear();
				// no
			} else if (select2 == JOptionPane.NO_OPTION) {
				clear();
				// cancel
			} else {
			}
		}
		// 전체회원조회 눌렀을 때

		if (e.getSource() == bn3) {
			// getMapList() 메소드 호출;
			ArrayList<MemberData> getMapList = new ArrayList<MemberData>();
			ArrayList<MemberData> li = test2.getMapList();
			String str1 = "";
			ta.setText("회원ID" + "\t" + "회원이름" + "\t" + "전화번호" + "\t" + "성별" + "\n");
			System.out.println(li.size());
			for (int i = 0; i < li.size(); i++) {
				str1 += li.get(i).getMemberID() + "\t" + li.get(i).getName() + "\t" + li.get(i).getTel() + "\t"
						+ li.get(i).getGender() + "\n";
			}
			ta.append(str1);
		}

		// 구구단보기 눌렀을 때
		if (e.getSource() == bn4) {
			// getGugudan() 메소드 호출
			String gugudan = JOptionPane.showInputDialog(this, "몇 단을 보시겠습니까?");
			ta.setText(test1.getGugudan((Integer.parseInt(gugudan))));
			clear();
		}
	}

	// 값 입력 후 빈칸으로
	void clear() {
		// TODO Auto-generated method stub
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		if (rbn1.isSelected())
			rbn1.setSelected(false);
		if (rbn2.isSelected())
			rbn2.setSelected(false);
	}
}
