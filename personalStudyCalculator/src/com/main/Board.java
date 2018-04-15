package com.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.event.MouseMotionAdapter;
import java.util.Scanner;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Board extends JFrame {

	private JPanel contentPane;
	private JTextField txtField;
	public String txtFieldString = "";
	public int xx, xy;
	final static boolean focus = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board();
					frame.setUndecorated(true);
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
	public Board() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "deneme");

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlResult = new JPanel();
		pnlResult.setBackground(Color.BLACK);
		pnlResult.setBounds(-1, 30, 375, 103);
		contentPane.add(pnlResult);
		pnlResult.setLayout(null);

		txtField = new JTextField();
		txtField.setForeground(SystemColor.menu);
		txtField.setBounds(0, 3, 375, 93);
		pnlResult.add(txtField);
		txtField.setBackground(Color.BLACK);
		txtField.setFont(new Font("Segoe UI Light", Font.PLAIN, 36));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setEditable(false);
		txtField.setColumns(10);
		txtField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-1, 132, 375, 297);
		contentPane.add(panel);
		panel.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn6.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn6.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn6.setForeground(Color.WHITE);
		btn6.setFocusPainted(false);
		btn6.setBorderPainted(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "6";
				txtField.setText(txtFieldString);
			}
		});

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn2.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn2.setForeground(Color.WHITE);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "2";
				txtField.setText(txtFieldString);
			}
		});

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn1.setForeground(Color.WHITE);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(Color.DARK_GRAY);

			}
		});

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "1";
				txtField.setText(txtFieldString);
			}
		});
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		panel.add(btn1);
		btn1.setBackground(Color.DARK_GRAY);
		panel.add(btn2);
		btn2.setBackground(Color.DARK_GRAY);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn5.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn5.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn5.setForeground(Color.WHITE);
		btn5.setFocusPainted(false);
		btn5.setBorderPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "5";
				txtField.setText(txtFieldString);
			}
		});

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn4.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn4.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn4.setForeground(Color.WHITE);
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "4";
				txtField.setText(txtFieldString);
			}
		});

		JButton btnParantezAc = new JButton("(");
		btnParantezAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "(";
				txtField.setText(txtFieldString);
			}
		});
		btnParantezAc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnParantezAc.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnParantezAc.setBackground(Color.DARK_GRAY);
			}
		});

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn3.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn3.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn3.setForeground(Color.WHITE);
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "3";
				txtField.setText(txtFieldString);
			}
		});
		panel.add(btn3);
		btn3.setBackground(Color.DARK_GRAY);
		btnParantezAc.setForeground(Color.WHITE);
		btnParantezAc.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnParantezAc.setFocusPainted(false);
		btnParantezAc.setBorderPainted(false);
		btnParantezAc.setBackground(Color.DARK_GRAY);
		panel.add(btnParantezAc);

		JButton btnParantezKapat = new JButton(")");
		btnParantezKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += ")";
				txtField.setText(txtFieldString);
			}
		});
		btnParantezKapat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnParantezKapat.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnParantezKapat.setBackground(Color.DARK_GRAY);
			}
		});
		btnParantezKapat.setForeground(Color.WHITE);
		btnParantezKapat.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnParantezKapat.setFocusPainted(false);
		btnParantezKapat.setBorderPainted(false);
		btnParantezKapat.setBackground(Color.DARK_GRAY);
		panel.add(btnParantezKapat);
		panel.add(btn4);
		btn4.setBackground(Color.DARK_GRAY);
		panel.add(btn5);
		btn5.setBackground(Color.DARK_GRAY);
		panel.add(btn6);
		btn6.setBackground(Color.DARK_GRAY);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn9.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn9.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn9.setForeground(Color.WHITE);
		btn9.setFocusPainted(false);
		btn9.setBorderPainted(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "9";
				txtField.setText(txtFieldString);
			}
		});

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn8.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn8.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn8.setForeground(Color.WHITE);
		btn8.setFocusPainted(false);
		btn8.setBorderPainted(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "8";
				txtField.setText(txtFieldString);
			}
		});

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn7.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn7.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn7.setForeground(Color.WHITE);
		btn7.setFocusPainted(false);
		btn7.setBorderPainted(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "7";
				txtField.setText(txtFieldString);
			}
		});

		JButton btnArti = new JButton("+");
		btnArti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnArti.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnArti.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnArti.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnArti.setForeground(Color.WHITE);
		btnArti.setFocusPainted(false);
		btnArti.setBorderPainted(false);
		btnArti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += " + ";
				txtField.setText(txtFieldString);
			}
		});
		btnArti.setBackground(Color.DARK_GRAY);
		panel.add(btnArti);

		JButton btnEksi = new JButton("-");
		btnEksi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEksi.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnEksi.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnEksi.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnEksi.setForeground(Color.WHITE);
		btnEksi.setFocusPainted(false);
		btnEksi.setBorderPainted(false);
		btnEksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += " - ";
				txtField.setText(txtFieldString);
			}
		});
		btnEksi.setBackground(Color.DARK_GRAY);
		panel.add(btnEksi);
		panel.add(btn7);
		btn7.setBackground(Color.DARK_GRAY);
		panel.add(btn8);
		btn8.setBackground(Color.DARK_GRAY);
		btn9.setBackground(Color.DARK_GRAY);
		panel.add(btn9);

		JButton btnBolu = new JButton("/");
		btnBolu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBolu.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBolu.setBackground(Color.DARK_GRAY);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnBolu.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnBolu.setForeground(Color.WHITE);
		btnBolu.setFocusPainted(false);
		btnBolu.setBorderPainted(false);
		btnBolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += " / ";
				txtField.setText(txtFieldString);
			}
		});
		btnBolu.setBackground(Color.DARK_GRAY);
		panel.add(btnBolu);
		
				JButton btnCarpi = new JButton("x");
				btnCarpi.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnCarpi.setBackground(new Color(255, 55, 93));
					}

					@Override
					public void mouseExited(MouseEvent e) {
						btnCarpi.setBackground(Color.DARK_GRAY);

					}

					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnCarpi.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
				btnCarpi.setForeground(Color.WHITE);
				btnCarpi.setFocusPainted(false);
				btnCarpi.setBorderPainted(false);
				btnCarpi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFieldString += " * ";
						txtField.setText(txtFieldString);
					}
				});
				btnCarpi.setBackground(Color.DARK_GRAY);
				panel.add(btnCarpi);

		JButton btnSil = new JButton("Bckspc");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtFieldString.isEmpty())
					txtField.setText(txtFieldString);
				else {
					StringBuilder sb = new StringBuilder(txtFieldString);
					sb.deleteCharAt(txtFieldString.length() - 1);
					txtFieldString = sb.toString();
					txtField.setText(txtFieldString);
				}
			}
		});
		btnSil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSil.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSil.setBackground(Color.DARK_GRAY);
			}

		});

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "0";
				txtField.setText(txtFieldString);
			}
		});
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn0.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn0.setBackground(Color.DARK_GRAY);
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btn0.setFocusPainted(false);
		btn0.setBorderPainted(false);
		btn0.setBackground(Color.DARK_GRAY);
		panel.add(btn0);
		
				JButton btnClear = new JButton("Clear");
				btnClear.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnClear.setBackground(new Color(255, 55, 93));
					}

					@Override
					public void mouseExited(MouseEvent e) {
						btnClear.setBackground(Color.DARK_GRAY);

					}

					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnClear.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
				btnClear.setForeground(Color.WHITE);
				btnClear.setFocusPainted(false);
				btnClear.setBorderPainted(false);
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFieldString = "";
						txtField.setText(txtFieldString);

					}
				});
				
						JButton btnYuzde = new JButton("00");
						btnYuzde.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								txtFieldString += "00";
								txtField.setText(txtFieldString);
							}
						});
						btnYuzde.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								btnYuzde.setBackground(new Color(255, 55, 93));
							}

							@Override
							public void mouseExited(MouseEvent e) {
								btnYuzde.setBackground(Color.DARK_GRAY);
							}
						});
						btnYuzde.setForeground(Color.WHITE);
						btnYuzde.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
						btnYuzde.setFocusPainted(false);
						btnYuzde.setBorderPainted(false);
						btnYuzde.setBackground(Color.DARK_GRAY);
						panel.add(btnYuzde);
				panel.add(btnClear);
				btnClear.setBackground(Color.DARK_GRAY);
		btnSil.setForeground(Color.WHITE);
		btnSil.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btnSil.setFocusPainted(false);
		btnSil.setBorderPainted(false);
		btnSil.setBackground(Color.DARK_GRAY);
		panel.add(btnSil);

		JButton btnNokta = new JButton(".");
		btnNokta.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnNokta.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNokta.setBackground(Color.DARK_GRAY);

			}
		});
		btnNokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += ".";
				txtField.setText(txtFieldString);
			}

		});

		JButton btnKopyala = new JButton("Copy");
		btnKopyala.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnKopyala.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnKopyala.setBackground(Color.DARK_GRAY);

			}
		});
		btnKopyala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(
                        new StringSelection(txtFieldString),
                        null
                );
			}
		});
		btnKopyala.setForeground(Color.WHITE);
		btnKopyala.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnKopyala.setFocusPainted(false);
		btnKopyala.setBorderPainted(false);
		btnKopyala.setBackground(Color.DARK_GRAY);
		panel.add(btnKopyala);
		btnNokta.setForeground(Color.WHITE);
		btnNokta.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnNokta.setFocusPainted(false);
		btnNokta.setBorderPainted(false);
		btnNokta.setBackground(Color.DARK_GRAY);
		panel.add(btnNokta);

		JButton btnUssu = new JButton("^");
		btnUssu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldString += "^";
				txtField.setText(txtFieldString);
			}
		});
		btnUssu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUssu.setBackground(new Color(255, 55, 93));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnUssu.setBackground(Color.DARK_GRAY);
			}
		});
		btnUssu.setForeground(Color.WHITE);
		btnUssu.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		btnUssu.setFocusPainted(false);
		btnUssu.setBorderPainted(false);
		btnUssu.setBackground(Color.DARK_GRAY);
		panel.add(btnUssu);
		
				JButton btnEsittir = new JButton("=");
				btnEsittir.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnEsittir.setBackground(new Color(255, 164, 0));
					}

					@Override
					public void mouseExited(MouseEvent e) {
						btnEsittir.setBackground(new Color(244, 164, 96));

					}

					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				btnEsittir.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
				btnEsittir.setForeground(Color.WHITE);
				btnEsittir.setFocusPainted(false);
				btnEsittir.setBorderPainted(false);
				btnEsittir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFieldString = new Back().solver(txtFieldString);
						txtField.setText(txtFieldString);

					}
				});
				
				JButton btnPi = new JButton("\u03C0");
				btnPi.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnPi.setBackground(new Color(255, 55, 93));
					}

					@Override
					public void mouseExited(MouseEvent e) {
						btnPi.setBackground(Color.DARK_GRAY);
					}
				});
				btnPi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFieldString += "3.141592";
						txtField.setText(txtFieldString);
						
					}
				});
				btnPi.setForeground(Color.WHITE);
				btnPi.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
				btnPi.setFocusPainted(false);
				btnPi.setBorderPainted(false);
				btnPi.setBackground(Color.DARK_GRAY);
				panel.add(btnPi);
				
				JButton btnKare = new JButton("x\u00B2");
				btnKare.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFieldString += " ^ 2";
						txtField.setText(txtFieldString);
					}
				});
				btnKare.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnKare.setBackground(new Color(255, 55, 93));
					}

					@Override
					public void mouseExited(MouseEvent e) {
						btnKare.setBackground(Color.DARK_GRAY);
					}
				});
				btnKare.setForeground(Color.WHITE);
				btnKare.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
				btnKare.setFocusPainted(false);
				btnKare.setBorderPainted(false);
				btnKare.setBackground(Color.DARK_GRAY);
				panel.add(btnKare);
				btnEsittir.setBackground(new Color(244, 164, 96));
				panel.add(btnEsittir);

		JPanel pnlClose = new JPanel();
		pnlClose.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				Board.this.setLocation(x, y);
			}
		});

		pnlClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});

		pnlClose.setBorder(null);
		pnlClose.setBackground(Color.GRAY);
		pnlClose.setBounds(-1, 0, 375, 30);
		contentPane.add(pnlClose);
		pnlClose.setLayout(null);

		JLabel lblX = new JLabel("X");
		lblX.setBackground(UIManager.getColor("Button.background"));
		lblX.setOpaque(true);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setOpaque(true);
				lblX.setBackground(new Color(255, 88, 79));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setBackground(UIManager.getColor("Button.background"));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblX.setBounds(327, 0, 38, 25);
		pnlClose.add(lblX);

		JLabel lblHesapMakinesi = new JLabel("Calculator");
		lblHesapMakinesi.setForeground(SystemColor.inactiveCaptionBorder);
		lblHesapMakinesi.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblHesapMakinesi.setBounds(34, 4, 117, 23);
		pnlClose.add(lblHesapMakinesi);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(Board.class.getResource("/img/icoCalc.png")));
		label.setBounds(4, 3, 24, 24);
		pnlClose.add(label);
	}
}
