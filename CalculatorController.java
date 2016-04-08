package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorController implements ActionListener {
    
	private CalculatorModel model;
	
	
	private CalculatorView view;
	
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Exit")) {
			System.exit(0);
		} else if (command.equals("Two Decimal Digits")) {
			view.setDigits(2);
			view.update(model.getValue());
		} else if (command.equals("Any Decimal Digits")) {
			view.setDigits(-1);
			view.update(model.getValue());
		} else {
			model.update(command);
			view.update(model.getValue());
		}
	}
}
