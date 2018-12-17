import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class test1 extends JFrame implements ActionListener {
	JPanel jp;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
	JRadioButton rabn1, rabn2;
	JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9;
	JTextArea ta, ja;
	JCheckBox ch1, ch2, ch3;
	JButton bn1, bn2, bn3;
	JPanel pn1, pn2, pn3, pn4, pn5;

	public test1() {
		super("연습문제");
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

// ++++++++++++++++결과++++++++++++++++++++++++++++
		ta = new JTextArea(7, 20);
		pn4 = new JPanel(new BorderLayout());
		pn4.setBorder(new TitledBorder(new EtchedBorder(), "결과"));
		pn4.add(ta);

// +++++++++++++++++ add ++++++++++++++++++++++++++++++		
		Box verBox = Box.createVerticalBox();

		verBox.add(pn1);
		verBox.add(pn2);
		verBox.add(pn3);
		verBox.add(pn4);

		add(verBox);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test1();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bn3) {
			clear();
		}
// ++++ 텍스트 1. 이름 2. 전화번호 3. 성별 
			if (tf1.getText().isEmpty()) {
//				name = JOptionPane.showInputDialog(this, "등록");
				ta.setText(tf1.getText()); }
			if (tf2.getText().isEmpty())
				ta.append("\n" + tf2.getText());
			if (rabn1.isSelected())
				ta.append("\n" + "성별: 여자 ");
			if (rabn2.isSelected())
				ta.append("\n" + "성별: 남자 ");
// ++++++ 광고유형 1. 신문 2. tv 3. 인터넷 
			if (ch1.isSelected())
				ta.append("\n" + "광고유형: 신문 ");
			if (ch2.isSelected())
				ta.append("\n" + "광고유형: TV ");
			if (ch3.isSelected())
				ta.append("\n" + "광고유형: 인터넷 ");
		
	}

	void clear() {
		// TODO Auto-generated method stub
		tf1.setText("");
		tf2.setText("");
		rabn1.setSelected(false);
		rabn2.setSelected(false);
		ch1.setSelected(false);
		ch2.setSelected(false);
		ch3.setSelected(false);
	}
}
/*
 * // 수직박스(다음 줄로 넘김) Box v5Box = Box.createVerticalBox();
 * v5Box.add(Box.createVerticalStrut(20)); hBox.add(v5Box);
 */