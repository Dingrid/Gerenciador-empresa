package view;

import java.awt.Container;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Executar extends JFrame{
	public Executar() {
		super("Sistemas");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		//barra do menu
		JMenuBar menuBar = new JMenuBar();
		//novo Menu
		JMenu menuFile = new JMenu("Cadastro"); 
		//item do menu
		JMenuItem mClientes = new JMenuItem("Clientes");
		mClientes.addActionListener(new ActionListener() {  //acao
			public void actionPerformed(ActionEvent e) {
			   Cliente cliente = new Cliente();
			}
		});
		
		JMenuItem mVendas = new JMenuItem("Vendas");
		mVendas.addActionListener(new ActionListener() {  //acao
			public void actionPerformed(ActionEvent e) {
			   Vendas vendas = new Vendas();
			}
		});
		
		JMenuItem mHardware = new JMenuItem("Hardware");
		mHardware.addActionListener(new ActionListener() {  //acao
			public void actionPerformed(ActionEvent e) {
			   Hardware hardware = new Hardware();
			}
		});
		
		menuFile.add(mClientes);
		menuFile.add(mVendas);
		menuFile.add(mHardware);
		menuBar.add(menuFile);
		super.setJMenuBar(menuBar);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
	}
	public static void main(String args[]) {
		Executar exec = new Executar();
	}
}
