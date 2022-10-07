import javax.swing.JOptionPane;

class Students{
	private String NPM;
	
	public String getNPM() {
		return NPM;
	}
	public void setNPM(String nPM) {
		NPM = nPM;
	}
}

public class Latihan_01 {

	public static void main(String[] args) {
		Students mybio = new Students();
		JOptionPane jop = new JOptionPane();
		
		String NPM = jop.showInputDialog(null,"Please insert you NPM:","Form Input");
		if(NPM.equals("")) {
		jop.showMessageDialog(null, "NPM tidak boleh kosong","Error message", jop.ERROR_MESSAGE);
		}else if(NPM.length() > 5) {
		jop.showMessageDialog(null, "Minimum 1 digit dan maximum 5 digit","Error message", jop.WARNING_MESSAGE);
		}else {
		mybio.setNPM(NPM);
		jop.showMessageDialog(null, "Your NPM is "+mybio.getNPM(),"Success",jop.INFORMATION_MESSAGE);
		}
	}
}