package labo.isoroot.kwkb.task002.q2;

import java.util.ArrayList;

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
        naoya.setAge(15);
        naoya.setSex("男");

        nobuyuki.setName("信幸");
        nobuyuki.setSex("男");

        kana.setName("佳奈");
        kana.setSex("女");

        members.add(yuta);
        members.add(naoya);
        members.add(nobuyuki);
        members.add(kana);

        Family takahashi = new Family(nobuyuki, members);
        takahashi.setAddress("北海道帯広市");
        takahashi.setTel("123-4567");

        Person keiko = new Person();
        keiko.setName("恵子");
        keiko.setAge(4);
        keiko.setSex("女");
        takahashi.addMember(keiko);

        ArrayList<Family> his = takahashi.getHistoryFamily();

    }
}
