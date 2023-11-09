package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument{
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscules;indexDebut;indexFin");
            return;
        }
        int indexDebut = Integer.parseInt(parameters[1]);
        int indexFin = Integer.parseInt(parameters[2]);
        this.document.minuscules(indexDebut, indexFin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet de transformer toutes les lettres entre deux index en miniscules avec le format : minuscules;indexDebut;indexFin";
    }
}
