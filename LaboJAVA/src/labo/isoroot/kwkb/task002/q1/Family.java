package labo.isoroot.kwkb.task002.q1;

import java.util.List;

/**
 * 家族の情報を持つクラス
 */
public class Family {

    /** 住所 */
    private String address;
    /** 電話番号 */
    private String tel;
    /** 世帯主 */
    private Person householder;
    /** 構成メンバ */
    private final List<Person> members;

    /**
     * Familyクラスのコンストラクタ<br />
     * @param members 構成メンバ
     */
    public Family(List<Person> members) {

        super();
        this.members = members;
    }

    /**
     * Familyクラスを文字列に変換して返却する。
     * @return Family情報の文字列
     */
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Family [\n" + "  address=");
        builder.append(address);
        builder.append(",\n  tel=");
        builder.append(tel);
        builder.append(",\n  householder=");
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
     * @return address
     */
    public final String getAddress() {

        return address;
    }

    /**
     * @param address セットする address
     */
    public final void setAddress(String address) {

        this.address = address;
    }

    /**
     * @return tel
     */
    public final String getTel() {

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

        return householder;
    }

    /**
     * @param householder セットする householder
     */
    public void setHouseholder(Person householder) {

        this.householder = householder;
    }

    /**
     * @return members
     */
    public List<Person> getMembers() {

        return members;
    }
}
