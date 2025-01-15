package com;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SportswearUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SportswearUI frame = new SportswearUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SportswearUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(10, 10, 436, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("橘皮運動商品店結算系統");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 5, 416, 62);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 97, 215, 292);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("姓名：");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 24, 60, 32);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("衣服數量：");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 66, 83, 32);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("襪子數量：");
		lblNewLabel_1_3.setFont(new Font("標楷體", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(10, 154, 83, 32);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("褲子數量：");
		lblNewLabel_1_3_1.setFont(new Font("標楷體", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(10, 112, 83, 32);
		panel_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("鞋子數量：");
		lblNewLabel_1_3_2.setFont(new Font("標楷體", Font.BOLD, 16));
		lblNewLabel_1_3_2.setBounds(10, 194, 83, 32);
		panel_1.add(lblNewLabel_1_3_2);
		
		JComboBox pants = new JComboBox();
		pants.setFont(new Font("新宋体", Font.BOLD, 14));
		pants.addItem("0");
		pants.addItem("1");
		pants.addItem("2");
		pants.addItem("3");
		pants.addItem("4");
		pants.addItem("5");
		pants.addItem("6");
		pants.addItem("7");
		pants.addItem("8");
		pants.addItem("9");
		pants.addItem("10");
		pants.setBounds(103, 112, 72, 32);
		panel_1.add(pants);
		
		JComboBox socks = new JComboBox();
		socks.setFont(new Font("新宋体", Font.BOLD, 14));
		socks.addItem("0");
		socks.addItem("1");
		socks.addItem("2");
		socks.addItem("3");
		socks.addItem("4");
		socks.addItem("5");
		socks.addItem("6");
		socks.addItem("7");
		socks.addItem("8");
		socks.addItem("9");
		socks.addItem("10");
		socks.setBounds(103, 154, 72, 32);
		panel_1.add(socks);
		
		JComboBox shoes = new JComboBox();
		shoes.setFont(new Font("新宋体", Font.BOLD, 14));
		shoes.addItem("0");
		shoes.addItem("1");
		shoes.addItem("2");
		shoes.addItem("3");
		shoes.addItem("4");
		shoes.addItem("5");
		shoes.addItem("6");
		shoes.addItem("7");
		shoes.addItem("8");
		shoes.addItem("9");
		shoes.addItem("10");
		shoes.setBounds(103, 194, 72, 32);
		panel_1.add(shoes);
		
		JComboBox clothes = new JComboBox();
		clothes.setFont(new Font("新宋体", Font.BOLD, 14));
		clothes.addItem("0");
		clothes.addItem("1");
		clothes.addItem("2");
		clothes.addItem("3");
		clothes.addItem("4");
		clothes.addItem("5");
		clothes.addItem("6");
		clothes.addItem("7");
		clothes.addItem("8");
		clothes.addItem("9");
		clothes.addItem("10");
		clothes.setBounds(103, 66, 72, 32);
		panel_1.add(clothes);
		
		JTextArea output = new JTextArea();
		output.setFont(new Font("標楷體", Font.BOLD, 16));
		output.setBounds(231, 219, 215, 220);
		contentPane.add(output);
		
		name = new JTextField();
		name.setFont(new Font("標楷體", Font.BOLD, 14));
		name.setBounds(79, 24, 96, 32);
		panel_1.add(name);
		name.setColumns(10);
		
		JRadioButton newguest = new JRadioButton("新客");
		newguest.setSelected(false);
		newguest.setBounds(103, 232, 72, 23);
		panel_1.add(newguest);
		newguest.setFont(new Font("標楷體", Font.BOLD, 16));
		
		JButton clear = new JButton("清除訂單");
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				clothes.setSelectedIndex(0);
				pants.setSelectedIndex(0);
				socks.setSelectedIndex(0);
				shoes.setSelectedIndex(0);
				newguest.setSelected(false);
				output.setText("");
				}
		});
		clear.setFont(new Font("標楷體", Font.BOLD, 14));
		clear.setBounds(7, 261, 96, 23);
		panel_1.add(clear);
		
		JButton con = new JButton("確認訂單");
		con.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Clothes=clothes.getSelectedItem().toString();
				String Pants=pants.getSelectedItem().toString();
				String Socks=socks.getSelectedItem().toString();
				String Shoes=shoes.getSelectedItem().toString();
				Boolean Newguest=newguest.isSelected();
				
				Integer Clothes1=new Integer(Clothes);
				Integer Pants1=new Integer(Pants);
				Integer Socks1=new Integer(Socks);
				Integer Shoes1=new Integer(Shoes);
				
				Sportswear s=new Sportswear(Name,Clothes1,Pants1,Socks1,Shoes1,Newguest);
				
				if(s.getNewguest()==true)
				{	
					output.setText("親愛的客戶您的訂單如下：\n顧客的姓名:"+s.getName()+"\n選購的衣服的數量:"+s.getClothes()+
						"\n選購的褲子的數量:"+s.getPants()+"\n選購的襪子的數量:"+s.getSocks()+
						"\n選購的鞋子的數量:"+s.getShoes()+"\n成交的金額是"+s.getSum()+"元");
				}
				else
				{
					output.setText("尊敬的客戶您的訂單如下：\n顧客的姓名:"+s.getName()+"\n選購的衣服的數量:"+s.getClothes()+
							"\n選購的褲子的數量:"+s.getPants()+"\n選購的襪子的數量:"+s.getSocks()+
							"\n選購的鞋子的數量:"+s.getShoes()+"\n成交的金額是"+s.getSum()+"元");
				}
			}
		});
		con.setFont(new Font("標楷體", Font.BOLD, 14));
		con.setBounds(113, 261, 96, 23);
		panel_1.add(con);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("標楷體", Font.BOLD, 16));
		textArea.setText("衣服一件:300元\n褲子一件:350元\n襪子一雙:49元\n鞋子一雙:500元\n同一類的商品最多買10個\n");
		textArea.setBounds(10, 390, 215, 99);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("新客 滿千折百\n滿千折50\n滿1800折150\n滿三千五折350\n運費：60元\n滿五百元免運\n");
		textArea_1.setFont(new Font("標楷體", Font.BOLD, 16));
		textArea_1.setBounds(231, 97, 215, 122);
		contentPane.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(231, 437, 215, 52);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton clear_1 = new JButton("列印");
		clear_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
                    output.print();
                    
                } catch (Exception ex) {
                    ex.printStackTrace(); 
                }
			}
		});
		clear_1.setBounds(10, 10, 91, 27);
		panel_2.add(clear_1);
		clear_1.setFont(new Font("標楷體", Font.BOLD, 14));
		
		JButton clear_1_1 = new JButton("離開");
		clear_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		clear_1_1.setFont(new Font("標楷體", Font.BOLD, 14));
		clear_1_1.setBounds(114, 10, 91, 27);
		panel_2.add(clear_1_1);
		
		
	}
}
