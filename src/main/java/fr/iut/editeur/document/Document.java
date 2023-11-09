package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }

    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

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
