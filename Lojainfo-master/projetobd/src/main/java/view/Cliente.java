package view;

import java.awt.Container; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.ClienteJdbcDAO;
import controller.JdbcUtil;

public class Cliente extends JFrame {
	
	//elementos
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField();
	JLabel lblTelefone = new JLabel("Telefone:");
	JTextField txtTelefone = new JTextField();
	JLabel lblEmail = new JLabel("E-mail:");
	JTextField txtEmail = new JTextField();
	JButton btnCadastrarCliente= new JButton("Cadastrar Cliente");
	JLabel lblAviso = new JLabel("Cliente cadastrado com sucesso");

	public Cliente() {
		//define o texto de cima
		super("Sistema - Cadastro de Clientes");

		final Container paine = this.getContentPane();
		paine.setLayout(null);

		lblNome.setBounds(20, 20, 150, 20);
		paine.add(lblNome);

		txtNome.setBounds(160, 20, 150, 20);
		paine.add(txtNome);

		lblEndereco.setBounds(20, 50, 150, 20);
		paine.add(lblEndereco);

		txtEndereco.setBounds(160, 50, 150, 20);
		paine.add(txtEndereco);

		lblTelefone.setBounds(20, 80, 150, 20);
		paine.add(lblTelefone);

		txtTelefone.setBounds(160, 80, 150, 20);
		paine.add(txtTelefone);

		lblEmail.setBounds(20, 110, 150, 20);
		paine.add(lblEmail);

		txtEmail.setBounds(160, 110, 150, 20);
		paine.add(txtEmail);

		btnCadastrarCliente.setBounds(20, 140, 150, 50);
		paine.add(btnCadastrarCliente);
		
		lblAviso.setBounds(20, 180, 150, 50);
		
		//adicionando acao para cadastro de cliente
		/*btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Cliente cliente = new model.Cliente(); //instanciando um modelo de cliente
				Connection connection;
				try {
					connection = JdbcUtil.getConnection();

					ClienteJdbcDAO clienteJdbcDAO = new ClienteJdbcDAO(connection);

					cliente.setNome(txtNome.getText());
					cliente.setEndereco(txtEndereco.getText());
					cliente.setEmail(txtEmail.getText());
					cliente.setFone(txtTelefone.getText());
					int i = cliente.getId_cliente() + 1;
					cliente.setId_cliente(i);
					
					clienteJdbcDAO.salvar(cliente);
					paine.add(btnCadastrarCliente);
					
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