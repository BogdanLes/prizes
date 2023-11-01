package ro.scoalainformala;

import ro.scoalainformala.inventory.*;

import java.util.*;

public class Prize {
    public static void main(String[] args) {

        //toys list
        List<Toys> availableToys = new ArrayList<>();
        availableToys.add(new Toys("Train", 3));
        availableToys.add(new Toys("Plane", 1));
        availableToys.add(new Toys("Car", 5));
        availableToys.add(new Toys("Doll", 4));
        availableToys.add(new Toys("Barby", 2));
        int k = availableToys.size() - 1;
        //availableToys.get(2).setStock(111);
        //availableToys.remove(2);

        //children list
        List<Child> children = new LinkedList<>();
        children.add(new Child("Oana", 11));
        children.add(new Child("Ana", 12));
        children.add(new Child("Tom", 7));
        children.add(new Child("Arnold", 9));

        /*
        for(Toys avt : availableToys) {
            System.out.print(availableToys.indexOf(avt));
            System.out.println(avt);
        }
        */
        //System.out.println(availableToys.get(2));
        //System.out.println(availableToys.get(2).getType());

        // set with given prizes
        Set<PrizeOffered> prizesGiven = new TreeSet<>();

        Scanner s = new Scanner(System.in);
        int o = -1;
        for (Child ch : children) {
            //System.out.println(ch);
            System.out.println(ch.getName() + " select a toy(0-" + k + "):");
            for (Toys avt : availableToys) {
                System.out.print(availableToys.indexOf(avt) + " - ");
                System.out.println(avt);
            }
            o = -1;
            do {
                System.out.print("Option: ");
                o = s.nextInt();
            } while (o < 0 || o > k);

            ch.setToy(availableToys.get(o).getType());
            int vs = availableToys.get(o).getStock() - 1;
            availableToys.get(o).setStock(vs);
            int givenprize = availableToys.get(o).getOffered() + 1;
            availableToys.get(o).setOffered(givenprize);
            String toySelected = availableToys.get(o).getType();
            if (vs == 0) {
                k--;
                availableToys.remove(o);
            }

            //add toy to set of given toys
            //String toySelected = availableToys.get(o).getType();
            PrizeOffered selectedprize = new PrizeOffered(toySelected, givenprize);
            if (prizesGiven.contains(selectedprize)) {
                prizesGiven.remove(selectedprize);
                prizesGiven.add(selectedprize);
            } else {
                prizesGiven.add(selectedprize);
            }

        }

        // what the chids have selected
        System.out.println("\nChildren that have taken prizes:");
        for (Child ch : children) {
            System.out.println(ch);
        }

        // what are the prizes that have been offered
        System.out.println("\nPrizes that have been given:");
        for (PrizeOffered po : prizesGiven) {
            System.out.println(po);
        }

    }
}