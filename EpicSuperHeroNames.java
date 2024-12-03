
//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac EpicSuperHeroNames.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez générer un nom :
//java EpicSuperHeroNames

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy


import java.util.Random;

public class EpicSuperHeroNames {

    // Listes d'adjectifs et de noms pour générer des super-héros improbables
    private static final String[] adjectives = {
        "Biscornu", "Déjanté", "Ébouriffé", "Enorme", "Épique", "Explosif", "Flamboyant", "Fou", "Foudroyant", "Gargantuesque", "Galimatias", "Géant", "Héroïque", "Hirsute", "Imparable", "Incroyable", "Invisible", "Légendaire", "Loufoque","Maladroit", "Mauvais", "Mystérieux", "Niaiseux", "Pétillant", "Pifométrique", "Sombre", "Super", "Tordant", "Vengeur", "Zinzolin"
    };

    private static final String[] animals = {
        "Diplodocus", "Cactus", "Panda", "Dragon", "Licorne", "Kangourou", "Tigre", "Blobfish", "Serpent", "Loup", "Marmotte", "Chat", "Chien", "Loutre", "Cheval", "Ornithorynque", "Poupouffe", "Zébrinut", "Zèbre", "Lapinou", "Lapin", "Pandabidule", "Chatonou", "Écureuilix", "Écureuille", "Renardinet", "Renard", "Hippocampouet", "Hippocampe", "Koalapalooza", "Koala", "Bébéctopus", "Poulpe", "Octopus", "Chéchruchon", "Wombatouille", "Wombat","Tigre", "Tigronet", "Sourissotte","Souris", "Kangourie", "Boubourien", "Poussinou", "Éléphun", "Ratoncafé", "Marmottruc", "Chouettouille", "Pinguinou", "Castorgnon", "Licornezet", "Oursonnet", "Lézarc-en-ciel", "Hérissonnet", "Grenouillette", "Loutrete", "Draguinou",
        "Babouin", "Poussin", "Éléphant", "Raton", "Marmotte", "Chouette", "Pinguin", "Castor", "Ours", "Lézard", "Hérisson", "Grenouille", "Furet"
    };

    private static final String[] special = {
        "Bouclier gélatine", "Étoilé", "à Plantes cosmiques", "aux Chaussures volantes", "Lanceur Éclair aux Chocolats", "Dompteur de Balles explosives", "Magma", "à la Tablette techno", "Puant", "Microscopique", "Pelucheux", "Doudou", "Maxi Tétine", "aux Câlinoux dodo", "Lanceur Étoiles filantes", "à la Lanterne Magique", "au Radio réveil rétro", "de la Boîte à musique", "de la Tasse", "à Paillettes", "aux Lasers Arc-en-ciel", "au Mini Ventilo", "Fantaisie", "au Casque", "Décoré", "Mignon", "à la Bougie", "Glacière"
    };

    public static void main(String[] args) {
        Random random = new Random();

        // Générer un nom de super-héros
        String adjective = adjectives[random.nextInt(adjectives.length)];
        String animal = animals[random.nextInt(animals.length)];
        String object = special[random.nextInt(special.length)];

        // Créer le nom du super-héros
        String superheroName = adjective + " " + animal + " " + object;

        // Afficher le nom dans le terminal
        System.out.println("TADA ! Voilà ton nom de Super-Héros Épique !  Tu es " + superheroName + " !!");
    }
}

//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac EpicSuperHeroNames.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez générer un nom :
//java EpicSuperHeroNames

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy
