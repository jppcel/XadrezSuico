package xadrezSuico.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.util.Calendar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -667634039112657313L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultView frame = new DefaultView();
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
	public DefaultView() {
		setTitle("Xadrez Su\u00ED\u00E7o 0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNovoTorneio = new JMenuItem("Novo Torneio");
		mnArquivo.add(mntmNovoTorneio);
		
		JMenuItem mntmSalvarTorneio = new JMenuItem("Salvar Torneio");
		mnArquivo.add(mntmSalvarTorneio);
		
		JMenuItem mntmAbrirTorneio = new JMenuItem("Abrir Torneio");
		mnArquivo.add(mntmAbrirTorneio);
		
		final JPanel panelC = new JPanel();
		getContentPane().add(panelC, BorderLayout.CENTER);
		
		JSeparator separator = new JSeparator();
		mnArquivo.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		mnArquivo.add(mntmSair);
		
		JMenu mnPessoa = new JMenu("Enxadrista");
		menuBar.add(mnPessoa);
		
		JMenuItem mntmNovoEnxadrista = new JMenuItem("Novo Enxadrista");
		mntmNovoEnxadrista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				NewPlayer np = new NewPlayer();
				np.setVisible(true);
			}
		});
		mnPessoa.add(mntmNovoEnxadrista);
		
		JMenuItem mntmEditarEnxadrista = new JMenuItem("Editar Enxadrista");
		mnPessoa.add(mntmEditarEnxadrista);
		
		JMenuItem mntmExportarEnxadristas = new JMenuItem("Exportar Enxadristas");
		mnPessoa.add(mntmExportarEnxadristas);
		
		JSeparator separator_1 = new JSeparator();
		mnPessoa.add(separator_1);
		
		JMenuItem mntmNovoArbitro = new JMenuItem("Novo \u00C1rbitro");
		mnPessoa.add(mntmNovoArbitro);
		
		JMenuItem mntmEditarrbitro = new JMenuItem("Editar \u00C1rbitro");
		mnPessoa.add(mntmEditarrbitro);
		
		JMenuItem mntmExportarrbitros = new JMenuItem("Exportar \u00C1rbitros");
		mnPessoa.add(mntmExportarrbitros);
		
		JMenu mnTorneio = new JMenu("Torneio");
		menuBar.add(mnTorneio);
		
		JMenuItem mntmOpesDoTorneio = new JMenuItem("Op\u00E7\u00F5es do Torneio");
		mnTorneio.add(mntmOpesDoTorneio);
		
		JMenuItem mntmExportarTorneio = new JMenuItem("Exportar Torneio");
		mnTorneio.add(mntmExportarTorneio);
		
		JPanel panelTitle = new JPanel();
		getContentPane().add(panelTitle, BorderLayout.NORTH);
		
		JLabel lblSejaBemvindoAo = new JLabel("Seja bem-vindo ao Xadrez Su\u00ED\u00E7o");
		lblSejaBemvindoAo.setFont(new Font("Arial", Font.BOLD, 24));
		panelTitle.add(lblSejaBemvindoAo);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.SOUTH);
		
		JLabel lblXadrezSuio = new JLabel("© " + Calendar.getInstance().get(Calendar.YEAR) + " Xadrez Sui\u00E7o - Todos os Direitos Reservados. Software open-source licenciado sob a licen\u00E7a MIT.");
		panelContent.add(lblXadrezSuio);
		
		
	}
}
