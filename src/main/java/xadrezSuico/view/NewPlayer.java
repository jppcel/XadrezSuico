package xadrezSuico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_lastName;
	private JTextField tf_intlId;
	private JTextField tf_intlRa;
	private JTextField tf_conId;
	private JTextField tf_conRa;
	private JTextField tf_locId;
	private JTextField tf_locRa;
	private JTextField tf_club;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPlayer frame = new NewPlayer();
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
	public NewPlayer() {
		setResizable(false);
		setTitle("Novo Enxadrista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{63, 61, 110, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		contentPane.add(lblNome, gbc_lblNome);
		
		tf_name = new JTextField();
		tf_name.setToolTipText("Nome do Enxadrista");
		GridBagConstraints gbc_name = new GridBagConstraints();
		gbc_name.insets = new Insets(0, 0, 5, 5);
		gbc_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_name.gridx = 1;
		gbc_name.gridy = 0;
		contentPane.add(tf_name, gbc_name);
		tf_name.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblSobrenome = new GridBagConstraints();
		gbc_lblSobrenome.insets = new Insets(0, 0, 5, 5);
		gbc_lblSobrenome.gridx = 2;
		gbc_lblSobrenome.gridy = 0;
		contentPane.add(lblSobrenome, gbc_lblSobrenome);
		
		tf_lastName = new JTextField();
		tf_lastName.setToolTipText("Sobrenome do Enxadrista");
		GridBagConstraints gbc_lastName = new GridBagConstraints();
		gbc_lastName.insets = new Insets(0, 0, 5, 0);
		gbc_lastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lastName.gridx = 3;
		gbc_lastName.gridy = 0;
		contentPane.add(tf_lastName, gbc_lastName);
		tf_lastName.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 1;
		contentPane.add(lblSexo, gbc_lblSexo);
		
		JComboBox cb_sex = new JComboBox();
		cb_sex.setToolTipText("Sexo do Enxadrista");
		GridBagConstraints gbc_sex = new GridBagConstraints();
		gbc_sex.insets = new Insets(0, 0, 5, 5);
		gbc_sex.fill = GridBagConstraints.HORIZONTAL;
		gbc_sex.gridx = 1;
		gbc_sex.gridy = 1;
		contentPane.add(cb_sex, gbc_sex);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridx = 2;
		gbc_lblDataDeNascimento.gridy = 1;
		contentPane.add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		JXDatePicker picker = new JXDatePicker();
		picker.getEditor().setToolTipText("Data de Nascimento(Formato: dd/mm/aaaa)");
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		GridBagConstraints gbc_picker = new GridBagConstraints();
		gbc_picker.insets = new Insets(0, 0, 5, 0);
		gbc_picker.fill = GridBagConstraints.HORIZONTAL;
		gbc_picker.gridx = 3;
		gbc_picker.gridy = 1;
		contentPane.add(picker, gbc_picker);
		
		JLabel lblFederao = new JLabel("Federa\u00E7\u00E3o");
		lblFederao.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblFederao = new GridBagConstraints();
		gbc_lblFederao.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFederao.insets = new Insets(0, 0, 5, 5);
		gbc_lblFederao.gridx = 0;
		gbc_lblFederao.gridy = 2;
		contentPane.add(lblFederao, gbc_lblFederao);
		
		JComboBox cb_fed = new JComboBox();
		cb_fed.setToolTipText("Federa\u00E7\u00E3o do Enxadrista");
		GridBagConstraints gbc_federation = new GridBagConstraints();
		gbc_federation.insets = new Insets(0, 0, 5, 0);
		gbc_federation.gridwidth = 3;
		gbc_federation.fill = GridBagConstraints.HORIZONTAL;
		gbc_federation.gridx = 1;
		gbc_federation.gridy = 2;
		contentPane.add(cb_fed, gbc_federation);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		GridBagConstraints gbc_lblTtulo = new GridBagConstraints();
		gbc_lblTtulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtulo.gridx = 0;
		gbc_lblTtulo.gridy = 3;
		contentPane.add(lblTtulo, gbc_lblTtulo);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Clube");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tf_club = new JTextField();
		GridBagConstraints gbc_tf_club = new GridBagConstraints();
		gbc_tf_club.insets = new Insets(0, 0, 5, 0);
		gbc_tf_club.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_club.gridx = 3;
		gbc_tf_club.gridy = 3;
		contentPane.add(tf_club, gbc_tf_club);
		tf_club.setColumns(10);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridwidth = 4;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 4;
		contentPane.add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Rating");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 4;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 6;
		contentPane.add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Internacional");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 7;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 8;
		contentPane.add(lblId, gbc_lblId);
		
		tf_intlId = new JTextField();
		tf_intlId.setToolTipText("ID do Rating Internacional");
		GridBagConstraints gbc_intlId = new GridBagConstraints();
		gbc_intlId.insets = new Insets(0, 0, 5, 5);
		gbc_intlId.fill = GridBagConstraints.HORIZONTAL;
		gbc_intlId.gridx = 1;
		gbc_intlId.gridy = 8;
		contentPane.add(tf_intlId, gbc_intlId);
		tf_intlId.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating");
		GridBagConstraints gbc_lblRating = new GridBagConstraints();
		gbc_lblRating.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating.gridx = 2;
		gbc_lblRating.gridy = 8;
		contentPane.add(lblRating, gbc_lblRating);
		
		tf_intlRa = new JTextField();
		tf_intlRa.setToolTipText("Rating Internacional\r\n");
		GridBagConstraints gbc_intlRa = new GridBagConstraints();
		gbc_intlRa.insets = new Insets(0, 0, 5, 0);
		gbc_intlRa.fill = GridBagConstraints.HORIZONTAL;
		gbc_intlRa.gridx = 3;
		gbc_intlRa.gridy = 8;
		contentPane.add(tf_intlRa, gbc_intlRa);
		tf_intlRa.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.gridwidth = 4;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 9;
		contentPane.add(separator_2, gbc_separator_2);
		
		JLabel lblPas = new JLabel("Nacional");
		GridBagConstraints gbc_lblPas = new GridBagConstraints();
		gbc_lblPas.insets = new Insets(0, 0, 5, 0);
		gbc_lblPas.gridwidth = 4;
		gbc_lblPas.gridx = 0;
		gbc_lblPas.gridy = 10;
		contentPane.add(lblPas, gbc_lblPas);
		
		JLabel lblId_1 = new JLabel("ID");
		GridBagConstraints gbc_lblId_1 = new GridBagConstraints();
		gbc_lblId_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblId_1.gridx = 0;
		gbc_lblId_1.gridy = 11;
		contentPane.add(lblId_1, gbc_lblId_1);
		
		tf_conId = new JTextField();
		tf_conId.setToolTipText("ID do Rating Nacional");
		GridBagConstraints gbc_couId = new GridBagConstraints();
		gbc_couId.insets = new Insets(0, 0, 5, 5);
		gbc_couId.fill = GridBagConstraints.HORIZONTAL;
		gbc_couId.gridx = 1;
		gbc_couId.gridy = 11;
		contentPane.add(tf_conId, gbc_couId);
		tf_conId.setColumns(10);
		
		JLabel lblRating_1 = new JLabel("Rating");
		GridBagConstraints gbc_lblRating_1 = new GridBagConstraints();
		gbc_lblRating_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating_1.gridx = 2;
		gbc_lblRating_1.gridy = 11;
		contentPane.add(lblRating_1, gbc_lblRating_1);
		
		tf_conRa = new JTextField();
		tf_conRa.setToolTipText("Rating Nacional");
		GridBagConstraints gbc_couRa = new GridBagConstraints();
		gbc_couRa.insets = new Insets(0, 0, 5, 0);
		gbc_couRa.fill = GridBagConstraints.HORIZONTAL;
		gbc_couRa.gridx = 3;
		gbc_couRa.gridy = 11;
		contentPane.add(tf_conRa, gbc_couRa);
		tf_conRa.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_3.gridwidth = 4;
		gbc_separator_3.insets = new Insets(0, 0, 5, 0);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 12;
		contentPane.add(separator_3, gbc_separator_3);
		
		JLabel lblLocal = new JLabel("Local");
		GridBagConstraints gbc_lblLocal = new GridBagConstraints();
		gbc_lblLocal.insets = new Insets(0, 0, 5, 0);
		gbc_lblLocal.gridwidth = 4;
		gbc_lblLocal.gridx = 0;
		gbc_lblLocal.gridy = 13;
		contentPane.add(lblLocal, gbc_lblLocal);
		
		JLabel lblId_2 = new JLabel("ID");
		GridBagConstraints gbc_lblId_2 = new GridBagConstraints();
		gbc_lblId_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblId_2.gridx = 0;
		gbc_lblId_2.gridy = 14;
		contentPane.add(lblId_2, gbc_lblId_2);
		
		tf_locId = new JTextField();
		tf_locId.setToolTipText("ID do Rating Local");
		GridBagConstraints gbc_locId = new GridBagConstraints();
		gbc_locId.insets = new Insets(0, 0, 5, 5);
		gbc_locId.fill = GridBagConstraints.HORIZONTAL;
		gbc_locId.gridx = 1;
		gbc_locId.gridy = 14;
		contentPane.add(tf_locId, gbc_locId);
		tf_locId.setColumns(10);
		
		JLabel lblRating_2 = new JLabel("Rating");
		GridBagConstraints gbc_lblRating_2 = new GridBagConstraints();
		gbc_lblRating_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating_2.gridx = 2;
		gbc_lblRating_2.gridy = 14;
		contentPane.add(lblRating_2, gbc_lblRating_2);
		
		tf_locRa = new JTextField();
		tf_locRa.setToolTipText("Rating Local");
		GridBagConstraints gbc_locRa = new GridBagConstraints();
		gbc_locRa.insets = new Insets(0, 0, 5, 0);
		gbc_locRa.fill = GridBagConstraints.HORIZONTAL;
		gbc_locRa.gridx = 3;
		gbc_locRa.gridy = 14;
		contentPane.add(tf_locRa, gbc_locRa);
		tf_locRa.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 0);
		gbc_separator_4.fill = GridBagConstraints.BOTH;
		gbc_separator_4.gridwidth = 4;
		gbc_separator_4.gridx = 0;
		gbc_separator_4.gridy = 15;
		contentPane.add(separator_4, gbc_separator_4);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		GridBagConstraints gbc_btnLimpar_1 = new GridBagConstraints();
		gbc_btnLimpar_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnLimpar_1.gridheight = 2;
		gbc_btnLimpar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpar_1.gridx = 0;
		gbc_btnLimpar_1.gridy = 16;
		contentPane.add(btnLimpar_1, gbc_btnLimpar_1);
		
		JButton btnLimpar = new JButton("Cancelar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
			}
		});
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpar.gridheight = 2;
		gbc_btnLimpar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpar.gridx = 1;
		gbc_btnLimpar.gridy = 16;
		contentPane.add(btnLimpar, gbc_btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.fill = GridBagConstraints.BOTH;
		gbc_btnCadastrar.gridheight = 2;
		gbc_btnCadastrar.gridwidth = 2;
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrar.gridx = 2;
		gbc_btnCadastrar.gridy = 16;
		contentPane.add(btnCadastrar, gbc_btnCadastrar);
	}

}
