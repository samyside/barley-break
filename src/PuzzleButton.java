import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PuzzleButton extends JButton {
	private boolean lastButton;

	public PuzzleButton() {
		super();
		initUI();
	}

	public PuzzleButton(Image img) {
		super(new ImageIcon(img));
		initUI();
	}

	private void initUI() {
		lastButton = false;

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBorder(BorderFactory.createLineBorder(Color.yellow));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBorder(BorderFactory.createLineBorder(Color.gray));
			}
		});
	}

	public boolean isLastButton() {
		return lastButton;
	}

	public void setLastButton(boolean lastButton) {
		this.lastButton = lastButton;
	}
}
