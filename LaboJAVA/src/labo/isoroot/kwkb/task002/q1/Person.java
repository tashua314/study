package labo.isoroot.kwkb.task002.q1;

/**
 * 個人の情報を持つクラス
 */
public class Person {

    private String name;
    private String sex;
    private String age;


    /**
     * @return name
     */
    public String getName() {

        return name;
    }


    /**
     * @param name
     *            セットする name
     */
    public void setName(String name) {

        this.name = name;
    }


    /**
     * @return sex
     */
    public String getSex() {

        return sex;
    }


    /**
     * @param sex
     *            セットする sex
     */
    public void setSex(String sex) {

        this.sex = sex;
    }


    /**
     * @return age
     */
    public String getAge() {

        return age;
    }


    /**
     * @param age
     *            セットする age
     */
    public void setAge(int age) {

        this.age = String.valueOf(age);
    }

}
