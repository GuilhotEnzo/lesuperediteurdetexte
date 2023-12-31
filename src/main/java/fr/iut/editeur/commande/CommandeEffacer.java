package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;indexDebut;indexFin");
            return;
        }
        int indexDebut = Integer.parseInt(parameters[1]);
        int indexFin = Integer.parseInt(parameters[2]);
        this.document.effacer(indexDebut, indexFin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet d'effacer le texte compris entre deux index avec le format : effacer;indexDuDebut;indexDeFin;";
    }

}