package seminar3;

import seminar3.impl.CatDrug;
import seminar3.impl.components.Azitron;
import seminar3.impl.components.Penicillin;
import seminar3.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1),
                new Azitron("Азитрон", "2", 4));
        List<Component> componentCat2 = List.of(new Azitron("Азитрон", "4", 4),
                new Penicillin("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat5 = List.of(new Azitron("Азитрон", "4", 4),
                new Penicillin("Пинецилин", "20", 6));

        // Создаем лекарства на основе других компонентов

        CatDrug utrovar = new CatDrug(componentCat, "utrovar");
        CatDrug retrostin = new CatDrug(componentCat2, "retrostin");
        CatDrug novakor = new CatDrug(componentCat2, "novakor");
        CatDrug pektusin = new CatDrug(componentCat3, "pektusin");
        CatDrug catpet = new CatDrug(componentCat4, "catpet");
        CatDrug rascan = new CatDrug(componentCat5, "rascan ");

        // Создаем список лекарств
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(utrovar);
        drugs.add(retrostin);
        drugs.add(novakor);
        drugs.add(pektusin);
        drugs.add(catpet);
        drugs.add(rascan);


        Collections.sort(drugs);
        System.out.println("Список лекарств");
        for (CatDrug item : drugs) {
            System.out.println(item);
        }

        System.out.println("Component componentCat: ");
        System.out.println(componentCat);
        System.out.println("Hashcodes componentCat: ");
        for (Component component : componentCat) {
            System.out.println(component.hashCode());
        }

        Set<Component> result = new HashSet<>(componentCat);
        System.out.println("Result unique list of componentCat: ");
        System.out.println(result);
        for (Component res : result) {
            System.out.println(res.hashCode());
        }
    }
}