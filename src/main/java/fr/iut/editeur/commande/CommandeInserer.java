package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : inserer;index;texte");
            return;
        }
        int index = Integer.parseInt(parameters[1]);
        String text = parameters[2];
        this.document.inserer(index, text);
        super.executer();
    }
}
