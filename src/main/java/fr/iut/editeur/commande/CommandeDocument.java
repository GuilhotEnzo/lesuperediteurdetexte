package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Abstract class qui est la classe mère de toutes les classes Commande
 */
public abstract class CommandeDocument implements Commande {

    /**
     * Attribut document de type Document
     */
    protected Document document;

    /**
     * Attribut parameters qui est un tableau de String
     */
    protected String[]parameters;

    /**
     * Constructeur de la classe abstract
     * @param document paramètre de type Document
     * @param parameters paramètre de type tableau de String
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
