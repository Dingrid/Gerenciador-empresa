package view;

import java.awt.Container;   
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import controller.HardwareJdbcDAO;
//import controller.JdbcUtil;

public class Hardware extends JFrame {
	
	//elementos
	JLabel lblPreco = new JLabel("Preço unitário:");
	JTextField txtPreco = new JTextField();
	JLabel lblDescricao = new JLabel("Descrição:");
	JTextField txtDescricao= new JTextField();
	JLabel lblQtdA= new JLabel("Quantidade atual:");
	JTextField txtQtdA = new JTextField();
	JLabel lblQtdMin = new JLabel("Quantidade mínima:");
	JTextField txtQtdmin = new JTextField();
	JButton btnCadastrarHardware= new JButton("Cadastrar");
	JLabel lblAviso = new JLabel("Equipamento cadastrado com sucesso");

	public Hardware() {
		//define o texto de cima
		super("Sistema - Cadastro de equipamentos");

		final Container paine = this.getContentPane();
		paine.setLayout(null);

		lblDescricao.setBounds(20, 20, 150, 20);
		paine.add(lblDescricao);

		txtDescricao.setBounds(160, 20, 150, 20);
		paine.add(txtDescricao);

		lblPreco.setBounds(20, 50, 150, 20);
		paine.add(lblPreco);

		txtPreco.setBounds(160, 50, 150, 20);
		paine.add(txtPreco);

		lblQtdA.setBounds(20, 80, 150, 20);
		paine.add(lblQtdA);

		txtQtdA.setBounds(160, 80, 150, 20);
		paine.add(txtQtdA);

		lblQtdMin.setBounds(20, 110, 150, 20);
		paine.add(lblQtdMin);

		txtQtdmin.setBounds(160, 110, 150, 20);
		paine.add(txtQtdmin);

		btnCadastrarHardware.setBounds(20, 140, 150, 50);
		paine.add(btnCadastrarHardware);
		
		lblAviso.setBounds(20, 180, 150, 50);
		
		//adicionando acao para cadastro de equipamento
		/*btnCadastrarHardware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Hardware hardware = new model.Hardware(); 
				Connection connection;
				try {
					connection = JdbcUtil.getConnection();

					HardwareJdbcDAO hardwareJdbcDAO = new HardwareJdbcDAO(connection);

					hardware.setQtde_minima(Integer.parseInt(txtQtdmin.getText()));
					hardware.setDescricao(txtDescricao.getText());
					hardware.setPreco_unit(Double.parseDouble(txtPreco.getText()));
					hardware.setQtde_atual(Integer.parseInt(txtQtdA.getText()));
					int i = hardware.getId_hardware() + 1;
					hardware.setId_hardware(i);
					
					hardwareJdbcDAO.salvar(hardware);
					paine.add(btnCadastrarHardware);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});*/

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
	}
}