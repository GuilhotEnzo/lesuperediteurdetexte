package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe permettant d'ajouter du texte dans l'éditeur
 */
public class CommandeAjouter extends CommandeDocument {


    /**
     * Constructeur de la classe. Voir {@link CommandeDocument#CommandeDocument}
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    public String getDescriptionCommande(){
        return "Permet d'ajouter du texte avec le format : ajouter;texte;";
    }

}
