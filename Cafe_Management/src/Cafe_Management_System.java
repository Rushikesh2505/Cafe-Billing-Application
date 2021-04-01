import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Cafe_Management_System extends JFrame {

	double [] drink =new double[5];
	double [] cake =new double[8];
	String [] cost =new String[3];
	double[]i=new double[13];
	
	
	private JPanel contentPane;
	private JTextField jlblCostdrink;
	private JTextField jlblCostcake;
	private JTextField jlblService;
	private JTextField jlblTax;
	private JTextField jlblsubTotal;
	private JTextField jlbltotal;
	private JTextField textlattel;
	private JTextField textIL;
	private JTextField textEXP;
	private JTextField textCap;
	private JTextField textIC;
	private JTextField coffeecaketext;
	private JTextField rvcaketext;
	private JTextField BCPcacketext;
	private JTextField BFCcaketext;
	private JTextField LCCcacketext;
	private JTextField KCCcaketext;
	private JTextField KHCcaketext;
	private JTextField QPCcaketext;

	/**
	 * Launch the application.
	 */
	//ImageIcon im=new ImageIcon(".//res//logo.jpg");
	 
	//Set Icon to desktop app
	ImageIcon im=new ImageIcon(getClass().getClassLoader().getResource("logo.jpg"));
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe_Management_System frame = new Cafe_Management_System();
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
	public Cafe_Management_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1006, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setIconImage(im.getImage());
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 252, 258);
		contentPane.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setForeground(Color.BLACK);
		panel.setLayout(null);
		
		JCheckBox CappuccinoCheck = new JCheckBox("Cappuccino");
		CappuccinoCheck.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
				double Cappuccino=Double.parseDouble(textCap.getText());
				double cCappuccino=Double.parseDouble(jlblCostdrink.getText());
				double iCappuccino=2.39 ;
						if(CappuccinoCheck.isSelected()  ) {
							i[0]=(Cappuccino * iCappuccino) + cCappuccino;
							String pDrink=String.format("%.2f",i[0]);
							//textCap.setText(pDrink);
							jlblCostdrink.setText(pDrink);
						}
			}
		});
		
		CappuccinoCheck.setFont(new Font("Tahoma", Font.BOLD, 13));
		CappuccinoCheck.setBounds(6, 156, 111, 23);
		panel.add(CappuccinoCheck);
		
		
		
		JCheckBox ICCheckbox = new JCheckBox("Ice Cappccino");
		ICCheckbox.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				double IceCappuccino=Double.parseDouble(textIC.getText());
				double cIceCappuccino=Double.parseDouble(jlblCostdrink.getText());
				double iIceCappuccino=2.39 ;
						if(ICCheckbox.isSelected()  ) {
							i[4]=(IceCappuccino * iIceCappuccino) + cIceCappuccino;
							String pDrink=String.format("%.2f",i[4]);
							//textCap.setText(pDrink);
							jlblCostdrink.setText(pDrink);
						}
			}
		});
		ICCheckbox.setFont(new Font("Tahoma", Font.BOLD, 13));
		ICCheckbox.setBounds(6, 200, 123, 23);
		panel.add(ICCheckbox);
		
		JCheckBox Excheckbox = new JCheckBox("Expresso");
		Excheckbox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double Expresso=Double.parseDouble(textEXP.getText());
				double cExpresso=Double.parseDouble(jlblCostdrink.getText());
				double iExpresso=1.59 ;
						if(Excheckbox.isSelected()  ) {
							i[3]=(Expresso * iExpresso) + cExpresso;
							String pDrink=String.format("%.2f",i[3]);
							//textEXP.setText(pDrink);
							jlblCostdrink.setText(pDrink);
						}
			}
		});
		Excheckbox.setFont(new Font("Tahoma", Font.BOLD, 13));
		Excheckbox.setBounds(6, 109, 97, 23);
		panel.add(Excheckbox);
		
		JCheckBox ILcheckbox = new JCheckBox("Iced Lattle");
		ILcheckbox.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				double IcedLattle=Double.parseDouble(textIL.getText());
				double cIcedLattle=Double.parseDouble(jlblCostdrink.getText());
				double iIcedLattle=1.59 ;
						if(ILcheckbox.isSelected()  ) {
							i[2]=(IcedLattle * cIcedLattle) + iIcedLattle;
							String pDrink=String.format("%.2f",i[2]);
							//textIL.setText(pDrink);
							jlblCostdrink.setText(pDrink);
						}
			}
		});
		ILcheckbox.setFont(new Font("Tahoma", Font.BOLD, 13));
		ILcheckbox.setBounds(6, 72, 97, 23);
		panel.add(ILcheckbox);
		
		JCheckBox lattlecheckbox = new JCheckBox("Lattle");
		lattlecheckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				double Lattle=Double.parseDouble(textlattel.getText());
				double cLattle=Double.parseDouble(jlblCostdrink.getText());
				double iLattle=1.29 ;
						if(lattlecheckbox.isSelected()  ) {
							i[1]=(Lattle *iLattle) +cLattle;
							String pDrink=String.format("%.2f",i[1]);
							//textlattel.setText(pDrink);
							jlblCostdrink.setText(pDrink);
						}
						}
		});
		lattlecheckbox.setFont(new Font("Tahoma", Font.BOLD, 13));
		lattlecheckbox.setBounds(6, 26, 97, 23);
		panel.add(lattlecheckbox);
		
		textlattel = new JTextField();
		textlattel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textlattel.setText(null);
			}
		});
		textlattel.setFont(new Font("Tahoma", Font.BOLD, 12));
		textlattel.setText("0");
		textlattel.setHorizontalAlignment(SwingConstants.CENTER);
		textlattel.setColumns(10);
		textlattel.setBounds(146, 27, 96, 23);
		panel.add(textlattel);
		
		textIL = new JTextField();
		textIL.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textIL.setText(null);
			}
		});
		textIL.setFont(new Font("Tahoma", Font.BOLD, 12));
		textIL.setText("0");
		textIL.setHorizontalAlignment(SwingConstants.CENTER);
		textIL.setColumns(10);
		textIL.setBounds(146, 74, 96, 20);
		panel.add(textIL);
		
		textEXP = new JTextField();
		textEXP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEXP.setText(null);
			}
		});
		textEXP.setFont(new Font("Tahoma", Font.BOLD, 12));
		textEXP.setText("0");
		textEXP.setHorizontalAlignment(SwingConstants.CENTER);
		textEXP.setColumns(10);
		textEXP.setBounds(146, 112, 96, 20);
		panel.add(textEXP);
		
		textCap = new JTextField();
		textCap.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				textCap.setText(null);
			}
			
		});
		textCap.setFont(new Font("Tahoma", Font.BOLD, 12));
		textCap.setText("0");
		textCap.setHorizontalAlignment(SwingConstants.CENTER);
		textCap.setColumns(10);
		textCap.setBounds(147, 158, 95, 20);
		panel.add(textCap);
		
		textIC = new JTextField();
		textIC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textIC.setText(null);
			}
		});
		textIC.setFont(new Font("Tahoma", Font.BOLD, 12));
		textIC.setText("0");
		textIC.setHorizontalAlignment(SwingConstants.CENTER);
		textIC.setColumns(10);
		textIC.setBounds(146, 202, 96, 20);
		panel.add(textIC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 951, 32);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Cafe Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(279, 54, 262, 258);
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_2);
		
		JCheckBox chckbxCoffeeCake = new JCheckBox("Coffee Cake");
		chckbxCoffeeCake.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double CoffeeCake=Double.parseDouble(coffeecaketext.getText());
				double cCoffeeCake=Double.parseDouble(jlblCostcake.getText());
				double iCoffeeCake=1.99 ;
						if(chckbxCoffeeCake.isSelected()  ) {
							i[5]=(CoffeeCake *iCoffeeCake) +cCoffeeCake;
							String pCoffeeCake=String.format("%.2f",i[5]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(pCoffeeCake);
						}
			}
		});
		chckbxCoffeeCake.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxCoffeeCake.setBounds(6, 7, 97, 23);
		panel_2.add(chckbxCoffeeCake);
		
		JCheckBox chckbxRedVelevetCake = new JCheckBox("Red Velevet Cake");
		chckbxRedVelevetCake.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				
				double RedVelevetCake=Double.parseDouble(rvcaketext.getText());
				double cRedVelevetCake=Double.parseDouble(jlblCostcake.getText());
				double iRedVelevetCake=1.89 ;
						if(chckbxRedVelevetCake.isSelected()  ) {
							i[6]=(RedVelevetCake *iRedVelevetCake) +cRedVelevetCake;
							String pRedVelevetCake=String.format("%.2f",i[6]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(pRedVelevetCake);
						}
		
			}
		});
		chckbxRedVelevetCake.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxRedVelevetCake.setBounds(6, 33, 115, 23);
		panel_2.add(chckbxRedVelevetCake);
		
		JCheckBox chckbxBostonCreamPie = new JCheckBox("Boston Cream Pie");
		chckbxBostonCreamPie.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double BostonCreamPie=Double.parseDouble(BCPcacketext.getText());
				double cBostonCreamPie=Double.parseDouble(jlblCostcake.getText());
				double iBostonCreamPie=1.69 ;
						if(chckbxBostonCreamPie.isSelected()  ) {
							i[7]=(BostonCreamPie *iBostonCreamPie) +cBostonCreamPie;
							String PBoston=String.format("%.2f",i[7]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(PBoston);
						}
			}
		});
		chckbxBostonCreamPie.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxBostonCreamPie.setBounds(6, 59, 129, 23);
		panel_2.add(chckbxBostonCreamPie);
		
		JCheckBox chckbxBlackForestCake = new JCheckBox("Black Forest Cake");
		chckbxBlackForestCake.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					double BlackForest=Double.parseDouble(BFCcaketext.getText());
					double cBlackForest=Double.parseDouble(jlblCostcake.getText());
					double iBlackForest=1.49 ;
							if(chckbxBlackForestCake.isSelected()  ) {
								i[8]=(BlackForest *iBlackForest) +cBlackForest;
								String pBlackFOrest=String.format("%.2f",i[8]);
								//textlattel.setText(pDrink);
								jlblCostcake.setText(pBlackFOrest);
							}	
					
			}
		});
		chckbxBlackForestCake.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxBlackForestCake.setBounds(6, 85, 129, 23);
		panel_2.add(chckbxBlackForestCake);
		
		JCheckBox chckbxKarltonHillChocolate = new JCheckBox("Karlton Hill Chocolate Cake");
		chckbxKarltonHillChocolate.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double KHCCake=Double.parseDouble(KHCcaketext.getText());
				double cKHCCake=Double.parseDouble(jlblCostcake.getText());
				double iKHCCake=3.49 ;
						if(chckbxKarltonHillChocolate.isSelected()  ) {
							i[11]=(KHCCake *iKHCCake) +cKHCCake;
							String pKarltonHill=String.format("%.2f",i[11]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(pKarltonHill);
						}	
			}
		});
		chckbxKarltonHillChocolate.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxKarltonHillChocolate.setBounds(6, 191, 129, 23);
		panel_2.add(chckbxKarltonHillChocolate);
		
		coffeecaketext = new JTextField();
		coffeecaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				coffeecaketext.setText(null);
			}
		});
		coffeecaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		coffeecaketext.setText("0");
		coffeecaketext.setHorizontalAlignment(SwingConstants.CENTER);
		coffeecaketext.setColumns(10);
		coffeecaketext.setBounds(167, 8, 86, 23);
		panel_2.add(coffeecaketext);
		
		rvcaketext = new JTextField();
		rvcaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rvcaketext.setText(null);
			}
		});
		rvcaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		rvcaketext.setText("0");
		rvcaketext.setHorizontalAlignment(SwingConstants.CENTER);
		rvcaketext.setColumns(10);
		rvcaketext.setBounds(166, 33, 87, 23);
		panel_2.add(rvcaketext);
		
		BCPcacketext = new JTextField();
		BCPcacketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BCPcacketext.setText(null);
			}
		});
		BCPcacketext.setText("0");
		BCPcacketext.setHorizontalAlignment(SwingConstants.CENTER);
		BCPcacketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		BCPcacketext.setColumns(10);
		BCPcacketext.setBounds(166, 59, 87, 23);
		panel_2.add(BCPcacketext);
		
		BFCcaketext = new JTextField();
		BFCcaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BFCcaketext.setText(null);
			}
			
		});
		BFCcaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		BFCcaketext.setText("0");
		BFCcaketext.setHorizontalAlignment(SwingConstants.CENTER);
		BFCcaketext.setColumns(10);
		BFCcaketext.setBounds(166, 85, 87, 23);
		panel_2.add(BFCcaketext);
		
		JCheckBox chckbxLagosChocolateCake = new JCheckBox("Lagos Chocolate Cake");
		chckbxLagosChocolateCake.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double LagosChocolateCake=Double.parseDouble(LCCcacketext.getText());
				double cLagosChocolateCake=Double.parseDouble(jlblCostcake.getText());
				double iLagosChocolateCake=2.19 ;
						if(chckbxLagosChocolateCake.isSelected()  ) {
							i[9]=(LagosChocolateCake *iLagosChocolateCake) +cLagosChocolateCake;
							String pLagosChockolate=String.format("%.2f",i[9]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(pLagosChockolate);
						}	
			}
		});
		chckbxLagosChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxLagosChocolateCake.setBounds(6, 123, 144, 23);
		panel_2.add(chckbxLagosChocolateCake);
		
		JCheckBox chckbxKilburnChocolateCake = new JCheckBox("Kilburn Chocolate Cake");
		chckbxKilburnChocolateCake.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					double KilburnChocolateCake=Double.parseDouble(KCCcaketext.getText());
					double cKilburnChocolateCake=Double.parseDouble(jlblCostcake.getText());
					double iKilburnChocolateCake=2.40 ;
							if(chckbxKilburnChocolateCake.isSelected()  ) {
								i[10]=(KilburnChocolateCake *iKilburnChocolateCake) +cKilburnChocolateCake;
								String pKillchocolate=String.format("%.2f",i[10]);
								//textlattel.setText(pDrink);
								jlblCostcake.setText(pKillchocolate);
							}	
			}
		});
		chckbxKilburnChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxKilburnChocolateCake.setBounds(6, 157, 144, 23);
		panel_2.add(chckbxKilburnChocolateCake);
		
		JCheckBox chckbxQueensParkChocolate = new JCheckBox("Queen's Park Chocolate Cake");
		chckbxQueensParkChocolate.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double QueenparkChocolateCake=Double.parseDouble(QPCcaketext.getText());
				double cQueenparkChocolateCake=Double.parseDouble(jlblCostcake.getText());
				double iQueenparkChocolateCake=2.09 ;
						if(chckbxQueensParkChocolate.isSelected()  ) {
							i[12]=(QueenparkChocolateCake *iQueenparkChocolateCake) +cQueenparkChocolateCake;
							String pqueens=String.format("%.2f",i[12]);
							//textlattel.setText(pDrink);
							jlblCostcake.setText(pqueens);
						}	
			}
		});
		chckbxQueensParkChocolate.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxQueensParkChocolate.setBounds(6, 228, 144, 23);
		panel_2.add(chckbxQueensParkChocolate);
		
		LCCcacketext = new JTextField();
		LCCcacketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LCCcacketext.setText(null);
			}
		});
		LCCcacketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		LCCcacketext.setText("0");
		LCCcacketext.setHorizontalAlignment(SwingConstants.CENTER);
		LCCcacketext.setColumns(10);
		LCCcacketext.setBounds(165, 123, 87, 23);
		panel_2.add(LCCcacketext);
		
		KCCcaketext = new JTextField();
		KCCcaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KCCcaketext.setText(null);
			}
		});
		KCCcaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		KCCcaketext.setText("0");
		KCCcaketext.setHorizontalAlignment(SwingConstants.CENTER);
		KCCcaketext.setColumns(10);
		KCCcaketext.setBounds(165, 157, 87, 23);
		panel_2.add(KCCcaketext);
		
		KHCcaketext = new JTextField();
		KHCcaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KHCcaketext.setText(null);
			}
		});
		KHCcaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		KHCcaketext.setText("0");
		KHCcaketext.setHorizontalAlignment(SwingConstants.CENTER);
		KHCcaketext.setColumns(10);
		KHCcaketext.setBounds(165, 191, 87, 23);
		panel_2.add(KHCcaketext);
		
		QPCcaketext = new JTextField();
		QPCcaketext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				QPCcaketext.setText(null);
			}
		});
		QPCcaketext.setFont(new Font("Tahoma", Font.BOLD, 12));
		QPCcaketext.setText("0");
		QPCcaketext.setHorizontalAlignment(SwingConstants.CENTER);
		QPCcaketext.setColumns(10);
		QPCcaketext.setBounds(165, 228, 87, 23);
		panel_2.add(QPCcaketext);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(551, 54, 407, 370);
		panel_3.setLayout(null);
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 385, 348);
		panel_3.add(scrollPane);
		
		JTextArea jstext = new JTextArea();
		jstext.setEditable(false);
		scrollPane.setViewportView(jstext);
		jstext.setFont(new Font("Monospaced", Font.ITALIC, 11));
	
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 367, 252, 157);
		panel_4.setLayout(null);
		panel_4.setForeground(Color.BLACK);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_4);
		
		JLabel jlblCostDrinks = new JLabel("Cost of Drinks");
		jlblCostDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblCostDrinks.setBounds(10, 24, 106, 14);
		panel_4.add(jlblCostDrinks);
		
		JLabel lblNewLabel_2 = new JLabel("Cost of Cake");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 67, 106, 14);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Service Charge");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 110, 106, 14);
		panel_4.add(lblNewLabel_3);
		
		jlblCostdrink = new JTextField();
		jlblCostdrink.setEditable(false);
		jlblCostdrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblCostdrink.setSelectedTextColor(Color.LIGHT_GRAY);
		jlblCostdrink.setText("0");
		jlblCostdrink.setBackground(Color.LIGHT_GRAY);
		jlblCostdrink.setHorizontalAlignment(SwingConstants.CENTER);
		jlblCostdrink.setBounds(156, 22, 86, 20);
		panel_4.add(jlblCostdrink);
		jlblCostdrink.setColumns(10);
		
		jlblCostcake = new JTextField();
		jlblCostcake.setEditable(false);
		jlblCostcake.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblCostcake.setSelectedTextColor(Color.LIGHT_GRAY);
		jlblCostcake.setText("0");
		jlblCostcake.setBackground(Color.LIGHT_GRAY);
		jlblCostcake.setHorizontalAlignment(SwingConstants.CENTER);
		jlblCostcake.setColumns(10);
		jlblCostcake.setBounds(156, 65, 86, 20);
		panel_4.add(jlblCostcake);
		
		jlblService = new JTextField();
		jlblService.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblService.setSelectionColor(Color.BLACK);
		jlblService.setText("1.50");
		jlblService.setBackground(Color.LIGHT_GRAY);
		jlblService.setHorizontalAlignment(SwingConstants.CENTER);
		jlblService.setColumns(10);
		jlblService.setBounds(156, 108, 86, 20);
		panel_4.add(jlblService);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(551, 435, 407, 89);
		panel_5.setLayout(null);
		panel_5.setForeground(Color.BLACK);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_5);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink[0]= Double.parseDouble(jlblCostdrink.getText());
				drink[1]= Double.parseDouble(jlblCostcake.getText());
				drink[2]= Double.parseDouble(jlblService.getText());
				
				double cTotal=(drink[0]+drink[1]+drink[2]);
				String iTaxTotal= String.format("£ %.2f",cTotal/100);
				jlblTax.setText(iTaxTotal);
				
				double subTotal=(cTotal);
				String isubTotal= String.format("£ %.2f",subTotal);
				jlblsubTotal.setText(isubTotal);
				
				double allTotal=(cTotal);
				String iTotal= String.format("£ %.2f",allTotal+(allTotal/100));
				jlbltotal.setText(iTotal);
				
				String CostD= String.format("£ %.2f",drink[0]);
				jlblCostdrink.setText(CostD);
				
				String CostC= String.format("£ %.2f",drink[1]);
				jlblCostcake.setText(CostC);
				
				String ServiceC= String.format("£ %.2f",drink[2]);
				jlblService.setText(ServiceC);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 29, 89, 23);
		panel_5.add(btnNewButton);
		
		
		
		
		JButton btnNewButton_1 = new JButton("Reciept");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				drink[0]= Double.parseDouble(textlattel.getText());
				drink[1]= Double.parseDouble(textIL.getText());
				drink[2]= Double.parseDouble(textEXP.getText());
				drink[3]= Double.parseDouble(textCap.getText());
				drink[4]= Double.parseDouble(textIC.getText());
				
				cake[0]= Double.parseDouble(coffeecaketext.getText());
				cake[1]= Double.parseDouble(rvcaketext.getText());
				cake[2]= Double.parseDouble(BCPcacketext.getText());
				cake[3]= Double.parseDouble(BFCcaketext.getText());
				cake[4]= Double.parseDouble(LCCcacketext.getText());
				cake[5]= Double.parseDouble(KCCcaketext.getText());
				cake[6]= Double.parseDouble(KHCcaketext.getText());
				cake[7]= Double.parseDouble(QPCcaketext.getText());
				
				cost[0] =(jlblTax.getText());
				cost[1] =(jlblsubTotal.getText());
				cost[2] =(jlbltotal.getText());
				
				
				
				
				 int refs =1325+(int)(Math.random()*4238);
			
				
				  Calendar timer= Calendar.getInstance();
				  timer.getTime();
				  SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
				  tTime.format(timer.getTime());
				  
				  SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
				  tDate.format(timer.getTime());
				  
				jstext.append("\t\t Cafe Management Systems:\n"+
				"Refference:\t\t\t"+refs+
				"\n========================================"+
				"\t\nLattle:\t\t\t\t" + drink[0]+
				"\t\nIced Lattle:\t\t\t" + drink[1] +
				"\t\nExpreso:\t\t\t" + drink[2]+
				"\t\nCappuccino:\t\t\t" + drink[3]+
				"\t\nIced Cappuccino:\t\t" + drink[4]+
				"\n=========================================\t\t"+
				"\nCoffee:\t\t\t\t"+cake[0]+
				"\nRed Velevet Cake:\t\t"+cake[1]+
				"\nBoston Cream Cake:\t\t"+cake[2]+
				"\nBlack Forest Cake:\t\t"+cake[3]+
				"\nLaggos Chocolate Cake:\t\t"+cake[4]+
				"\nKilburn Chocolate Cake:\t\t"+cake[5]+
				"\nCarlton Hill Chocolate Cake:\t"+cake[6]+
				"\nQueen's Park Chocolate Cake:\t"+cake[7]+
				"\n=========================================\t\t"+
				"\nTax:\t\t\t\t" +cost[0]+
				"\nSub Total:\t\t\t" +cost[1]+
				"\nTotal:\t\t\t\t"+cost[2]+
				"\n=========================================\t\t"+
								
				"\n\nDate: " +tDate.format(timer.getTime())+
				"\t\tTime: "+tTime.format(timer.getTime())+
				"\n ****************Thank you ********************");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(107, 29, 89, 23);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblCostcake.setText("0");
				jlblCostdrink.setText("0");
				//jlblService.setText("0");
				jlblTax.setText("0");
				jlblsubTotal.setText("0");
				jlbltotal.setText("0");
				textlattel.setText("0");
				textIL.setText("0");
				textEXP.setText("0");
				textCap.setText("0");
				textIC.setText("0");
				coffeecaketext.setText("0");
				rvcaketext.setText("0");
				BCPcacketext.setText("0");
				BFCcaketext.setText("0");
				LCCcacketext.setText("0");
				KCCcaketext.setText("0");
				KHCcaketext.setText("0");
				QPCcaketext.setText("0");
				
				jstext.setText(null);
				CappuccinoCheck.setSelected(false);
				Excheckbox.setSelected(false);
				ICCheckbox.setSelected(false);
				ILcheckbox.setSelected(false);
				lattlecheckbox.setSelected(false);
				chckbxCoffeeCake.setSelected(false);
				chckbxBlackForestCake.setSelected(false);
				chckbxBostonCreamPie.setSelected(false);
				chckbxKarltonHillChocolate.setSelected(false);
				chckbxLagosChocolateCake.setSelected(false);
				chckbxRedVelevetCake.setSelected(false);
				chckbxQueensParkChocolate.setSelected(false);
				chckbxKilburnChocolateCake.setSelected(false);
				
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(204, 29, 89, 23);
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(303, 29, 89, 23);
		panel_5.add(btnNewButton_3);
		
		JButton pdfbuttn = new JButton("Print");
		pdfbuttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="";
				JFileChooser j=new JFileChooser();
				j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int x =j.showSaveDialog(null);
				 path = j.getSelectedFile().getPath();
				Document document=new Document();
				try {
			PdfWriter wr=PdfWriter.getInstance(document, new FileOutputStream(path + "bill.pdf"));
			document.open();
			//document.add(Image.getInstance(".//res//logo.jpg"));
			document.add(new Paragraph(jstext.getText()));
			
			document.close();
			wr.close();
			}
			catch(DocumentException de) {
				de.printStackTrace();
			}	
				catch(FileNotFoundException pe) {
					pe.printStackTrace();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		pdfbuttn.setFont(new Font("Tahoma", Font.BOLD, 12));
		pdfbuttn.setBounds(138, 63, 89, 23);
		panel_5.add(pdfbuttn);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(279, 367, 262, 157);
		panel_6.setLayout(null);
		panel_6.setForeground(Color.BLACK);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_6);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTax.setBounds(10, 31, 58, 14);
		panel_6.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubTotal.setBounds(10, 71, 66, 14);
		panel_6.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(10, 108, 58, 14);
		panel_6.add(lblTotal);
		
		jlblTax = new JTextField();
		jlblTax.setEditable(false);
		jlblTax.setSelectionColor(Color.DARK_GRAY);
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblTax.setForeground(Color.BLACK);
		jlblTax.setText("0");
		jlblTax.setBackground(Color.LIGHT_GRAY);
		jlblTax.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTax.setColumns(10);
		jlblTax.setBounds(128, 25, 86, 20);
		panel_6.add(jlblTax);
		
		jlblsubTotal = new JTextField();
		jlblsubTotal.setEditable(false);
		jlblsubTotal.setSelectionColor(Color.DARK_GRAY);
		jlblsubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlblsubTotal.setText("0");
		jlblsubTotal.setBackground(Color.LIGHT_GRAY);
		jlblsubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		jlblsubTotal.setColumns(10);
		jlblsubTotal.setBounds(128, 69, 86, 20);
		panel_6.add(jlblsubTotal);
		
		jlbltotal = new JTextField();
		jlbltotal.setEditable(false);
		jlbltotal.setSelectionColor(Color.DARK_GRAY);
		jlbltotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlbltotal.setText("0");
		jlbltotal.setBackground(Color.LIGHT_GRAY);
		jlbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		jlbltotal.setColumns(10);
		jlbltotal.setBounds(128, 106, 86, 20);
		panel_6.add(jlbltotal);
	}
}
