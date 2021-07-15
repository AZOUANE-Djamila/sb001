package springdata.master15_si_azouanedjamila;


public class Wilaya {
	private long id,wilaya_pkey;
	private boolean actif;
	private int compte_creation,compte_maj;
	private String date_creation,date_maj,nom_arabe,nom_latin, nom_tamazight;
	public Wilaya(long id, boolean actif, int compte_creation, int compte_maj, String date_creation,
			String date_maj, String nom_arabe, String nom_latin, String nom_tamazight) {
		super();
		this.id = id;
		this.actif = actif;
		this.compte_creation = compte_creation;
		this.compte_maj = compte_maj;
		this.date_creation = date_creation;
		this.date_maj = date_maj;
		this.nom_arabe = nom_arabe;
		this.nom_latin = nom_latin;
		this.nom_tamazight = nom_tamazight;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the actif
	 */
	public boolean isActif() {
		return actif;
	}
	/**
	 * @param actif the actif to set
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	/**
	 * @return the compte_creation
	 */
	public int getCompte_creation() {
		return compte_creation;
	}
	/**
	 * @param compte_creation the compte_creation to set
	 */
	public void setCompte_creation(int compte_creation) {
		this.compte_creation = compte_creation;
	}
	/**
	 * @return the compte_maj
	 */
	public int getCompte_maj() {
		return compte_maj;
	}
	/**
	 * @param compte_maj the compte_maj to set
	 */
	public void setCompte_maj(int compte_maj) {
		this.compte_maj = compte_maj;
	}
	/**
	 * @return the date_creation
	 */
	public String getDate_creation() {
		return date_creation;
	}
	/**
	 * @param date_creation the date_creation to set
	 */
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	/**
	 * @return the date_maj
	 */
	public String getDate_maj() {
		return date_maj;
	}
	/**
	 * @param date_maj the date_maj to set
	 */
	public void setDate_maj(String date_maj) {
		this.date_maj = date_maj;
	}
	/**
	 * @return the nom_arabe
	 */
	public String getNom_arabe() {
		return nom_arabe;
	}
	/**
	 * @param nom_arabe the nom_arabe to set
	 */
	public void setNom_arabe(String nom_arabe) {
		this.nom_arabe = nom_arabe;
	}
	/**
	 * @return the nom_latin
	 */
	public String getNom_latin() {
		return nom_latin;
	}
	/**
	 * @param nom_latin the nom_latin to set
	 */
	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
	}
	/**
	 * @return the nom_tamazight
	 */
	public String getNom_tamazight() {
		return nom_tamazight;
	}
	/**
	 * @param nom_tamazight the nom_tamazight to set
	 */
	public void setNom_tamazight(String nom_tamazight) {
		this.nom_tamazight = nom_tamazight;
	}
	@Override
	public String toString() {
		return "- Wilaya id: "+ getId()+"\n\t Le compte de création: "+getCompte_creation() +"\n\t compte de la mise à jour: "+ getCompte_maj()+"\n\t Date de création: "+ getDate_creation()+"\n\t Date de mis à jour: "+ getDate_maj()+"\n\t La wilaya est elle Active? "+ isActif() +"\n\t Nom en latin:" + getNom_latin() + "\n\t Nom en Arabe:" + getNom_arabe()+ "\n\t Nom en Tamazight:" + getNom_tamazight()+"\n";
	}
	
	
	
}
