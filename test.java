package radix_sort_queue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class RadixSortQueue extends JFrame {
	
	private JPanel contentPane;
	private Color processingColor = new Color(255, 153, 153);

	private JLabel[] lbArrays;
		    
	private int[] a; 
			
	private JTextField txt;
	
	JButton btnrandom= new JButton("Random");
	    
	private Queue<Integer> arr0 = new LinkedList<Integer>();
	private Queue<Integer> arr1 = new LinkedList<Integer>();
	private Queue<Integer> arr2 = new LinkedList<Integer>();
	private Queue<Integer> arr3 = new LinkedList<Integer>();
	private Queue<Integer> arr4 = new LinkedList<Integer>();
	private Queue<Integer> arr5 = new LinkedList<Integer>();
	private Queue<Integer> arr6 = new LinkedList<Integer>();
	private Queue<Integer> arr7 = new LinkedList<Integer>();
	private Queue<Integer> arr8 = new LinkedList<Integer>();
	private Queue<Integer> arr9 = new LinkedList<Integer>();
	private Queue<Integer> arr10 = new LinkedList<Integer>();
	private Queue<Integer> arr11 = new LinkedList<Integer>();
	private Queue<Integer> arr12 = new LinkedList<Integer>();
	private Queue<Integer> arr13 = new LinkedList<Integer>();
	private Queue<Integer> arr14 = new LinkedList<Integer>();
	private Queue<Integer> arr15 = new LinkedList<Integer>();
	private Queue<Integer> arr16 = new LinkedList<Integer>();
	private Queue<Integer> arr17 = new LinkedList<Integer>();
	private Queue<Integer> arr18 = new LinkedList<Integer>();
	private Queue<Integer> arr19 = new LinkedList<Integer>();
			
			
		   
	private int time = 100;
	private JSlider slSpeed;
	private ChangeListener eSpeed;
	private int curT = -1;
	private Thread[] threads = new Thread[1000000];
		    
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadixSortQueue frame = new RadixSortQueue();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //set JFrame full screen
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public RadixSortQueue() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Radix Sort");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 150, 1376, 742);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		slSpeed = new JSlider();
		slSpeed.setOrientation(SwingConstants.VERTICAL);
		slSpeed.setBounds(1060, 50, 75, 75);
		slSpeed.setBackground(SystemColor.LIGHT_GRAY);
        slSpeed.setMinimum(1);
        slSpeed.setMaximum(9);
        slSpeed.setValue(4);
        contentPane.add(slSpeed);
        
        
        btnrandom.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Random rand = new Random();
        		for (int i = 0; i < 10; i++) {
        			int ranNum = -568 + rand.nextInt(999);
        			lbArrays[i].setText(String.valueOf(ranNum));
        			lbArrays[i].setForeground(Color.black);
        			a[i] = ranNum;
        		}
        		contentPane.setVisible(true);
        		contentPane.validate();
        		contentPane.repaint();
        		
        	}
        });
        btnrandom.setBounds(840, 50, 150, 75);
        btnrandom.setBackground(SystemColor.LIGHT_GRAY);
        btnrandom.setFont(new Font("Tahoma", Font.PLAIN, 30));
        contentPane.add(btnrandom);
        
        
    	JButton btnRadixSort = new JButton("Sort");
		btnRadixSort.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRadixSort.setBackground(SystemColor.LIGHT_GRAY);
		btnRadixSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnrandom.setEnabled(false);
				sort(count(max(a)));
			}
		});
		btnRadixSort.setBounds(1200, 50, 75, 75);
		contentPane.add(btnRadixSort);
        
       
        eSpeed = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                time = 100 - slSpeed.getValue() * 10;
            }
        };
        
        slSpeed.addChangeListener(eSpeed);
        
