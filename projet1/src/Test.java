/**
 * 
 */
package test;

/**
 * @author Maxime
 *
 */
public class Test {
	
	protected String nom;
	protected int valeur;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * author : Maxime
	 *
	 * @param nom
	 * @param valeur
	 */
	public Test(String nom, int valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * author : Maxime
	 *
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public String Echo(){
		return "Test: mon nom est " + getNom() + " et ma valeur est " + getValeur();
	}
	
	public String Echo(String s){
		return s;
	}

	/**
	 * author : Maxime
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test("Maxime", 1);
		System.out.println(test1.Echo());
	}

}
