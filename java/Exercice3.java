class Exercice3 {
    public static void main(String[] args) {
        // A modifier les valeurs ici pour vérifier le bon fonctionnement du code
        boolean isChild = true;
        boolean isRegistred = true;

        int movieTicketPrice = 10;

        if (isChild == true) {
            movieTicketPrice -= 4;
        }
        if (isRegistred != true) {
            movieTicketPrice += 2;
        }
        System.out.println("Le prix du ticket est de : " + movieTicketPrice);

    }
}