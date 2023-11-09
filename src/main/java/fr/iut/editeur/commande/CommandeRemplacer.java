package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;indexDebut;indexFin;texte");
            return;
        }
        int indexDebut = Integer.parseInt(parameters[1]);
        int indexFin = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(indexDebut, indexFin, texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet de remplacer un texte entre deux index par celui donné avec le format : remplacer;indexDuDebut;indexDeFin;texte;";
    }

}