import java.awt.*;
	import java.text.*;
	import java.util.*;
	import javax.swing.*;


public class clock {

	 public static void main(String[] args) {
	  
	  new MyFrame();
	 }
	}
	//---------------------------------------------------------------
	
 class MyFrame extends JFrame{
	 
	// Calendar calendar;
	 SimpleDateFormat timeFormat;
	 SimpleDateFormat dayFormat;
	 SimpleDateFormat dateFormat;
	 JLabel timeLabel;
	 JLabel dayLabel;
	 JLabel dateLabel;
	 String time;
	 String day;
	 String date;
	 
	// JFrame frame = new JFrame();
	 
	 MyFrame(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setTitle("Dom Clock Program");
	  this.setLayout(new FlowLayout());
	  this.setSize(350,200);
	  //this.setBackground(Color.black);
	 // frame.getContentPane().setBackground(new Color(0x123456));
	  this.setResizable(false);
	  
	  //MyFrame.setBackground(Color.black);
	  
	  timeFormat = new SimpleDateFormat("hh:mm:ss a");
	  //timeFormat = new SimpleDateFormat("h:mm a");

	  dayFormat = new SimpleDateFormat("EEEE");
	  dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
	  //dateFormat = new SimpleDateFormat("MMM d, yy");

	  
	  timeLabel = new JLabel();
	  //timeLabel.setFont(new Font("Verdana",Font.CENTER_BASELINE,50));

	  timeLabel.setFont(new Font("dima hi whatt",Font.LAYOUT_NO_START_CONTEXT,50));

	  //timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
	  //timeLabel.setForeground(new Color(0x00FF00));

	  timeLabel.setForeground(new Color(123,50,250));
	  //timeLabel.setBackground(Color.black);
	  //timeLabel.setBackground(Color.WHITE);

	  timeLabel.setOpaque(true);
	  
	  dayLabel = new JLabel();
	  //dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
	  
	  dayLabel.setFont(new Font("dima hi whatt",Font.PLAIN,35));
	  dayLabel.setForeground(new Color(123,50,250));
	  //dayLabel.setBackground(Color.black);
	  dayLabel.setOpaque(true);
	  
	  
	  dateLabel = new JLabel();
	  //dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
	  dateLabel.setFont(new Font("dima hi whatt",Font.PLAIN,25));
	  dateLabel.setForeground(new Color(123,50,250));
	  //dateLabel.setBackground(Color.black);
	  dateLabel.setOpaque(true);
	  
	  
	  
	  this.add(timeLabel);
	  this.add(dayLabel);
	  this.add(dateLabel);
	  this.setVisible(true);
	  
	  setTime();
	 }
	 
	 public void setTime() {
	  while(true) {
	  time = timeFormat.format(Calendar.getInstance().getTime());
	  timeLabel.setText(time);
	  
	  day = dayFormat.format(Calendar.getInstance().getTime());
	  dayLabel.setText(day);
	  
	  date = dateFormat.format(Calendar.getInstance().getTime());
	  dateLabel.setText(date);
	  
	  try {
	   Thread.sleep(1000);
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  }
	 }
	}