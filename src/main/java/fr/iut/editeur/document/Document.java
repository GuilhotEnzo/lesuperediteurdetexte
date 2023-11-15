package fr.iut.editeur.document;

import fr.iut.editeur.commande.CommandeAjouter;

/**
 * Classe contenant les méthodes pour moddifier directement le texte de l'utilisateur
 */
public class Document {

    /**
     * Le texte que l'utilisateur édite et que le programme affiche, de type String
     */
    private String texteDocument;

    /**
     * Constructeur de la classe, il initialise texteDocument en tant que String vide
     */
    public Document() {
        this.texteDocument = "";
    }

    /**
     * Permet de récupérer l'attribut privé texteDocument
     * @return Le un String, texteDocument
     */
    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    /**
     * Permet d'ajouter du texte passé en paramètre dans l'éditeur. Il est intéressant de voir la classe {@link CommandeAjouter}
     * @param texte Paramètre de type String
     */
    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String texte2 = this.texteDocument.substring(start, end).toUpperCase();
        remplacer(start, end, texte2);
    }

    public void effacer(int start, int end) {
        String texte2 = "";
        remplacer(start, end, texte2);
    }

    public void clear() {
        remplacer(0, texteDocument.length(), "");
    }

    public void inserer(int index, String texte){
        remplacer(index + 1, index + 1, texte);
    }
    public void minuscules(int start, int end){
        String texte2 = this.texteDocument.substring(start,end).toLowerCase();
        remplacer(start,end,texte2);
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
