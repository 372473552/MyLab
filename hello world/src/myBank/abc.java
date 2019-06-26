package myBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class abc extends JFrame {
	private JPanel contentPane;
	private JScrollPane scrollPane = new JScrollPane();
	private JTextArea textArea = new JTextArea();
	private static final String LINE_SEPARATOR= System.getProperty("line.separator");
	private JFileChooser jfc = new JFileChooser();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc frame = new abc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws FileNotFoundException
	 */
	public abc() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 468);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menu_item1ActionPerformed(e);
			}

		});
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					menu_item2ActionPerformed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmSave);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		scrollPane.setBounds(14, 13, 507, 371);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
	}
	protected void menu_item2ActionPerformed(ActionEvent e) throws IOException {
		jfc.showSaveDialog(jfc);
		String text=textArea.getText();
		BufferedWriter bw=null;
		File file=jfc.getSelectedFile();
		if(file.exists()) {
			try {
				
				bw=new BufferedWriter(new FileWriter(file));
				bw.write(text);
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				bw.close();
			}
		}else {
			file.createNewFile();
try {
				
				bw=new BufferedWriter(new FileWriter(file));
				bw.write(text);
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				bw.close();
			}
		}
		
		
		
		
	}
	protected void menu_item1ActionPerformed(ActionEvent e) {

		/*
		 * 打开文件选择器
		 */
		
		jfc.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "*.TXT";
			}

			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				String fileName = f.getName();

				if (f.isFile() && fileName.endsWith(".txt")) {

					return true;
				} else {
					return false;
				}

			}
		});
		jfc.setCurrentDirectory(new File("C:\\Users\\raymondhe\\Desktop"));
		jfc.showOpenDialog(this);
		textArea.setText("");
	 try {
		BufferedReader br=new BufferedReader(new FileReader(jfc.getSelectedFile()));
		String line=null;
		while((line=br.readLine())!=null) {
			
			
			textArea.append(line);
			textArea.append(LINE_SEPARATOR);
		}
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
}
