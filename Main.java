import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Employe[] tab = new Employe[6];

            tab[0] = new Vendeur("Ahmed", "Saleh", 35,
                    LocalDate.of(2018, 3, 12), 120_000);
            tab[1] = new Representant("Sara", "Benk", 30,
                    LocalDate.of(2019, 6, 1), 90_000);
            tab[2] = new Production("Youssef", "Ali", 29,
                    LocalDate.of(2020, 1, 10), 800);
            tab[3] = new Manutention("Nada", "Amine", 25,
                    LocalDate.of(2021, 9, 5), 160);
            tab[4] = new ProductionARisque("Omar", "Hassan", 32,
                    LocalDate.of(2017, 11, 20), 900);
            tab[5] = new ManutentionARisque("Leila", "Karim", 27,
                    LocalDate.of(2022, 2, 15), 170);

            double somme = 0.0;

            System.out.println("Salaires des employés :");
            for (Employe e : tab) {
                double s = e.salary();
                System.out.println(e.getNom() + " -> " + s + " Dh");
                somme += s;
            }

            double moyenne = somme / tab.length;
            System.out.println("Salaire moyen de l'entreprise : " + moyenne + " Dh");

        } catch (Employe_Exception ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
}
