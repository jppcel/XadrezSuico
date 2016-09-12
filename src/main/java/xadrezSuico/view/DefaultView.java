package xadrezSuico.view;

import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import xadrezSuico.DBCreator;
import xadrezSuico.SoftwareProperties;

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
		
		JMenuItem mntmEditarEnxadrista = new JMenuItem("Listar Enxadristas");
		mnPessoa.add(mntmEditarEnxadrista);
		
		JMenuItem mntmExportarEnxadristas = new JMenuItem("Exportar Enxadristas");
		mnPessoa.add(mntmExportarEnxadristas);
		
		JMenu mnrbitro = new JMenu("Árbitro");
		menuBar.add(mnrbitro);
		
		JMenuItem mntmNovoArbitro = new JMenuItem("Novo \u00C1rbitro");
		mnrbitro.add(mntmNovoArbitro);
		
		JMenuItem mntmEditarrbitro = new JMenuItem("Listar Árbitros");
		mnrbitro.add(mntmEditarrbitro);
		
		JMenuItem mntmExportarrbitros = new JMenuItem("Exportar \u00C1rbitros");
		mnrbitro.add(mntmExportarrbitros);
		mntmNovoArbitro.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e) {
				NewReferee nr = new NewReferee();
				nr.setVisible(true);
			}
		});
		
		JMenu mnClube = new JMenu("Clube");
		menuBar.add(mnClube);
		
		JMenuItem mntmNovoClube = new JMenuItem("Novo Clube");
		mntmNovoClube.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				NewClub nc = new NewClub();
				nc.setVisible(true);
			}
		});
		mnClube.add(mntmNovoClube);
		
		JMenuItem mntmEditarClube = new JMenuItem("Listar Clubes");
		mnClube.add(mntmEditarClube);
		
		JMenuItem mntmExportarClubes = new JMenuItem("Exportar Clubes");
		mnClube.add(mntmExportarClubes);
		
		JMenu mnTorneio = new JMenu("Torneio");
		menuBar.add(mnTorneio);
		
		JMenuItem mntmOpesDoTorneio = new JMenuItem("Novo Torneio");
		mnTorneio.add(mntmOpesDoTorneio);
		
		JMenuItem mntmExportarTorneio = new JMenuItem("Abrir Torneio");
		mnTorneio.add(mntmExportarTorneio);
		
		JMenuItem mntmExportarTorneios = new JMenuItem("Exportar Torneio(s)");
		mnTorneio.add(mntmExportarTorneios);
		
		JMenu mnConfiguraes = new JMenu("Configurações");
		menuBar.add(mnConfiguraes);
		
		JMenuItem mntmRestaurarBancoDe = new JMenuItem("Restaurar Banco de Dados ao Padrão");
		mntmRestaurarBancoDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				DBCreator db = new DBCreator();
				db.restoreDatabaseDefault();
			}
		});
		
		JMenuItem mntmCriarBancoDe = new JMenuItem("Criar Banco de Dados");
		mntmCriarBancoDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				DBCreator db = new DBCreator();
				db.createDatabase();
			}
		});
		mnConfiguraes.add(mntmCriarBancoDe);
		mnConfiguraes.add(mntmRestaurarBancoDe);
		
		JSeparator separator_2 = new JSeparator();
		mnConfiguraes.add(separator_2);
		
		JMenuItem mntmCriarPropriedades = new JMenuItem("Criar Propriedades");
		mntmCriarPropriedades.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				new SoftwareProperties(1);
			}
		});
		mnConfiguraes.add(mntmCriarPropriedades);
		
		JPanel panelTitle = new JPanel();
		getContentPane().add(panelTitle, BorderLayout.NORTH);
		
		JLabel lblSejaBemvindoAo = new JLabel("Seja bem-vindo ao Xadrez Su\u00ED\u00E7o");
		lblSejaBemvindoAo.setFont(new Font("Arial", Font.BOLD, 24));
		panelTitle.add(lblSejaBemvindoAo);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.SOUTH);
		
		JLabel lblXadrezSuio = new JLabel("� " + Calendar.getInstance().get(Calendar.YEAR) + " Xadrez Sui\u00E7o - Todos os Direitos Reservados. Software open-source licenciado sob a licen\u00E7a MIT.");
		panelContent.add(lblXadrezSuio);
		
		
	}
}
