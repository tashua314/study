package labo.isoroot.kwkb.task002.q2;

import java.util.ArrayList;
import java.util.List;

/**
 * 家族の情報を持つクラス
 */
public class Family implements Cloneable {

    private String address;
    private String tel;
    private Person householder;
    private List<Person> members;
    private ArrayList<String> history = new ArrayList<>();
    private ArrayList<Family> historyFamily = new ArrayList<>();


    /**
     * 家族を作成する。
     *
     * @param housholder
     * @param members
     */
    public Family(Person housholder, List<Person> members) {

        super();
        this.householder = housholder;
        this.members = members;

        this.history.add("家族作成\n");
        this.historyFamily.add(clone());
    }


    /**
     * Familyクラスを文字列に変換して返却する。
     */
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Family [\n" + "  address=");
        builder.append(address);
        builder.append(",\n  tel=");
        builder.append(tel);
        builder.append(",\n  Householder=");
        builder.append(householder.getName());
        builder.append("\n    age=" + householder.getAge());
        builder.append("\n    sex=" + householder.getSex());

        // 構成メンバに世帯主が含まれていた場合の処理
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(householder.getName())) {
                members.remove(i);
            }
        }

        for (int i = 0; i < members.size(); i++) {
            builder.append(",\n  member" + (i + 1) + "=");
            builder.append(members.get(i).getName());
            builder.append("\n    age=" + members.get(i).getAge());
            builder.append("\n    sex=" + members.get(i).getSex());
        }
        builder.append("\n]");

        return builder.toString();
    }


    /**
     * 家族を追加する
     *
     * @param person
     */
    public void addMember(Person person) {

        this.members.add(person);
        this.history.add("家族追加: " + person.getName() +
                "  age=" + person.getAge() +
                "  sex=" + person.getSex() +
                "\n");
        this.historyFamily.add(clone());
    }


    /**
     * Familyクラスのコピーを返す
     */
    public Family clone() {

        Family copyFamily = null;

        try {
            copyFamily = (Family) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copyFamily;
    }


    /**
     * @return address
     */
    public String getAddress() {

        return address;
    }


    /**
     * @param address
     *            セットする address
     */
    public void setAddress(String address) {

        this.address = address;
        this.history.add("住所変更: " + this.getAddress() + "\n");
        this.historyFamily.add(clone());
    }


    /**
     * @return tel
     */
    public String getTel() {

        return tel;
    }


    /**
     * @param tel
     *            セットする tel
     */
    public void setTel(String tel) {

        this.tel = tel;
        this.history.add("電話番号変更: " + this.getTel() + "\n");
        this.historyFamily.add(clone());
    }


    /**
     * @return householder
     */
    public Person getHouseholder() {

        return householder;
    }


    /**
     * @param housholder
     *            セットする householder
     */
    public void setHouseholder(Person householder) {

        this.householder = householder;
        this.history.add("世帯主変更: " + this.householder.getName() +
                "  age=" + this.householder.getAge() +
                "  sex=" + this.householder.getSex() +
                "\n");
        this.historyFamily.add(clone());
    }


    /**
     * @return members
     */
    public List<Person> getMembers() {

        return members;
    }


    /**
     * @return history
     */
    public List<String> getHistory() {

        return history;
    }


    /**
     * @return historyFamily
     */
    public ArrayList<Family> getHistoryFamily() {

        return historyFamily;
    }
}
