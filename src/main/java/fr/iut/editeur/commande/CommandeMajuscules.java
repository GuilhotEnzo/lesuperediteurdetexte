package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {


    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;indexDebut;indexFin");
            return;
        }
        int indexDebut = Integer.parseInt(parameters[1]);
        int indexFin = Integer.parseInt(parameters[2]);
        this.document.majuscules(indexDebut, indexFin);
        super.executer();
    }

}