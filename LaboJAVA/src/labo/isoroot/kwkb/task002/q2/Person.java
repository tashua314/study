package labo.isoroot.kwkb.task002.q2;

/**
 * 個人の情報を持つクラス
 */
public class Person {

    /** 名前 */
    private String name;
    /** 性別 */
    private String sex;
    /** 年齢 */
    private String age;

    /**
     * nameを返却します。
     *
     * @return name 名前
     */
    public String getName() {
        return name;
    }

    /**
     * nameを設定します。
     *
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sexを返却します。
     *
     * @return sex 性別
     */
    public String getSex() {
        return sex;
    }

    /**
     * sexを設定します。
     *
     * @param sex 性別
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * ageを返却します。
     *
     * @return age 年齢
     */
    public String getAge() {
        return age;
    }

    /**
     * ageを設定します。
     *
     * @param age 年齢
     */
    public void setAge(int age) {
        this.age = String.valueOf(age);
    }

    /* (非 Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }
}
