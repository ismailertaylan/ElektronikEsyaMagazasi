import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class frm1 extends JFrame {
	int asus=2000;
	int msi=3000;
	int monster=4000;
	int i5=1000;
	int i7=2000;
	int i9=4000;
	int mouse=50;
	int mousek=150;
	int mousekk=300;
	int GTX1660=4000;
	int RTX2060=10000;
	int RTX3090=25000;
	int B550=1000;
	int X570=3000;
	int Z590=7000;
	boolean kontrol1=false;
	boolean kontrol2=false;
	boolean kontrol3=false;
	boolean kontrol4=false;
	boolean kontrol5=false;
	private JPanel contentPane;
	private JTextField spt1;
	private JTextField fyt1;
	private JTextField spt2;
	private JTextField fyt2;
	private JTextField spt4;
	private JTextField fyt4;
	private JTextField spt3;
	private JTextField fyt3;
	private JTextField spt5;
	private JTextField fyt5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm1 frame = new frm1();
					frame.setTitle("Elektronik Eþya Maðazasý");
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
	public frm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 884, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(300, 20, 3, 420);
		panel.add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(600, 20, 3, 420);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("\u00DCR\u00DCNLER");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 20, 284, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Para birimini se\u00E7iniz: ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 68, 137, 14);
		panel.add(lblNewLabel_1);
		
		JRadioButton tlbutton = new JRadioButton("TL");
		tlbutton.setBackground(SystemColor.activeCaption);
		tlbutton.setForeground(Color.WHITE);
		tlbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		tlbutton.setBounds(160, 66, 51, 23);
		panel.add(tlbutton);
		
		JRadioButton usdbutton = new JRadioButton("USD");
		usdbutton.setForeground(Color.WHITE);
		usdbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		usdbutton.setBackground(SystemColor.activeCaption);
		usdbutton.setBounds(211, 66, 65, 23);
		panel.add(usdbutton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(tlbutton);
		group.add(usdbutton);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(35, 128, 245, 22);
		panel.add(cb1);
		cb1.addItem("seçiniz");
		cb1.addItem("ASUS");
		cb1.addItem("MSI");
		cb1.addItem("MONSTER");
		
		JLabel lblNewLabel_2 = new JLabel("B\u0130LG\u0130SAYARLAR");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 109, 93, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBounds(35, 180, 245, 22);
		panel.add(cb2);
		cb2.addItem("seçiniz");
		cb2.addItem("i5");
		cb2.addItem("i7");
		cb2.addItem("i9");
		
		
		JLabel lblNewLabel_2_1 = new JLabel("\u0130\u015ELEMC\u0130LER");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 161, 93, 14);
		panel.add(lblNewLabel_2_1);
		
		JComboBox cb3 = new JComboBox();
		cb3.setBounds(35, 232, 245, 22);
		panel.add(cb3);
		cb3.addItem("seçiniz");
		cb3.addItem("MOUSE");
		cb3.addItem("MOUSE + KLAVYE");
		cb3.addItem("MOUSE + KLAVYE + KULAKLIK");
		
		JLabel lblNewLabel_2_2 = new JLabel("PC AKSESUARLARI");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBounds(10, 213, 109, 14);
		panel.add(lblNewLabel_2_2);
		
		JComboBox cb4 = new JComboBox();
		cb4.setBounds(35, 284, 245, 22);
		panel.add(cb4);
		cb4.addItem("seçiniz");
		cb4.addItem("GTX 1660");
		cb4.addItem("RTX 2060");
		cb4.addItem("RTX 3090");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("EKRAN KARTLARI");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(10, 265, 109, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JComboBox cb5 = new JComboBox();
		cb5.setBounds(35, 336, 245, 22);
		panel.add(cb5);
		cb5.addItem("seçiniz");
		cb5.addItem("B550");
		cb5.addItem("X570");
		cb5.addItem("Z590");
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("ANA KARTLAR");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(10, 317, 93, 14);
		panel.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton = new JButton("SEPETE EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tlbutton.isSelected()&& !usdbutton.isSelected()) {
					//nothing 
				}
				else {
					if(tlbutton.isSelected()) {
						
						if(cb1.getSelectedIndex()!=0) {
							spt1.setText(String.valueOf(cb1.getSelectedItem()));
							switch(cb1.getSelectedIndex()) {
							case 1:
								fyt1.setText(String.valueOf(asus));
								break;
							case 2:
								fyt1.setText(String.valueOf(msi));
								break;
							case 3:
								fyt1.setText(String.valueOf(monster));
								break;
							}
							kontrol1=true;
							
						}
						
						if(cb2.getSelectedIndex()!=0) {
							spt2.setText(String.valueOf(cb2.getSelectedItem()));
							switch(cb2.getSelectedIndex()) {
							case 1:
								fyt2.setText(String.valueOf(i5));
								break;
							case 2:
								fyt2.setText(String.valueOf(i7));
								break;
							case 3:
								fyt2.setText(String.valueOf(i9));
								break;
							}
							kontrol2=true;
						}
						
						if(cb3.getSelectedIndex()!=0) {
							spt3.setText(String.valueOf(cb3.getSelectedItem()));
							switch(cb3.getSelectedIndex()) {
							case 1:
								fyt3.setText(String.valueOf(mouse));
								break;
							case 2:
								fyt3.setText(String.valueOf(mousek));
								break;
							case 3:
								fyt3.setText(String.valueOf(mousekk));
								break;
							}
							kontrol3=true;
						}
						
						if(cb4.getSelectedIndex()!=0) {
							spt4.setText(String.valueOf(cb4.getSelectedItem()));
							switch(cb4.getSelectedIndex()) {
							case 1:
								fyt4.setText(String.valueOf(GTX1660));
								break;
							case 2:
								fyt4.setText(String.valueOf(RTX2060));
								break;
							case 3:
								fyt4.setText(String.valueOf(RTX3090));
								break;
							}
							kontrol4=true;
						}
						
						if(cb5.getSelectedIndex()!=0) {
							spt5.setText(String.valueOf(cb5.getSelectedItem()));
							switch(cb5.getSelectedIndex()) {
							case 1:
								fyt5.setText(String.valueOf(B550));
								break;
							case 2:
								fyt5.setText(String.valueOf(X570));
								break;
							case 3:
								fyt5.setText(String.valueOf(Z590));
								break;
							}
							kontrol5=true;
						}
					}
					else if(usdbutton.isSelected()) {
						if(cb1.getSelectedIndex()!=0) {
							spt1.setText(String.valueOf(cb1.getSelectedItem()));
							switch(cb1.getSelectedIndex()) {
							case 1:
								fyt1.setText(String.valueOf(asus/8));
								break;
							case 2:
								fyt1.setText(String.valueOf(msi/8));
								break;
							case 3:
								fyt1.setText(String.valueOf(monster/8));
								break;
							}
							kontrol1=true;
						}
						
						if(cb2.getSelectedIndex()!=0) {
							spt2.setText(String.valueOf(cb2.getSelectedItem()));
							switch(cb2.getSelectedIndex()) {
							case 1:
								fyt2.setText(String.valueOf(i5/8));
								break;
							case 2:
								fyt2.setText(String.valueOf(i7/8));
								break;
							case 3:
								fyt2.setText(String.valueOf(i9/8));
								break;
							}
							kontrol2=true;
						}
						
						if(cb3.getSelectedIndex()!=0) {
							spt3.setText(String.valueOf(cb3.getSelectedItem()));
							switch(cb3.getSelectedIndex()) {
							case 1:
								fyt3.setText(String.valueOf(mouse/8));
								break;
							case 2:
								fyt3.setText(String.valueOf(mousek/8));
								break;
							case 3:
								fyt3.setText(String.valueOf(mousekk/8));
								break;
							}
							kontrol3=true;
						}
						
						if(cb4.getSelectedIndex()!=0) {
							spt4.setText(String.valueOf(cb4.getSelectedItem()));
							switch(cb4.getSelectedIndex()) {
							case 1:
								fyt4.setText(String.valueOf(GTX1660/8));
								break;
							case 2:
								fyt4.setText(String.valueOf(RTX2060/8));
								break;
							case 3:
								fyt4.setText(String.valueOf(RTX3090/8));
								break;
							}
							kontrol4=true;
						}
						
						if(cb5.getSelectedIndex()!=0) {
							spt5.setText(String.valueOf(cb5.getSelectedItem()));
							switch(cb5.getSelectedIndex()) {
							case 1:
								fyt5.setText(String.valueOf(B550/8));
								break;
							case 2:
								fyt5.setText(String.valueOf(X570/8));
								break;
							case 3:
								fyt5.setText(String.valueOf(Z590/8));
								break;
							}
							kontrol5=true;
						}
					}
				}
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(79, 373, 144, 32);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("*1 USD = 8 TL esas al\u0131nm\u0131\u015Ft\u0131r");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 416, 284, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*Fiyatlar\u0131m\u0131za (%18) KDV dahildir.");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(309, 416, 285, 24);
		panel.add(lblNewLabel_4);
		
		spt1 = new JTextField();
		spt1.setEditable(false);
		spt1.setBounds(311, 75, 190, 33);
		panel.add(spt1);
		spt1.setColumns(10);
		
		JLabel lblSepet = new JLabel("SEPET");
		lblSepet.setHorizontalAlignment(SwingConstants.CENTER);
		lblSepet.setForeground(Color.WHITE);
		lblSepet.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSepet.setBackground(Color.WHITE);
		lblSepet.setBounds(310, 20, 284, 53);
		panel.add(lblSepet);
		
		fyt1 = new JTextField();
		fyt1.setEditable(false);
		fyt1.setColumns(10);
		fyt1.setBounds(511, 75, 74, 33);
		panel.add(fyt1);
		
		spt2 = new JTextField();
		spt2.setEditable(false);
		spt2.setColumns(10);
		spt2.setBounds(311, 128, 190, 33);
		panel.add(spt2);
		
		fyt2 = new JTextField();
		fyt2.setEditable(false);
		fyt2.setColumns(10);
		fyt2.setBounds(511, 128, 74, 33);
		panel.add(fyt2);
		
		spt4 = new JTextField();
		spt4.setEditable(false);
		spt4.setColumns(10);
		spt4.setBounds(311, 233, 190, 33);
		panel.add(spt4);
		
		fyt4 = new JTextField();
		fyt4.setEditable(false);
		fyt4.setColumns(10);
		fyt4.setBounds(511, 233, 74, 33);
		panel.add(fyt4);
		
		spt3 = new JTextField();
		spt3.setEditable(false);
		spt3.setColumns(10);
		spt3.setBounds(311, 180, 190, 33);
		panel.add(spt3);
		
		fyt3 = new JTextField();
		fyt3.setEditable(false);
		fyt3.setColumns(10);
		fyt3.setBounds(511, 180, 74, 33);
		panel.add(fyt3);
		
		spt5 = new JTextField();
		spt5.setEditable(false);
		spt5.setColumns(10);
		spt5.setBounds(311, 286, 190, 33);
		panel.add(spt5);
		
		fyt5 = new JTextField();
		fyt5.setEditable(false);
		fyt5.setColumns(10);
		fyt5.setBounds(511, 286, 74, 33);
		panel.add(fyt5);
		
		JTextPane faturaTxt = new JTextPane();
		faturaTxt.setEditable(false);
		faturaTxt.setBounds(629, 75, 228, 365);
		panel.add(faturaTxt);
		
		JButton btnFatura = new JButton("FATURA");
		btnFatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("#.#");
				String faturaString= new String();
				double toplam=0;
				double kdv=0;
				faturaString+="       *ELEKTRONÝK EÞYA MAÐAZASI*\n\n";
				if(tlbutton.isSelected()) {
					if(kontrol1) {
						faturaString+="Bilgisayar    (+%18 KDV) :   "+fyt1.getText()+" TL\n";
						toplam+= Double.parseDouble(fyt1.getText());
					}
					if(kontrol2) {
						faturaString+="Ýþlemci        (+%18 KDV) :   "+fyt2.getText()+" TL\n";
						toplam+= Double.parseDouble(fyt2.getText());
					}					
					if(kontrol3) {
						faturaString+="Aksesuar     (+%18 KDV) :   "+fyt3.getText()+" TL\n";
						toplam+= Double.parseDouble(fyt3.getText());
					}					
					if(kontrol4) {
						faturaString+="Ekran Kartý   (+%18 KDV) :   "+fyt4.getText()+" TL\n";
						toplam+= Double.parseDouble(fyt4.getText());
					}					
					if(kontrol5) {
						faturaString+="Ana Kart       (+%18 KDV) :   "+fyt5.getText()+" TL\n";
						toplam+= Double.parseDouble(fyt5.getText());
					}
					kdv=(toplam/118.0)*18.0;
					faturaString+="*******************************************\n";
					faturaString+="Toplam KDV\t\t : "+df.format(kdv)+" TL\n";
					faturaString+="KDV'siz Toplam\t : "+ df.format(toplam-kdv)+" TL\n";
					faturaString+="*******************************************\n";
					faturaString+="Genel Toplam\t : "+df.format(toplam)+" TL\n";
					faturaString+="*******************************************\n";
					faturaString+="*Bizi tercih ettiðiniz için teþekkür ederiz.*\nYine Bekleriz :)\n";
					faturaTxt.setText(faturaString);
				}
				else if(usdbutton.isSelected()) {
					if(kontrol1) {
						faturaString+="Bilgisayar   (+%18 KDV) :   "+fyt1.getText()+" USD\n";
						toplam+= Double.parseDouble(fyt1.getText());
					}
					if(kontrol2) {
						faturaString+="Ýþlemci      (+%18 KDV) :   "+fyt2.getText()+" USD\n";
						toplam+= Double.parseDouble(fyt2.getText());
					}					
					if(kontrol3) {
						faturaString+="Aksesuar     (+%18 KDV) :   "+fyt3.getText()+" USD\n";
						toplam+= Double.parseDouble(fyt3.getText());
					}					
					if(kontrol4) {
						faturaString+="Ekran Kartý  (+%18 KDV) :   "+fyt4.getText()+" USD\n";
						toplam+= Double.parseDouble(fyt4.getText());
					}					
					if(kontrol5) {
						faturaString+="Ana Kart     (+%18 KDV) :   "+fyt5.getText()+" USD\n";
						toplam+= Double.parseDouble(fyt5.getText());
					}
					kdv=(toplam/118.0)*18.0;
					faturaString+="*******************************************\n";
					faturaString+="Toplam KDV\t\t : "+df.format(kdv)+" USD\n";
					faturaString+="KDV'siz Toplam\t : "+df.format(toplam-kdv)+" USD\n";
					faturaString+="*******************************************\n";
					faturaString+="Genel Toplam\t : "+df.format(toplam)+" USD\n";
					faturaString+="*******************************************\n";
					faturaString+="*Bizi tercih ettiðiniz için teþekkür ederiz.*\nYine Bekleriz :)\n";
					faturaTxt.setText(faturaString);
				}
				
			}
		});
		btnFatura.setForeground(Color.BLACK);
		btnFatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFatura.setBackground(SystemColor.inactiveCaption);
		btnFatura.setBounds(373, 350, 154, 53);
		panel.add(btnFatura);
		
		JLabel lblSepet_1 = new JLabel("FATURA");
		lblSepet_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSepet_1.setForeground(Color.WHITE);
		lblSepet_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSepet_1.setBackground(Color.WHITE);
		lblSepet_1.setBounds(606, 22, 272, 53);
		panel.add(lblSepet_1);
		
		
		
		
	}
}
