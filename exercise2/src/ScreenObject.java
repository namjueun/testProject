import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenObject extends JFrame implements ActionListener {
	JPanel jp;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
	JRadioButton rabn1, rabn2;
	JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9;
	JPanel pn1, pn2, pn3, pn4, pn5;
	JCheckBox ch1, ch2, ch3;
	JButton bn1, bn2, bn3;


	String namee, phonee, genderr, habitt;
	String str = namee + phonee + genderr + habitt;
	// + MethodObject 클래스 호출 + -> 전역으로 호출해야  다른 곳에서도 값 호출 가능합. 한번만 호출해야함 
	
	MethodObject method = new MethodObject();
	
	ScreenObject() {
		setLayout(new FlowLayout());

// 			++++++++++++++++++ 테스트 부분++++++++++++++++++ 
//		pn1 = new JPanel(new BorderLayout());
		// 수직 박스
		Box vBox = Box.createVerticalBox();
		// 수평 박스
		Box hBox = Box.createHorizontalBox();
		hBox.add(jl1 = new JLabel("이름: "));
		hBox.add(tf1 = new JTextField(10));
		hBox.add(Box.createHorizontalStrut(10));
//		hBox.setAlignmentX(RIGHT_ALIGNMENT);
		vBox.add(hBox);
		Box haBox = Box.createHorizontalBox();
		haBox.add(jl2 = new JLabel("전화번호: "));
		haBox.add(tf2 = new JTextField(20));
		haBox.add(Box.createHorizontalStrut(10));
		vBox.add(haBox);
		Box hbBox = Box.createHorizontalBox();
		hbBox.add(jl3 = new JLabel("성별 :"));
		hbBox.add(Box.createHorizontalStrut(20));
		hbBox.add(rabn1 = new JRadioButton("여자"));
		hbBox.add(Box.createHorizontalStrut(30));
		hbBox.add(rabn2 = new JRadioButton("남자"));
		hbBox.add(Box.createHorizontalStrut(30));
//		bBox.add(Box.createGlue());
		vBox.add(hbBox);

//		vBox.add(hBox);

		pn1 = new JPanel(new BorderLayout());
		pn1.setBorder(new TitledBorder(new EtchedBorder(), "테스트"));
		pn1.add(vBox, BorderLayout.CENTER);

//		+++++++++++++++++++광고유형 부분 +++++++++++++++++++++ 
		pn2 = new JPanel(new BorderLayout());
		// 수직 박스
		Box v2Box = Box.createVerticalBox();
		// 수평 박스
		Box h2Box = Box.createHorizontalBox();

		h2Box.add(ch1 = new JCheckBox("신문"));
		h2Box.add(Box.createHorizontalStrut(30));
		h2Box.add(ch2 = new JCheckBox("TV"));
		h2Box.add(Box.createHorizontalStrut(30));
		h2Box.add(ch3 = new JCheckBox("인터넷"));
		h2Box.add(Box.createGlue());
		v2Box.add(h2Box);

		ch1.addActionListener(this);
		ch2.addActionListener(this);
		ch3.addActionListener(this);

//		pn2 = new JPanel(new BorderLayout());
		pn2.setBorder(new TitledBorder(new EtchedBorder(), "광고유형"));
		pn2.add(v2Box, BorderLayout.CENTER);

// +++++++++++++++버튼 부분++++++++++++++++++++++++++++++
		pn3 = new JPanel(new BorderLayout());
		// 수직 박스
		Box v3Box = Box.createVerticalBox();
		// 수평 박스
		Box h3Box = Box.createHorizontalBox();

		h3Box.add(bn1 = new JButton("등록"));
		h3Box.add(Box.createHorizontalStrut(30));
		h3Box.add(bn2 = new JButton("확인"));
		h3Box.add(Box.createHorizontalStrut(30));
		h3Box.add(bn3 = new JButton("삭제"));
		h3Box.add(Box.createHorizontalStrut(30));
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);

		v3Box.add(h3Box);
		pn3 = new JPanel(new BorderLayout());
		pn3.add(v3Box, BorderLayout.SOUTH);

// +++++++++++++++++ add ++++++++++++++++++++++++++++++		
		Box verBox = Box.createVerticalBox();

		verBox.add(pn1);
		verBox.add(pn2);
		verBox.add(pn3);
		add(verBox);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 270);
		setVisible(true);
	}

	/*
	 * void clear() { // TODO Auto-generated method stub tf1.setText("");
	 * tf2.setText(""); rabn1.setSelected(false); rabn2.setSelected(false);
	 * ch1.setSelected(false); ch2.setSelected(false); ch3.setSelected(false); }
	 */

	// ++++++++++++++ main +++++++++++++++++++++
	public static void main(String[] args) {
		new ScreenObject();
//		 List<String> list = new ArrayList<>();
//	     List<String> list = new ArrayList<>();
	}

// ++++++++++++++ 액션 리스너 +++++++++++++++++++++
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


		

		// 등록 버튼 - > inputData 메소드 호출
		if (e.getSource() == bn1) {
			int bn1 = JOptionPane.showConfirmDialog(this, "등록?");

			namee = tf1.getText();
			phonee = tf2.getText();
//		+  		  성별   	   +
			if (rabn1.isSelected())
				genderr = "여자";
			if (rabn2.isSelected())
				genderr = "남자";
//		+    	광고유형		+
			if (ch1.isSelected())
				habitt = "신문";
			if (ch2.isSelected())
				habitt = "TV";
			if (ch3.isSelected())
				habitt = "인터넷";

//			String button1 ="";
//			button1 += method.list.toString();
			method.inputData(namee, phonee, genderr, habitt);
			clear();
//		    JOptionPane.showConfirmDialog(this, button1);

		}

		// 확인 버튼 눌렀을 떄 - > outputData 메소드 호출
		if (e.getSource() == bn2) {
			int bn2 = JOptionPane.showConfirmDialog(this, "확인?");
//			String button2 ="";
//			button2 = method.outputData();
			JOptionPane.showMessageDialog(this, method.outputData());
			;

		}

/*		// 삭제 버튼 
		if (e.getSource() == bn3)
		{ int bn3 = JOptionPane.showConfirmDialog(this, "삭제?");
		clear();
	}*/

	}

	void clear() {
		// TODO Auto-generated method stub
		tf1.setText("");
		tf2.setText("");
		if (rabn1.isSelected())
			rabn1.setSelected(false);
		if (rabn2.isSelected())
			rabn2.setSelected(false);
		if (ch1.isSelected())
			ch1.setSelected(false);
		if (ch2.isSelected())
			ch2.setSelected(false);
		if (ch3.isSelected())
			ch3.setSelected(false);
	}

}
/*
 * // 수직박스(다음 줄로 넘김) Box v5Box = Box.createVerticalBox();
 * v5Box.add(Box.createVerticalStrut(20)); hBox.add(v5Box);
 */
