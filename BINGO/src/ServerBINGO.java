import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ServerBINGO {

	static ServerSocket ss;
    static Socket s;
    DataInputStream input;
    DataOutputStream output;
	String dataTranfer;
    
	private JFrame frame;
	public static JButton def= new JButton("D");;
	private JTextField textField;
	static int sum=0;
	static boolean flag=false;
	public static JButton b1=new JButton(""),b2=new JButton(""),b3=new JButton(""),b4=new JButton(""),
			b5=new JButton(""),b6=new JButton(""),b7=new JButton(""),b8=new JButton(""),b9=new JButton(""),
			b10=new JButton(""),b11=new JButton(""),b12=new JButton(""),b13=new JButton(""),b14=new JButton(""),
			b15=new JButton(""),b16=new JButton(""),b17=new JButton(""),b18=new JButton(""),b19=new JButton(""),
			b20=new JButton(""),b21=new JButton(""),b22=new JButton(""),b23=new JButton(""),b24=new JButton(""),
			b25=new JButton("");
	public static JLabel l1= new JLabel(""),l2= new JLabel(""),l3= new JLabel(""),
			l4= new JLabel(""),l5= new JLabel("");
    static int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,
    val18,val19,val20,val21,val22,val23,val24,val25;
    static int []visited = new int[26];
    private final JLabel lblServer = new JLabel("Server");
    private static final JLabel Final = new JLabel("Server Won");

	/**
	 * Launch the application.
	 * @throws IOException 
	*/
    
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerBINGO window = new ServerBINGO();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		 serverConnection();  
	}
	
	 
    public static void serverConnection() throws IOException {
		ss = new ServerSocket(9990);
		s = ss.accept();
		 while (true) {
			try {
				
				DataInputStream input = new DataInputStream(s.getInputStream());
				String string = input.readUTF();
				int data=Integer.parseInt(string);
				//visited[data]=1;
				checkVisited(data);
				getLine(visited,l1,l2,l3,l4,l5);
				System.out.println(data);
			    
			} catch (Exception ev) {  
				try {
					Thread.sleep(2000);
					System.exit(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	 }
		
	}
    

	/**
	 * Create the application.
	 */
	public ServerBINGO() {
		initialize();
	}

	public static void checkVisited(int data) {
		if(data==Integer.parseInt(b1.getText())) {b1.setBackground(Color.red);visited[1]=1;}	if(data==Integer.parseInt(b2.getText())) {b2.setBackground(Color.red); visited[2]=1;} if(data==Integer.parseInt(b3.getText())) {b3.setBackground(Color.red); visited[3]=1;}
		if(data==Integer.parseInt(b4.getText())) {b4.setBackground(Color.red);visited[4]=1;} if(data==Integer.parseInt(b5.getText())) {b5.setBackground(Color.red); visited[5]=1;} if(data==Integer.parseInt(b6.getText())) {b6.setBackground(Color.red); visited[6]=1;}
		if(data==Integer.parseInt(b7.getText())) {b7.setBackground(Color.red);visited[7]=1;} if(data==Integer.parseInt(b8.getText())) {b8.setBackground(Color.red);visited[8]=1;} if(data==Integer.parseInt(b9.getText())) {b9.setBackground(Color.red);visited[9]=1;}
		if(data==Integer.parseInt(b10.getText())) {b10.setBackground(Color.red);visited[10]=1;} if(data==Integer.parseInt(b11.getText())) {b11.setBackground(Color.red);visited[11]=1;} if(data==Integer.parseInt(b12.getText())) {b12.setBackground(Color.red);visited[12]=1;}
		if(data==Integer.parseInt(b13.getText())) {b13.setBackground(Color.red);visited[13]=1;} if(data==Integer.parseInt(b14.getText())) {b14.setBackground(Color.red);visited[14]=1;} if(data==Integer.parseInt(b15.getText())) {b15.setBackground(Color.red);visited[15]=1;}
		if(data==Integer.parseInt(b16.getText())) {b16.setBackground(Color.red);visited[16]=1;} if(data==Integer.parseInt(b17.getText())) {b17.setBackground(Color.red);visited[17]=1;} if(data==Integer.parseInt(b18.getText())) {b18.setBackground(Color.red);visited[18]=1;}
		if(data==Integer.parseInt(b19.getText())) {b19.setBackground(Color.red);visited[19]=1;} if(data==Integer.parseInt(b20.getText())) {b20.setBackground(Color.red);visited[20]=1;} if(data==Integer.parseInt(b21.getText())) {b21.setBackground(Color.red);visited[21]=1;}
		if(data==Integer.parseInt(b22.getText())) {b22.setBackground(Color.red);visited[22]=1;} if(data==Integer.parseInt(b23.getText())) {b23.setBackground(Color.red);visited[23]=1;} if(data==Integer.parseInt(b24.getText())) {b24.setBackground(Color.red);visited[24]=1;}
		if(data==Integer.parseInt(b25.getText())) {b25.setBackground(Color.red);visited[25]=1;}
	}
	
	public static void getLine(int []visited,JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5) {
		int total=0;
		if(visited[1]==1&&visited[6]==1&&visited[11]==1&&visited[16]==1&&visited[21]==1)
		{  total+=1;  }
		if(visited[2]==1&&visited[7]==1&&visited[12]==1&&visited[17]==1&&visited[22]==1)
		{	  total+=1; }
		if(visited[3]==1&&visited[8]==1&&visited[13]==1&&visited[18]==1&&visited[23]==1)
		{	  total+=1; }
		if(visited[4]==1&&visited[9]==1&&visited[14]==1&&visited[19]==1&&visited[24]==1)
		{	  total+=1;}
		if(visited[5]==1&&visited[10]==1&&visited[15]==1&&visited[20]==1&&visited[25]==1)
		{	  total+=1;}
		if(visited[1]==1&&visited[2]==1&&visited[3]==1&&visited[4]==1&&visited[5]==1)
		{	  total+=1;}
		if(visited[6]==1&&visited[7]==1&&visited[8]==1&&visited[9]==1&&visited[10]==1)
		{	  total+=1;}
		if(visited[11]==1&&visited[12]==1&&visited[13]==1&&visited[14]==1&&visited[15]==1)
		{	  total+=1;}
		if(visited[16]==1&&visited[17]==1&&visited[18]==1&&visited[19]==1&&visited[20]==1)
		{	  total+=1;}
		if(visited[21]==1&&visited[22]==1&&visited[23]==1&&visited[24]==1&&visited[25]==1)
		{	  total+=1;}
		if(visited[1]==1&&visited[7]==1&&visited[13]==1&&visited[19]==1&&visited[25]==1)
		{	  total+=1; }
		if(visited[5]==1&&visited[9]==1&&visited[13]==1&&visited[17]==1&&visited[21]==1)
		{	  total+=1;  }
		System.out.println(total);
		if(total==1)
		{  l1.setText("B"); }
		if(total==2)
		{  l1.setText("B");l2.setText("I");	}
		if(total==3)
		{  l1.setText("B");l2.setText("I");l3.setText("N");}
		if(total==4)
		{  l1.setText("B");l2.setText("I");l3.setText("N");l4.setText("G"); }
		if(total==5)
		{  l1.setText("B");l2.setText("I");l3.setText("N");l4.setText("G");l5.setText("O"); }
		if(total>=5) {
			Final.setVisible(true);
		}
	}
	
	public void sendData(String dataTranfer) {
		  if (dataTranfer.equals("")) {
              JOptionPane.showMessageDialog(null, "Please write some text !");
        }
       else {
		try {
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			output.writeUTF(dataTranfer);
		} catch (IOException e1) {

			try {
				Thread.sleep(2000);
				System.exit(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
       }
}
	
	private void initialize() {

		Arrays.fill(visited,0);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 127));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.setBounds(100, 100, 554, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel bingo = new JLabel("BINGO GAME");
		bingo.setForeground(new Color(128, 0, 0));
		bingo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		bingo.setBounds(209, 16, 350, 27);
		frame.getContentPane().add(bingo);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField.setBounds(244, 72, 69, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		l1.setBounds(26, 128, 56, 67);
		frame.getContentPane().add(l1);
		
		
		l2.setForeground(Color.BLUE);
		l2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		l2.setBounds(26, 195, 56, 67);
		frame.getContentPane().add(l2);
		
		
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		l3.setBounds(26, 262, 56, 67);
		frame.getContentPane().add(l3);
		
		
		l4.setForeground(Color.BLUE);
		l4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		l4.setBounds(26, 330, 56, 67);
		frame.getContentPane().add(l4);
		

		l5.setForeground(Color.BLUE);
		l5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		l5.setBounds(26, 398, 56, 67);
		frame.getContentPane().add(l5);
		
		b1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val1=Integer.parseInt(textField.getText());
				     b1.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[1]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b1.getText();
					  sendData(dataTranfer);
					  b1.setBackground(Color.red);
				  }
			}
		});
		b1.setBackground(new Color(153, 255, 204));
		b1.setBounds(82, 128, 75, 67);
		frame.getContentPane().add(b1);
		
	
		b2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val2=Integer.parseInt(textField.getText());
				     b2.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[2]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b2.getText();
					  sendData(dataTranfer);
					  b2.setBackground(Color.red);
				  }
			}
		});
		b2.setBackground(new Color(153, 255, 204));
		b2.setBounds(156, 128, 75, 67);
		frame.getContentPane().add(b2);
		
		
		b3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val3=Integer.parseInt(textField.getText());
				     b3.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[3]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b3.getText();
					  sendData(dataTranfer);
					  b3.setBackground(Color.red);
				  }
			}
		});
		b3.setBackground(new Color(153, 255, 204));
		b3.setBounds(231, 128, 75, 67);
		frame.getContentPane().add(b3);
		
		
		b4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val4=Integer.parseInt(textField.getText());
				     b4.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[4]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b4.getText();
					  sendData(dataTranfer);
					  b4.setBackground(Color.red);
				  }
			}
		});
		b4.setBackground(new Color(153, 255, 204));
		b4.setBounds(306, 128, 75, 67);
		frame.getContentPane().add(b4);
		
		
		b5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val5=Integer.parseInt(textField.getText());
				     b5.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[5]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b5.getText();
					  sendData(dataTranfer);
					  b5.setBackground(Color.red);
				  }
			}
		});
		b5.setBackground(new Color(153, 255, 204));
		b5.setBounds(381, 128, 75, 67);
		frame.getContentPane().add(b5);
		
		
		b6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val6=Integer.parseInt(textField.getText());
				     b6.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[6]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b6.getText();
					  sendData(dataTranfer);
					  b6.setBackground(Color.red);
				  }
			}
		});
		b6.setBackground(new Color(153, 255, 204));
		b6.setBounds(82, 195, 75, 67);
		frame.getContentPane().add(b6);
		
	
		b7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val7=Integer.parseInt(textField.getText());
				      b7.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[7]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b7.getText();
					  sendData(dataTranfer);
					  b7.setBackground(Color.red);
				  }
			}
		});
		b7.setBackground(new Color(153, 255, 204));
		b7.setBounds(156, 195, 75, 67);
		frame.getContentPane().add(b7);
		
		
		b8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val8=Integer.parseInt(textField.getText());
				     b8.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[8]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b8.getText();
					  sendData(dataTranfer);
					  b8.setBackground(Color.red);
				  }
			}
		});
		b8.setBackground(new Color(153, 255, 204));
		b8.setBounds(231, 195, 75, 67);
		frame.getContentPane().add(b8);
		
		
		b9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val9=Integer.parseInt(textField.getText());
				      b9.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[9]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b9.getText();
					  sendData(dataTranfer);
					  b9.setBackground(Color.red);
				  }
			}
		});
		b9.setBackground(new Color(153, 255, 204));
		b9.setBounds(306, 195, 75, 67);
		frame.getContentPane().add(b9);
		
		
		b10.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val10=Integer.parseInt(textField.getText());
				     b10.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[10]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b10.getText();
					  sendData(dataTranfer);
					  b10.setBackground(Color.red);
				  }
			}
		});
		b10.setBackground(new Color(153, 255, 204));
		b10.setBounds(381, 195, 75, 67);
		frame.getContentPane().add(b10);
		
		
		b11.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val11=Integer.parseInt(textField.getText());
				      b11.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[11]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b11.getText();
					  sendData(dataTranfer);
					  b11.setBackground(Color.red);
				  }
			}
		});
		b11.setBackground(new Color(153, 255, 204));
		b11.setBounds(82, 262, 75, 67);
		frame.getContentPane().add(b11);
		
				
		
		b12.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val12=Integer.parseInt(textField.getText());
				      b12.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[12]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b12.getText();
					  sendData(dataTranfer);
					  b12.setBackground(Color.red);
				  }
			}
		});
		b12.setBackground(new Color(153, 255, 204));
		b12.setBounds(156, 262, 75, 67);
		frame.getContentPane().add(b12);
		
		
		b13.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val13=Integer.parseInt(textField.getText());
				     b13.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[13]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b13.getText();
					  sendData(dataTranfer);
					  b13.setBackground(Color.red);
				  }
			}
		});
		b13.setBackground(new Color(153, 255, 204));
		b13.setBounds(231, 262, 75, 67);
		frame.getContentPane().add(b13);
		
	
		b14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val14=Integer.parseInt(textField.getText());
				     b14.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[14]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b14.getText();
					  sendData(dataTranfer);
					  b14.setBackground(Color.red);
				  }
			}
		});
		b14.setBackground(new Color(153, 255, 204));
		b14.setBounds(306, 262, 75, 67);
		frame.getContentPane().add(b14);
		
		
		b15.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val15=Integer.parseInt(textField.getText());
				     b15.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[15]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b15.getText();
					  sendData(dataTranfer);
					  b15.setBackground(Color.red);
				  }
			}
		});
		b15.setBackground(new Color(153, 255, 204));
		b15.setBounds(381, 262, 75, 67);
		frame.getContentPane().add(b15);
		
	
		b16.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val16=Integer.parseInt(textField.getText());
				     b16.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[16]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b16.getText();
					  sendData(dataTranfer);
					  b16.setBackground(Color.red);
				  }
			}
		});
		b16.setBackground(new Color(153, 255, 204));
		b16.setBounds(82, 329, 75, 67);
		frame.getContentPane().add(b16);
		
		
		b17.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val17=Integer.parseInt(textField.getText());
				     b17.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[17]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b17.getText();
					  sendData(dataTranfer);
					  b17.setBackground(Color.red);
				  }
			}
		});
		b17.setBackground(new Color(153, 255, 204));
		b17.setBounds(156, 329, 75, 67);
		frame.getContentPane().add(b17);
		
		
		b18.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val18=Integer.parseInt(textField.getText());
				     b18.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[18]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b18.getText();
					  sendData(dataTranfer);
					  b18.setBackground(Color.red);
				  }
			}
		});
		b18.setBackground(new Color(153, 255, 204));
		b18.setBounds(231, 329, 75, 67);
		frame.getContentPane().add(b18);
		
		
		b19.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val19=Integer.parseInt(textField.getText());
				     b19.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[19]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b19.getText();
					  sendData(dataTranfer);
					  b19.setBackground(Color.red);
				  }
			}
		});
		b19.setBackground(new Color(153, 255, 204));
		b19.setBounds(306, 329, 75, 67);
		frame.getContentPane().add(b19);
		
		
		b20.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val20=Integer.parseInt(textField.getText());
				      b20.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[20]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b20.getText();
					  sendData(dataTranfer);
					  b20.setBackground(Color.red);
				  }
			}
		});
		b20.setBackground(new Color(153, 255, 204));
		b20.setBounds(381, 329, 75, 67);
		frame.getContentPane().add(b20);
		
		
		b21.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {   val21=Integer.parseInt(textField.getText());
				      b21.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[21]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b21.getText();
					  sendData(dataTranfer);
					  b21.setBackground(Color.red);
				  }
			}
		});
		b21.setBackground(new Color(153, 255, 204));
		b21.setBounds(82, 396, 75, 67);
		frame.getContentPane().add(b21);
		
		
		b22.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val22=Integer.parseInt(textField.getText());
				     b22.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[22]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b22.getText();
					  sendData(dataTranfer);
					  b22.setBackground(Color.red);
				  }
			}
		});
		b22.setBackground(new Color(153, 255, 204));
		b22.setBounds(156, 396, 75, 67);
		frame.getContentPane().add(b22);
		
	
		b23.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {  val23=Integer.parseInt(textField.getText());
				     b23.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[23]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b23.getText();
					  sendData(dataTranfer);
					  b23.setBackground(Color.red);
				  }
			}
		});
		b23.setBackground(new Color(153, 255, 204));
		b23.setBounds(231, 396, 75, 67);
		frame.getContentPane().add(b23);
		
		
		b24.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==false&&!textField.getText().equals(""))
				  {	
				     val24=Integer.parseInt(textField.getText());
				     b24.setText(textField.getText());
				  }
				  else if(flag) {
					  visited[24]=1;
					  getLine(visited,l1,l2,l3,l4,l5);
					  dataTranfer=b24.getText();
					  sendData(dataTranfer);
					  b24.setBackground(Color.red);
				  }
			}
		});
		b24.setBackground(new Color(153, 255, 204));
		b24.setBounds(306, 396, 75, 67);
		frame.getContentPane().add(b24);
		
	
		b25.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  if(flag==false&&!textField.getText().equals(""))
			  {	val25=Integer.parseInt(textField.getText());
				b25.setText(textField.getText());
			  }
			  else if(flag){
				  visited[25]=1;
				  getLine(visited,l1,l2,l3,l4,l5);
				  dataTranfer=b25.getText();
				  sendData(dataTranfer);
				  b25.setBackground(Color.red);
			  }
			}
		});
		b25.setBackground(new Color(153, 255, 204));
		b25.setBounds(381, 396, 75, 67);
		frame.getContentPane().add(b25);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText("");b2.setText("");b3.setText("");b4.setText("");b5.setText("");
				b6.setText("");b7.setText("");b8.setText("");b9.setText("");b10.setText("");
				b11.setText("");b12.setText("");b13.setText("");b14.setText("");b15.setText("");
				b16.setText("");b17.setText("");b18.setText("");b19.setText("");b20.setText("");
				b21.setText("");b22.setText("");b23.setText("");b24.setText("");b25.setText("");
				val1=0;val2=0;val3=0;val4=0;val5=0;val6=0;val7=0;val8=0;val9=0;val10=0;
				val11=0;val12=0;val13=0;val14=0;val15=0;val16=0;val17=0;val18=0;val19=0;val20=0;
				val21=0;val22=0;val23=0;val24=0;val25=0;
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnReset.setBounds(39, 60, 110, 46);
		frame.getContentPane().add(btnReset);
		
		JLabel lblGridValue = new JLabel("Grid Value");
		lblGridValue.setForeground(new Color(102, 0, 204));
		lblGridValue.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblGridValue.setBounds(237, 53, 88, 20);
		frame.getContentPane().add(lblGridValue);
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=val1+val2+val3+val4+val5+val6+val7+val8+val9+val10+val11+val12+val13+val14+val15+val16+val17+
						val18+val19+val20+val21+val22+val23+val24+val25;
			    sum=325;
			    Font font = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
				if(sum==325)
				{	JOptionPane.showMessageDialog(null,"Start Game");
				    btnReset.setVisible(false);
				    textField.setVisible(false);
				    lblGridValue.setVisible(false);
				    play.setVisible(false);
				    def.setVisible(false);
				    bingo.setFont(font);
				    bingo.setSize(200,120);
				    flag=true;
				    
				    b1.setBackground(Color.yellow);b2.setBackground(Color.yellow);b3.setBackground(Color.yellow);
				    b4.setBackground(Color.yellow);b5.setBackground(Color.yellow);b6.setBackground(Color.yellow);
				    b7.setBackground(Color.yellow);b8.setBackground(Color.yellow);b9.setBackground(Color.yellow);
				    b10.setBackground(Color.yellow);b11.setBackground(Color.yellow);b12.setBackground(Color.yellow);
				    b13.setBackground(Color.yellow);b14.setBackground(Color.yellow);b15.setBackground(Color.yellow);
				    b16.setBackground(Color.yellow);b17.setBackground(Color.yellow);b18.setBackground(Color.yellow);
				    b19.setBackground(Color.yellow);b20.setBackground(Color.yellow);b21.setBackground(Color.yellow);
				    b22.setBackground(Color.yellow);b23.setBackground(Color.yellow);b24.setBackground(Color.yellow);
				    b25.setBackground(Color.yellow);
				}
				else {
					JOptionPane.showMessageDialog(null, "Insert Matrix Properly");
				}
			}
		});
		play.setFont(new Font("Times New Roman", Font.BOLD, 25));
		play.setBounds(407, 60, 88, 46);
		frame.getContentPane().add(play);
		lblServer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblServer.setBounds(39, 24, 97, 26);
		
		frame.getContentPane().add(lblServer);
		
		Final.setForeground(new Color(128, 0, 128));
		Final.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		Final.setBounds(234, 475, 135, 24);
		Final.setVisible(false);
		frame.getContentPane().add(Final);
		
		
		def.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText("1");b2.setText("3");b3.setText("13");b4.setText("2");b5.setText("14");
				b6.setText("17");b7.setText("11");b8.setText("18");b9.setText("7");b10.setText("9");
				b11.setText("6");b12.setText("5");b13.setText("22");b14.setText("19");b15.setText("25");
				b16.setText("16");b17.setText("8");b18.setText("12");b19.setText("23");b20.setText("10");
				b21.setText("15");b22.setText("4");b23.setText("21");b24.setText("20");b25.setText("24");
			}
		});
		def.setBackground(Color.CYAN);
		def.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		def.setForeground(Color.blue);
		def.setBounds(471, 0, 69, 37);
		frame.getContentPane().add(def);
	}

}
