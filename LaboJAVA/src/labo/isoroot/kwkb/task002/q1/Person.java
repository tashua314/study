package labo.isoroot.kwkb.task002.q1;

/**
 * 個人の情報を持つクラス
 */
public class Person {

    /** 名前. */
    private String name;
    /** 性別 */
    private String sex;
    /** 年齢 */
    private String age;

    /**
     * @return name
     */
    public final String getName() {

        return name;
    }

    /**
     * @param name セットする name
     */
    public final void setName(String name) {

        this.name = name;
    }

    /**
     * @return sex
     */
    public final String getSex() {

        return sex;
    }

    /**
     * @param sex セットする sex
     */
    public final void setSex(String sex) {

        this.sex = sex;
    }

    /**
     * @return age
     */
    public final String getAge() {

        return age;
    }

    /**
     * @param age セットする age
     */
    public final void setAge(int age) {

        this.age = String.valueOf(age);
    }

}
