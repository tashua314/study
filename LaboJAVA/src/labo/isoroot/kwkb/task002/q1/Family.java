package labo.isoroot.kwkb.task002.q1;

import java.util.List;

/**
 * 家族の情報を持つクラス
 */
public class Family {

    private String address;
    private String tel;
    private Person Householder;
    private final List<Person> members;

    public Family(List<Person> members) {

        super();
        this.members = members;
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
        builder.append(Householder.getName());
        builder.append("\n    age=" + Householder.getAge());
        builder.append("\n    sex=" + Householder.getSex());

        // 構成メンバに世帯主が含まれていた場合の処理
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(Householder.getName())) {
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
     * @return address
     */
    public String getAddress() {

        return address;
    }

    /**
     * @param address セットする address
     */
    public void setAddress(String address) {

        this.address = address;
    }

    /**
     * @return tel
     */
    public String getTel() {

        return tel;
    }

    /**
     * @param tel セットする tel
     */
    public void setTel(String tel) {

        this.tel = tel;
    }

    /**
     * @return householder
     */
    public Person getHouseholder() {

        return Householder;
    }

    /**
     * @param householder セットする householder
     */
    public void setHouseholder(Person householder) {

        Householder = householder;
    }

    /**
     * @return members
     */
    public List<Person> getMembers() {

        return members;
    }
}
