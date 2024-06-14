import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doorgaan = true;

        while (doorgaan) {
            Klant klant = maakNieuweKlant(scanner);
            Factuur factuur = maakNieuweFactuur(scanner, klant);

            FactuurPrinter factuurPrinter = new FactuurPrinter();
            factuurPrinter.printFactuur(factuur);

            doorgaan = verwerkGebruikersKeuze(scanner, factuur);
        }
        scanner.close();
    }

    private static Klant maakNieuweKlant(Scanner scanner) {
        System.out.println("Voer de klant gegevens in:");
        System.out.print("De klant naam: ");
        String klantNaam = scanner.nextLine();

        System.out.print("Het klant adres: ");
        String klantAdres = scanner.nextLine();

        System.out.print("De klant postcode: ");
        String klantPostcode = scanner.nextLine();


        return new Klant(klantNaam, klantAdres, klantPostcode);
    }

    private static Factuur maakNieuweFactuur(Scanner scanner, Klant klant) {
        System.out.println("\nVoer de reparatie gegevens in: ");
        System.out.print("De factuurnummer: ");
        int factuurNummer = scanner.nextInt();

        scanner.nextLine();
        System.out.print("De omschrijving (van arbeid): ");
        String omschrijving = scanner.nextLine();

        System.out.print("De prijs exclusief BTW: €");
        double prijsExclusiefBtw = scanner.nextDouble();

        System.out.print("De prijs inclusief BTW: €");
        double prijsInclusiefBtw = scanner.nextDouble();

        Prijs prijs = new Prijs(prijsExclusiefBtw, prijsInclusiefBtw);

        return new Factuur(factuurNummer, klant, omschrijving, prijs);
    }

private static boolean verwerkGebruikersKeuze(Scanner scanner, Factuur factuur) {
            System.out.println("\nKies een optie:");
            System.out.println("1. De factuur opslaan");
            System.out.println("2. De factuur bewerken");
            System.out.println("3. De factuur verwijderen");
            System.out.println("4. Het systeem verlaten");

            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
                    FactuurOpslag factuurOpslag = new FactuurOpslag();
                    factuurOpslag.saveFactuur(factuur);
                    break;

                case 2:
                    FactuurEditor factuurEditor = new FactuurEditor();
                    factuurEditor.editFactuur(factuur);
                    break;

                case 3:
                    FactuurVerwijderaar factuurVerwijderaar = new FactuurVerwijderaar();
                    factuurVerwijderaar.deleteFactuur(factuur.getFactuurnummer());
                    break;

                case 4:
                    return false;
                default:
                    System.out.println("Ongeldige optie.");
            }
            return true;
        }
    }