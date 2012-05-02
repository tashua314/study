package labo.isoroot.kwkb.task002.q1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Person yuta = new Person();
        Person naoya = new Person();
        Person nobuyuki = new Person();
        Person kana = new Person();
        ArrayList<Person> members = new ArrayList<>();

        yuta.setName("雄太");
        yuta.setAge(26);
        yuta.setSex("男");

        naoya.setName("直也");
        naoya.setAge(24);
        naoya.setSex("男");

        nobuyuki.setName("信幸");
        nobuyuki.setSex("男");

        kana.setName("佳奈");
        kana.setSex("女");

        members.add(yuta);
        members.add(naoya);
        members.add(nobuyuki);
        members.add(kana);

        Family takahashi = new Family(members);
        takahashi.setAddress("千葉県松戸市");
        takahashi.setTel("123-4567");
        takahashi.setHouseholder(nobuyuki);

        System.out.println(takahashi.toString());
    }

}
