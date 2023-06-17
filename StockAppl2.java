import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Nextpage implements ActionListener {
    JFrame f2 = new JFrame();
    Nextpage() {
        f2 = new JFrame("STOCK DETAILS");
        String data[][] = {
            {"222","ENGINE","16000","34"},
            {"224","CLUTCH","1800","23"},
            {"226","HEADLIGHT","800","76"},
            {"228","BRAKE","1300","56"},
            {"230","TYRE","2560","87"},
            {"232","AXLE","500","21"},
            {"234","RADIATOR","9300","43"},
            {"236","BATTERY","3500","12"}
        };
        String column[] = {
            "ID",
            "STOCKS",
            "PRICE",
            "QUANTITY"
        };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f2.add(sp);
        f2.setSize(300, 400);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
class ProductIdvalidation{
long arr[];
public int checkid(long num){
int flag=0;
int[] arr={222,224,226,228,230,232,234,236};
for(long x: arr ){
if(x==num){
	flag=1;
	break;
}
else{
flag= 0;
}
}
return flag;
}
}
class ProductIdCheck implements ActionListener {
    JFrame f3 = new JFrame("Product ID validation");
    ProductIdvalidation pv=new ProductIdvalidation();
    String s1;
    long productid;
    JTextField t = new JTextField();

    ProductIdCheck() {
        JLabel l2 = new JLabel("Enter the Product ID:");
		l2.setFont(new Font("SansSerif",Font.PLAIN,18));
        JButton jb = new JButton("OK");
        t.setBounds(300,100,180,30);
        l2.setBounds(100, 100, 170, 30);
        jb.setBounds(480, 100, 120, 30);
        f3.add(l2);
        f3.add(t);
        f3.add(jb);
        f3.setLayout(null);
        f3.setSize(600,300);
        jb.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
s1=t.getText();
productid = Long.parseLong(s1);
if (pv.checkid(productid) == 1)
           JOptionPane.showMessageDialog(f3, "THE PRODUCT ID IS VALID");
       else
           JOptionPane.showMessageDialog(f3, "THE PRODUCT ID IS INVALID");
   }

}
class UpdateStocks implements ActionListener {
    JTextField tf1, tf2, tf3, tf4,tf5,tf6,tf7,tf8;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6, l7,l8,l9;
    JFrame f4 = new JFrame();
    UpdateStocks() {
		f4.setTitle("UPDATE STOCKS");
        l1 = new JLabel("ENGINE:");
        l1.setFont(new Font("SansSerif",Font.PLAIN,14));
        l1.setBounds(150, 75, 170, 30);
        tf1 = new JTextField();
        tf1.setBounds(300, 75, 170, 30);
        l2 = new JLabel("CLUTCH:");
        l2.setFont(new Font("SansSerif",Font.PLAIN,14));
        l2.setBounds(150, 125, 170, 30);
        tf2 = new JTextField();
        tf2.setBounds(300, 125, 170, 30);
        l3 = new JLabel("HEADLIGHT:");
        l3.setFont(new Font("SansSerif",Font.PLAIN,14));
        l3.setBounds(150, 175, 170, 30);
        tf3 = new JTextField();
        tf3.setBounds(300, 175, 170, 30);
        l4 = new JLabel("BRAKE:");
        l4.setFont(new Font("SansSerif",Font.PLAIN,14));
        l4.setBounds(150, 225, 170, 30);
        tf4 = new JTextField();
        tf4.setBounds(300, 225, 170, 30);
        l5 = new JLabel("TYRE:");
        l5.setFont(new Font("SansSerif",Font.PLAIN,14));
        l5.setBounds(150, 275, 170, 30);
        tf5 = new JTextField();
        tf5.setBounds(300, 275, 170, 30);
        l6 = new JLabel("AXLE:");
        l6.setFont(new Font("SansSerif",Font.PLAIN,14));
        l6.setBounds(150, 325, 170, 30);
        tf6 = new JTextField();
        tf6.setBounds(300, 325, 170, 30);
        l7 = new JLabel("RADIATOR:");
        l7.setFont(new Font("SansSerif",Font.PLAIN,14));
        l7.setBounds(150, 375, 170, 30);
tf7 = new JTextField();
        tf7.setBounds(300, 375, 170, 30);
        l8 = new JLabel("BATTERY:");
        l8.setFont(new Font("SansSerif",Font.PLAIN,14));
        l8.setBounds(150, 425, 170, 30);
tf8 = new JTextField();
tf8.setBounds(300, 425, 170, 30);
        l9 = new JLabel("Update The Quantity Of Each Stocks");
        l9.setFont(new Font("SansSerif",Font.PLAIN,18));
        l9.setForeground(Color.red);
        l9.setBounds(175, 25, 330, 30);
        b1 = new JButton("Submit");
        b1.setBounds(150, 500, 90, 40);
        b1.addActionListener(this);
        b2 = new JButton("Reset");
        b2.setBounds(350, 500, 90, 40);
        b2.addActionListener(this);
        f4.add(l1);
        f4.add(tf1);
        f4.add(l2);
        f4.add(tf2);
        f4.add(l3);
        f4.add(tf3);
        f4.add(l4);
        f4.add(tf4);
        f4.add(l5);
        f4.add(tf5);
        f4.add(l6);
        f4.add(tf6);
        f4.add(l7);
        f4.add(tf7);
        f4.add(l8);
        f4.add(tf8);
        f4.add(l9);
        f4.add(b1);
        f4.add(b2);
        f4.setSize(800, 800);
        f4.setLayout(null);

    }


    public void actionPerformed(ActionEvent e) {
        String str= e.getActionCommand();
        if(str=="Submit"){
            String s1=tf1.getText();String s2=tf2.getText();String s3=tf3.getText();String s4=tf4.getText();
            String s5=tf5.getText();String s6=tf6.getText();String s7=tf7.getText();String s8=tf8.getText();
            try{
                Stocks st= new Stocks(s1,s2,s3,s4,s5,s6,s7,s8);
                FileOutputStream fos = new FileOutputStream("stockdetails.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(st);
                oos.flush();
                oos.close();
            }
            catch(IOException e1) {
                System.out.println("Exception during serialization: " + e1);
                System.exit(0);
            }
            try {
                Stocks st1;
                FileInputStream fis = new FileInputStream("stockdetails.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                st1 = (Stocks)ois.readObject();
                System.out.println(st1);
                ois.close();
            }
            catch(Exception e2) {
                System.out.println("Exception during deserialization: " + e2);
                System.exit(0);
            }
            tf1.setText(null);
            tf2.setText(null);
            tf3.setText(null);
            tf4.setText(null);
            tf5.setText(null);
            tf6.setText(null);
            tf7.setText(null);
            tf8.setText(null);

        }
        else {
             tf1.setText(null);
             tf2.setText(null);
             tf3.setText(null);
             tf4.setText(null);
             tf5.setText(null);
             tf6.setText(null);
             tf7.setText(null);
             tf8.setText(null);
        }
    }}
    class Stocks implements Serializable{
   String engine;
   String clutch;
   String headlight;
   String brake;
   String tyre;
   String axle;
   String radiator;
   String battery;
   Stocks(String engine,String clutch,String headlight,String brake,String tyre,String axle,String radiator,String battery){
      this.engine=engine;
  this.clutch=clutch;
  this.headlight=headlight;
  this.brake=brake;
  this.tyre=tyre;
  this.axle=axle;
  this.radiator=radiator;
      this.battery=battery;
   }
   public String toString(){
       return "The updated stocks are :\n ENGINE : " + engine +"\nCLUTCH: " + clutch +"\nHEADLIGHT: " + headlight +
               "\nBRAKE: " +brake+"\nTYRE : "+tyre+
               "\nAXLE: "+ axle + "\nRADIATOR: "+radiator+"\nBATTERY: "+battery;
   }
}
class Ordering  implements ActionListener {

	JFrame f5=new JFrame();
	private JLabel title;
	private JLabel name;
	private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
	private JLabel pro;
	private JTextField tpro;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JTextArea tadd;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

private String dates[]= { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31" };

private String months[]= { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sep", "Oct", "Nov", "Dec" };

private String years[]
		= { "2005", "2006","2007", "2008", "2009", "2010","2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018","2019","2020","2021","2022" };
	public Ordering()
	{
        f5.setTitle("Stock Ordering Form");
		f5.setBounds(300, 90, 900, 600);
		f5.setResizable(false);
		f5.setLayout(null);
		title = new JLabel("Stock Order");
		title.setFont(new Font("Arial", Font.PLAIN, 32));
        	title.setForeground(Color.black);
		title.setSize(400, 30);
		title.setLocation(300, 30);
		f5.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		f5.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(250, 20);
		tname.setLocation(200, 100);
		f5.add(tname);

		pro = new JLabel("Product");
		pro.setFont(new Font("Arial", Font.PLAIN, 20));
		pro.setSize(100, 20);
		pro.setLocation(100, 210);
		f5.add(pro);

        mno=new JLabel("Mobile");
        mno.setFont(new Font("Arial",Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 125);
        f5.add(mno);

        tmno=new JTextField();
        tmno.setFont(new Font("Arial",Font.PLAIN,15));
        tmno.setSize(250,20);
        tmno.setLocation(200,125);
        f5.add(tmno);

		tpro = new JTextField();
		tpro.setFont(new Font("Arial", Font.PLAIN, 15));
		tpro.setSize(250, 100);
		tpro.setLocation(200, 210);
		f5.add(tpro);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 150);
		f5.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 150);
		f5.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(285, 150);
		f5.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("Bill Date");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 180);
		f5.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 180);
		f5.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 180);
		f5.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(310, 180);
		f5.add(year);

		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 320);
		f5.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(250, 75);
		tadd.setLocation(200, 320);
		tadd.setLineWrap(true);
		f5.add(tadd);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		f5.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		f5.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		f5.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		f5.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		f5.add(resadd);

		f5.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
				String data1;
				String data= "Name : "+ tname.getText() + "\n"+ "Mobile : "+ tmno.getText() + "\n"+"Product : "+tpro.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male"+ "\n";
				else
					data1 = "Gender : Female"+ "\n";
				String data2= "Date of Billing : "+ (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+ "/" + (String)year.getSelectedItem()+ "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Ordered Successfully..");
			}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tpro.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}
class StockAppl2 implements ActionListener {
    ProductIdCheck PID = new ProductIdCheck();
    Nextpage n = new Nextpage();
    JFrame f = new JFrame("First Page");
    UpdateStocks us=new UpdateStocks();
    Ordering o = new Ordering();
    JRadioButton rb1, rb2, rb3,rb4;
    JButton b;
    StockAppl2() {
        JLabel l = new JLabel("STOCK MANAGEMENT SYSTEM");
        l.setFont(new Font("SansSerif",Font.BOLD,23));
        l.setBounds(80, 25, 450, 80);
        l.setForeground(Color.blue);
        rb1 = new JRadioButton("Stock Details");
        rb1.setBounds(50, 95, 180, 30);
        rb1.setFont(new Font("SansSerif",Font.PLAIN,18));
        rb2 = new JRadioButton("Product Id validation");
        rb2.setBounds(230, 95, 220, 30);
        rb2.setFont(new Font("SansSerif",Font.PLAIN,18));
        rb3 = new JRadioButton("Update Stocks");
        rb3.setBounds(230, 130, 180,30);
        rb3.setFont(new Font("SansSerif",Font.PLAIN,18));
        rb4 = new JRadioButton("Order");
		rb4.setBounds(50, 130, 180,30);
        rb4.setFont(new Font("SansSerif",Font.PLAIN,18));
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        b = new JButton("OK");
        b.setBounds(180, 180, 80, 30);
        b.addActionListener(this);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(b);
        f.add(l);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
           n.f2.setVisible(true);
        }
        if (rb2.isSelected()) {
            PID.f3.setVisible(true);
        }
        if (rb3.isSelected()) {
             us.f4.setVisible(true);
}
 if (rb4.isSelected()) {
             o.f5.setVisible(true);
}
    }
    public static void main(String args[]) throws Exception {
        new StockAppl2();
        File f1=new File("Details.txt");
    }
}