//______________________________________________________________________________________________________    
       
        //TextField
        
        txt = new JTextField(); 
        txt.setBounds(60,150,40,40);
        txt.setText("0");
        txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

		

		txt = new JTextField(); 
		txt.setBounds(60,200,40,40);
		txt.setText("1");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

		

		txt = new JTextField(); 
		txt.setBounds(60,250,40,40);
		txt.setText("2");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 


		txt = new JTextField(); 			        
		txt.setBounds(60,300,40,40);
		txt.setText("3");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 


		txt = new JTextField(); 	        
		txt.setBounds(60,350,40,40);
		txt.setText("4");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

		

		txt = new JTextField(); 	        
		txt.setBounds(60,400,40,40);
		txt.setText("5");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				
		
		txt = new JTextField(); 			        
		txt.setBounds(60,450,40,40);
		txt.setText("6");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				

		txt = new JTextField(); 			        
		txt.setBounds(60,500,40,40);
		txt.setText("7");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 



		txt = new JTextField(); 					        
		txt.setBounds(60,550,40,40);
		txt.setText("8");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				

		txt = new JTextField(); 							        
		txt.setBounds(60,600,40,40);
		txt.setText("9");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				

		
		txt = new JTextField(); 					        
		txt.setBounds(720,150,40,40);
		txt.setText("10");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 
	
				

		txt = new JTextField(); 					        
		txt.setBounds(720,200,40,40);
		txt.setText("11");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

		


		txt = new JTextField(); 							        
		txt.setBounds(720,250,40,40);
		txt.setText("12");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

						

		txt = new JTextField(); 								        
		txt.setBounds(720,300,40,40);
		txt.setText("13");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				


		txt = new JTextField(); 								        
		txt.setBounds(720,350,40,40);
		txt.setText("14");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

						


		txt = new JTextField(); 							        
		txt.setBounds(720,400,40,40);
		txt.setText("15");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				


		txt = new JTextField(); 							        
		txt.setBounds(720,450,40,40);
		txt.setText("16");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

						

		txt = new JTextField(); 							        
		txt.setBounds(720,500,40,40);
		txt.setText("17");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

				


		txt = new JTextField(); 							        
		txt.setBounds(720,550,40,40);
		txt.setText("18");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

						

		txt = new JTextField(); 							        
		txt.setBounds(720,600,40,40);
		txt.setText("19");
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.getContentPane().add(txt);
		txt.setEditable(false);
		txt.setHorizontalAlignment(SwingConstants.CENTER); 

	
//______________________________________________________________________________________________________    
        
		// Create Label and input.
		
		lbArrays = new JLabel[10];
                
        a = new int[10];
        int[] input = {75,70,-63,84,-98,-72,100,91,21,66};
        for (int i = 0; i < 10; i++) {
        	// create new label.
        	lbArrays[i] = new JLabel();
        	
        	// create new input.
        	a[i] = input[i];
        	lbArrays[i].setBackground(SystemColor.BLACK);
        	contentPane.add(lbArrays[i]);
        			
        	lbArrays[i].setText(String.valueOf(a[i]));
        			
        			
        			
        	//set size label
        	lbArrays[i].setSize(50,40);
        	lbArrays[i].setOpaque(true);
        	lbArrays[i].setForeground(Color.BLACK);
        			
        	//set location label
        	if (i == 0)
        		lbArrays[0].setLocation(60, 60);
        	else
        		lbArrays[i].setLocation(lbArrays[i-1].getX() + 60, 60);
        			
        	//set fonts
        	lbArrays[i].setFont(new Font("Tahoma", Font.PLAIN, 20));
        			
        	//set background color
        	lbArrays[i].setBackground(SystemColor.inactiveCaption);
        	//set text alignment center
        	lbArrays[i].setHorizontalAlignment(SwingConstants.CENTER); 
        	lbArrays[i].setVerticalAlignment(SwingConstants.CENTER);
        }
                          		
        		
	}    		
