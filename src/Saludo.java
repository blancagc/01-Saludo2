import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
/**
 * 
 * @author Blanca
 *
 */
public class Saludo {
	public static void main(String[] args) {
		
		
		
		String nombre = "Blanca";
		String edad = "21";
		//System.out.println("Hola " + nombre);
		//System.out.printf("Hola: %s " ,nombre);//otra forma de concatenar es usando %s " ,
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es %s años ", nombre, edad));
	}

}
