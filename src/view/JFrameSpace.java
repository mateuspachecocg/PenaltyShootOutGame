package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.C;
import model.JButtonSpace;

public class JFrameSpace extends JFrame {
	JPanel panel;
	JButtonSpace[][] buttonMatrix;

	public JFrameSpace() {
		this.panel = new JPanel();

		panel.setLayout(null);
		buttonMatrix = new JButtonSpace[C.NUM_LINHAS][C.NUM_COLUNAS];
		int n = 0;
		for (int i = 0; i < C.NUM_LINHAS; i++) {
			for (int j = 0; j < C.NUM_COLUNAS; j++) {
				buttonMatrix[i][j] = new JButtonSpace();
				// c.getEspaco(i, j).setButton( buttonMatrix[i][j]);
				// matBut[i][j].linha = i;
				// matBut[i][j].coluna = j;
				// buttonMatrix[i][j].setPos(i, j);
				buttonMatrix[i][j].setSize(C.TAM_ESPACO, C.TAM_ESPACO);
				buttonMatrix[i][j].setFocusable(false);
				buttonMatrix[i][j].setLocation(C.TAM_ESPACO * j, C.TAM_ESPACO * i + C.OFFSET_SUPERIOR);
				// matBut[i][j].setText(Integer.toString(n++));
				panel.add(buttonMatrix[i][j]);

			}
			this.add(panel, BorderLayout.CENTER);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(C.NUM_COLUNAS * C.TAM_ESPACO,
					C.NUM_LINHAS * C.TAM_ESPACO + C.OFFSET_SUPERIOR + C.ALTURA_BARRA_SUP + 20);
			this.setResizable(false);
			this.setVisible(true);
		}

	}
}