//_____________________________________________________________________________________________________________
	
	//Methods
	
	public int max(int []a) {
		int max = Math.abs(a[0]);
		for(int i=1; i<a.length; i++)
			if(Math.abs(a[i])>max)
				max = Math.abs(a[i]);
		return max;
	}
	

	public int count(int max) {
		int count = 1, a = 10;
		while (max / a != 0) {
			count++;
			a *= 10;
		}
		return count;
	}
	
	
	// Show message "Done!" after sort is done.
	public void showMessage() {
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		JOptionPane.showMessageDialog(contentPane,"Done!");
		    		Thread.sleep(0);
		    	} catch (Exception e) {
		    	}
		    }
		}); 
		threads[cur].start();
	}
	
	
	// Set button Random is enabled after sort is done.
	public void setRandom() {
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		btnrandom.setEnabled(true);
		    		Thread.sleep(0);
		    	} catch (Exception e) {
		    	}
		    }
		}); 
		threads[cur].start();
	}
	
	
	public void renewLabel(int []a) {
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		
		    		for (int i = 0; i < 10; i++) {
		    			lbArrays[i].setText(String.valueOf(a[i]));
		    			lbArrays[i].setLocation(60+i*60, 60);
		    			Thread.sleep(0);					
		    		}
		    		Thread.sleep(500);
		    	} catch (Exception e) {
		    	}
		    }
		}); 
		threads[cur].start();
	}
	
	
	// Add index of element in array.
	public void addIndex(int i, int q) {
		if(q==0) 
        	arr0.add(i);
		if(q==1) 
        	arr1.add(i);
		if(q==2) 
        	arr2.add(i);
		if(q==3) 
        	arr3.add(i);
		if(q==4) 
        	arr4.add(i);
		if(q==5) 
        	arr5.add(i);
		if(q==6) 
        	arr6.add(i);
		if(q==7) 
        	arr7.add(i);
		if(q==8) 
        	arr8.add(i);
		if(q==9) 
        	arr9.add(i);
		if(q==10) 
        	arr10.add(i);
		if(q==11) 
        	arr11.add(i);
		if(q==12) 
        	arr12.add(i);
		if(q==13) 
        	arr13.add(i);
		if(q==14) 
        	arr14.add(i);
		if(q==15) 
        	arr15.add(i);
		if(q==16) 
        	arr16.add(i);
		if(q==17) 
        	arr17.add(i);
		if(q==18) 
        	arr18.add(i);
		if(q==19) 
        	arr19.add(i);
       
	}
	
	
	
	// Move elements from Array to Queues.
	public void moveToQueue(JLabel lb1, int i, int dem0,int dem1,int dem2,int dem3,int dem4,int dem5,int dem6,int dem7,int dem8,int dem9,int dem10,int dem11,int dem12,int dem13,int dem14,int dem15,int dem16,int dem17,int dem18,int dem19 ) {
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		
		    		lb1.setBackground(processingColor);
		    		if(i<10) {
		    			 while (lb1.getX() > 10) {
					        	lb1.setLocation(lb1.getX() - 10, lb1.getY());
					        	
					        	Thread.sleep(time);
					        }
		    			 while (lb1.getY() < 150+i*50) {
					        	lb1.setLocation(lb1.getX(), lb1.getY() + 10);

					        	Thread.sleep(time);
					        }
		    		}
		    		else {
		    			 while (lb1.getX() <660) {
					        	
					        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
					        	
					        	Thread.sleep(time);
					        }
		    			 while (lb1.getY() < 150+(i-10)*50) {
					        	lb1.setLocation(lb1.getX(), lb1.getY() + 10);

					        	Thread.sleep(time);
					        }
		    		}
			        
		    		
			        
	
			        if(i==0) {
			        	int dem = 120+dem0*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==1) {
			        	int dem = 120+dem1*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==2) {
			        	int dem = 120+dem2*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==3) {
			        	int dem = 120+dem3*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==4) {
			        	int dem = 120+dem4*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==5) {
			        	int dem = 120+dem5*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==6) {
			        	int dem = 120+dem6*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==7) {
			        	int dem = 120+dem7*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==8) {
			        	int dem = 120+dem8*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==9) {
			        	int dem = 120+dem9*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==10) {
			        	int dem = 780+dem10*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==11) {
			        	int dem = 780+dem11*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==12) {
			        	int dem = 780+dem12*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==13) {
			        	int dem = 780+dem13*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==14) {
			        	int dem = 780+dem14*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==15) {
			        	int dem = 780+dem15*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==16) {
			        	int dem = 780+dem16*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==17) {
			        	int dem = 780+dem17*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }
				        
			        }
			        
			        if(i==18) {
			        	int dem = 780+dem18*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }

			        }
			        
			        if(i==19) {
			        	int dem = 780+dem19*60;
				        while (lb1.getX()  < dem ) {
				        	
				        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
				        	
				        	Thread.sleep(time);
				        }
				        
			        }
			       
			        lb1.setBackground(SystemColor.inactiveCaption);
		    	} catch (Exception e) {
		    	}
		    }
		}); 
		threads[cur].start();
	}
	
	
	// Move elements from Queues to Array.
	public void moveToArray(JLabel[] lbArrays,int i, int dem) {
		int demArray = dem;
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {

			@Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		
		    		if(i==0) {
		    			lbArrays[arr0.element()].setBackground(processingColor);
		    			while (lbArrays[arr0.element()].getX() > 10) {
				        	
		    				lbArrays[arr0.element()].setLocation(lbArrays[arr0.element()].getX() - 10, lbArrays[arr0.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr0.element()].getY() > 60) {
		    				lbArrays[arr0.element()].setLocation(lbArrays[arr0.element()].getX(), lbArrays[arr0.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr0.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr0.element()].setLocation(lbArrays[arr0.element()].getX() + 10, lbArrays[arr0.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr0.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr0.remove();	
		    		}
		    		
		    		if(i==1) {
		    			lbArrays[arr1.element()].setBackground(processingColor);
		    			while (lbArrays[arr1.element()].getX() > 10) {
				        	
		    				lbArrays[arr1.element()].setLocation(lbArrays[arr1.element()].getX() - 10, lbArrays[arr1.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr1.element()].getY() > 60) {
		    				lbArrays[arr1.element()].setLocation(lbArrays[arr1.element()].getX(), lbArrays[arr1.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr1.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr1.element()].setLocation(lbArrays[arr1.element()].getX() + 10, lbArrays[arr1.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr1.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr1.remove();	
		    		}
		    		
		    		if(i==2) {
		    			lbArrays[arr2.element()].setBackground(processingColor);
		    			while (lbArrays[arr2.element()].getX() > 10) {
				        	
		    				lbArrays[arr2.element()].setLocation(lbArrays[arr2.element()].getX() - 10, lbArrays[arr2.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr2.element()].getY() > 60) {
		    				lbArrays[arr2.element()].setLocation(lbArrays[arr2.element()].getX(), lbArrays[arr2.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr2.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr2.element()].setLocation(lbArrays[arr2.element()].getX() + 10, lbArrays[arr2.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr2.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr2.remove();	
		    		}
		    		
		    		if(i==3) {
		    			lbArrays[arr3.element()].setBackground(processingColor);
		    			while (lbArrays[arr3.element()].getX() > 10) {
				        	
		    				lbArrays[arr3.element()].setLocation(lbArrays[arr3.element()].getX() - 10, lbArrays[arr3.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr3.element()].getY() > 60) {
		    				lbArrays[arr3.element()].setLocation(lbArrays[arr3.element()].getX(), lbArrays[arr3.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr3.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr3.element()].setLocation(lbArrays[arr3.element()].getX() + 10, lbArrays[arr3.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr3.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr3.remove();	
		    		}
		    		
		    		if(i==4) {
		    			lbArrays[arr4.element()].setBackground(processingColor);
		    			while (lbArrays[arr4.element()].getX() > 10) {
				        	
		    				lbArrays[arr4.element()].setLocation(lbArrays[arr4.element()].getX() - 10, lbArrays[arr4.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr4.element()].getY() > 60) {
		    				lbArrays[arr4.element()].setLocation(lbArrays[arr4.element()].getX(), lbArrays[arr4.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr4.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr4.element()].setLocation(lbArrays[arr4.element()].getX() + 10, lbArrays[arr4.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr4.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr4.remove();	
		    		}
		    		
		    		if(i==5) {
		    			lbArrays[arr5.element()].setBackground(processingColor);
		    			while (lbArrays[arr5.element()].getX() > 10) {
				        	
		    				lbArrays[arr5.element()].setLocation(lbArrays[arr5.element()].getX() - 10, lbArrays[arr5.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr5.element()].getY() > 60) {
		    				lbArrays[arr5.element()].setLocation(lbArrays[arr5.element()].getX(), lbArrays[arr5.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr5.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr5.element()].setLocation(lbArrays[arr5.element()].getX() + 10, lbArrays[arr5.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr5.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr5.remove();	
		    		}
		    		
		    		if(i==6) {
		    			lbArrays[arr6.element()].setBackground(processingColor);
		    			while (lbArrays[arr6.element()].getX() > 10) {
				        	
		    				lbArrays[arr6.element()].setLocation(lbArrays[arr6.element()].getX() - 10, lbArrays[arr6.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr6.element()].getY() > 60) {
		    				lbArrays[arr6.element()].setLocation(lbArrays[arr6.element()].getX(), lbArrays[arr6.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr6.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr6.element()].setLocation(lbArrays[arr6.element()].getX() + 10, lbArrays[arr6.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr6.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr6.remove();	
		    		}
		    		
		    		if(i==7) {
		    			lbArrays[arr7.element()].setBackground(processingColor);
		    			while (lbArrays[arr7.element()].getX() > 10) {
				        	
		    				lbArrays[arr7.element()].setLocation(lbArrays[arr7.element()].getX() - 10, lbArrays[arr7.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr7.element()].getY() > 60) {
		    				lbArrays[arr7.element()].setLocation(lbArrays[arr7.element()].getX(), lbArrays[arr7.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr7.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr7.element()].setLocation(lbArrays[arr7.element()].getX() + 10, lbArrays[arr7.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr7.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr7.remove();	
		    		}
		    		
		    		if(i==8) {
		    			lbArrays[arr8.element()].setBackground(processingColor);
		    			while (lbArrays[arr8.element()].getX() > 10) {
				        	
		    				lbArrays[arr8.element()].setLocation(lbArrays[arr8.element()].getX() - 10, lbArrays[arr8.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr8.element()].getY() > 60) {
		    				lbArrays[arr8.element()].setLocation(lbArrays[arr8.element()].getX(), lbArrays[arr8.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr8.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr8.element()].setLocation(lbArrays[arr8.element()].getX() + 10, lbArrays[arr8.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr8.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr8.remove();	
		    		}
		    		
		    		if(i==9) {
		    			lbArrays[arr9.element()].setBackground(processingColor);
		    			while (lbArrays[arr9.element()].getX() > 10) {
				        	
		    				lbArrays[arr9.element()].setLocation(lbArrays[arr9.element()].getX() - 10, lbArrays[arr9.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr9.element()].getY() > 60) {
		    				lbArrays[arr9.element()].setLocation(lbArrays[arr9.element()].getX(), lbArrays[arr9.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr9.element()].getX()  < dem ) {
		    	        	
		    	        	lbArrays[arr9.element()].setLocation(lbArrays[arr9.element()].getX() + 10, lbArrays[arr9.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr9.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr9.remove();	
		    		}
		    		
		    		if(i==10) {
		    			lbArrays[arr10.element()].setBackground(processingColor);
		    			while (lbArrays[arr10.element()].getX() > 660) {
				        	
		    				lbArrays[arr10.element()].setLocation(lbArrays[arr10.element()].getX() - 10, lbArrays[arr10.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr10.element()].getY() > 60) {
		    				lbArrays[arr10.element()].setLocation(lbArrays[arr10.element()].getX(), lbArrays[arr10.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr10.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr10.element()].setLocation(lbArrays[arr10.element()].getX() - 10, lbArrays[arr10.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr10.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr10.remove();	
		    		}
		    		
		    		if(i==11) {
		    			lbArrays[arr11.element()].setBackground(processingColor);
		    			while (lbArrays[arr11.element()].getX() > 660) {
				        	
		    				lbArrays[arr11.element()].setLocation(lbArrays[arr11.element()].getX() - 10, lbArrays[arr11.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr11.element()].getY() > 60) {
		    				lbArrays[arr11.element()].setLocation(lbArrays[arr11.element()].getX(), lbArrays[arr11.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr11.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr11.element()].setLocation(lbArrays[arr11.element()].getX() - 10, lbArrays[arr11.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr11.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr11.remove();	
		    		}
		    		
		    		if(i==12) {
		    			lbArrays[arr12.element()].setBackground(processingColor);
		    			while (lbArrays[arr12.element()].getX() > 660) {
				        	
		    				lbArrays[arr12.element()].setLocation(lbArrays[arr12.element()].getX() - 10, lbArrays[arr12.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr12.element()].getY() > 60) {
		    				lbArrays[arr12.element()].setLocation(lbArrays[arr12.element()].getX(), lbArrays[arr12.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr12.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr12.element()].setLocation(lbArrays[arr12.element()].getX() - 10, lbArrays[arr12.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr12.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr12.remove();	
		    		}
		    		
		    		if(i==13) {
		    			lbArrays[arr13.element()].setBackground(processingColor);
		    			while (lbArrays[arr13.element()].getX() > 660) {
				        	
		    				lbArrays[arr13.element()].setLocation(lbArrays[arr13.element()].getX() - 10, lbArrays[arr13.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr13.element()].getY() > 60) {
		    				lbArrays[arr13.element()].setLocation(lbArrays[arr13.element()].getX(), lbArrays[arr13.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr13.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr13.element()].setLocation(lbArrays[arr13.element()].getX() - 10, lbArrays[arr13.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr13.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr13.remove();	
		    		}
		    		
		    		if(i==14) {
		    			lbArrays[arr14.element()].setBackground(processingColor);
		    			while (lbArrays[arr14.element()].getX() > 660) {
				        	
		    				lbArrays[arr14.element()].setLocation(lbArrays[arr14.element()].getX() - 10, lbArrays[arr14.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr14.element()].getY() > 60) {
		    				lbArrays[arr14.element()].setLocation(lbArrays[arr14.element()].getX(), lbArrays[arr14.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr14.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr14.element()].setLocation(lbArrays[arr14.element()].getX() - 10, lbArrays[arr14.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr14.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr14.remove();	
		    		}
		    		
		    		if(i==15) {
		    			lbArrays[arr15.element()].setBackground(processingColor);
		    			while (lbArrays[arr15.element()].getX() > 660) {
				        	
		    				lbArrays[arr15.element()].setLocation(lbArrays[arr15.element()].getX() - 10, lbArrays[arr15.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr15.element()].getY() > 60) {
		    				lbArrays[arr15.element()].setLocation(lbArrays[arr15.element()].getX(), lbArrays[arr15.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr15.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr15.element()].setLocation(lbArrays[arr15.element()].getX() - 10, lbArrays[arr15.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr15.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr15.remove();	
		    		}
		    		
		    		if(i==16) {
		    			lbArrays[arr16.element()].setBackground(processingColor);
		    			while (lbArrays[arr16.element()].getX() > 660) {
				        	
		    				lbArrays[arr16.element()].setLocation(lbArrays[arr16.element()].getX() - 10, lbArrays[arr16.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr16.element()].getY() > 60) {
		    				lbArrays[arr16.element()].setLocation(lbArrays[arr16.element()].getX(), lbArrays[arr16.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr16.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr16.element()].setLocation(lbArrays[arr16.element()].getX() - 10, lbArrays[arr16.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr16.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr16.remove();	
		    		}
		    		
		    		if(i==17) {
		    			lbArrays[arr17.element()].setBackground(processingColor);
		    			while (lbArrays[arr17.element()].getX() > 660) {
				        	
		    				lbArrays[arr17.element()].setLocation(lbArrays[arr17.element()].getX() - 10, lbArrays[arr17.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr17.element()].getY() > 60) {
		    				lbArrays[arr17.element()].setLocation(lbArrays[arr17.element()].getX(), lbArrays[arr17.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr17.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr17.element()].setLocation(lbArrays[arr17.element()].getX() - 10, lbArrays[arr17.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr17.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr17.remove();	
		    		}
		    		
		    		if(i==18) {
		    			lbArrays[arr18.element()].setBackground(processingColor);
		    			while (lbArrays[arr18.element()].getX() > 660) {
				        	
		    				lbArrays[arr18.element()].setLocation(lbArrays[arr18.element()].getX() - 10, lbArrays[arr18.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr18.element()].getY() > 60) {
		    				lbArrays[arr18.element()].setLocation(lbArrays[arr18.element()].getX(), lbArrays[arr18.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr18.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr18.element()].setLocation(lbArrays[arr18.element()].getX() - 10, lbArrays[arr18.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr18.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr18.remove();	
		    		}
		    		
		    		if(i==19) {
		    			lbArrays[arr19.element()].setBackground(processingColor);
		    			while (lbArrays[arr19.element()].getX() > 660) {
				        	
		    				lbArrays[arr19.element()].setLocation(lbArrays[arr19.element()].getX() - 10, lbArrays[arr19.element()].getY());
			    		

				        	Thread.sleep(time);
				        }
		    			while (lbArrays[arr19.element()].getY() > 60) {
		    				lbArrays[arr19.element()].setLocation(lbArrays[arr19.element()].getX(), lbArrays[arr19.element()].getY() - 10);

				        	Thread.sleep(time);
				        }
		    			
		    			int dem = 60+demArray*60;
		    	        while (lbArrays[arr19.element()].getX()  > dem ) {
		    	        	
		    	        	lbArrays[arr19.element()].setLocation(lbArrays[arr19.element()].getX() - 10, lbArrays[arr19.element()].getY());
		    	        	
		    	        	Thread.sleep(time);
		    	        }

		    	        
		    	        lbArrays[arr19.element()].setBackground(SystemColor.inactiveCaption);
		    	        
		    	        arr19.remove();	
		    		}
		    		
		    	} catch (Exception e) {
		    	}
		    }
		}); 
		threads[cur].start();
	} 
	
	
	// Implement sort stages.
	public void implement(int count1) {
		Queue<Integer> []q = new LinkedList[20];
		
		 for(int i=0; i<20; i++) {
			q[i] = new LinkedList<Integer>();
		 }
			
		int demArray=0;
	    int dem0=0;
	    int dem1=0;
	    int dem2=0;
	    int dem3=0;
	    int dem4=0;
	    int dem5=0;
	    int dem6=0;
	    int dem7=0;
	    int dem8=0;
	    int dem9=0;
	    int dem10=0;
	    int dem11=0;
	    int dem12=0;
	    int dem13=0;
	    int dem14=0;
	    int dem15=0;
	    int dem16=0;
	    int dem17=0;
	    int dem18=0;
	    int dem19=0;
	    
		for(int i=0; i<a.length; i++) {				
			int index = Math.abs(a[i]);
			for(int j = 2; j <= count1; j++) {
				index = index/10;
			}
			if(a[i]<0) {
				
				q[10+index%10].add(a[i]);
				
				moveToQueue(lbArrays[i],10+index%10,dem0,dem1,dem2,dem3,dem4,dem5,dem6,dem7,dem8,dem9,dem10,dem11,dem12,dem13,dem14,dem15,dem16,dem17,dem18,dem19);
				

				if((10+index%10)==10)
					dem10++;
				if((10+index%10)==11)
					dem11++;
				if((10+index%10)==12)
					dem12++;
				if((10+index%10)==13)
					dem13++;
				if((10+index%10)==14)
					dem14++;
				if((10+index%10)==15)
					dem15++;
				if((10+index%10)==16)
					dem16++;
				if((10+index%10)==17)
					dem17++;
				if((10+index%10)==18)
					dem18++;
				if((10+index%10)==19)
					dem19++;
				
				addIndex(i,10+index%10);
				
			}
				
			else {
				q[index%10].add(a[i]);	
				
				moveToQueue(lbArrays[i],index%10,dem0,dem1,dem2,dem3,dem4,dem5,dem6,dem7,dem8,dem9,dem10,dem11,dem12,dem13,dem14,dem15,dem16,dem17,dem18,dem19);
				
				if((index%10)==0)
					dem0++;
				if((index%10)==1)
					dem1++;
				if((index%10)==2)
					dem2++;
				if((index%10)==3)
					dem3++;
				if((index%10)==4)
					dem4++;
				if((index%10)==5)
					dem5++;
				if((index%10)==6)
					dem6++;
				if((index%10)==7)
					dem7++;
				if((index%10)==8)
					dem8++;
				if((index%10)==9)
					dem9++;
			
				addIndex(i,index%10);
			}		
		}
		
			
		int n = 0;
			
		for(int i=19; i>=10; i--) {
			while(q[i].isEmpty() == false) {
				moveToArray(lbArrays,i,demArray);
				demArray++;
				a[n] = q[i].remove();
				n++;	
			}
			
		}
		
			
		for(int i=0; i<10; i++) {
			while(q[i].isEmpty() == false) {
				moveToArray(lbArrays,i,demArray);
				demArray++;
				a[n] = q[i].remove();
				n++;		
			}
		}
		
	}
	
	
	//Implement Radix Sort.
	public void sort(int count) {
		 int count1 = 1;
		 while(count!=0) {
			 implement(count1);
			 int []a1 = new int [10];
			 for(int i=0; i<10; i++) {
				 a1[i] = a[i];
			 }
			
			 renewLabel(a1);
			 
			 for(int i=0; i<10; i++) {
				 System.out.print(a[i]+ " ");		
			 }
			 System.out.println();
			 count--;
			 count1++;	
		 }
		 showMessage();
		 setRandom();
	 }
}

