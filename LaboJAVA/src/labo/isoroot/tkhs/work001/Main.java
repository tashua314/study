package labo.isoroot.tkhs.work001;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ReflectionRefrection refref = new ReflectionRefrection();

        Class refClass = refref.getClass();
        try {
            Class refClass2 = Class.forName("labo.isoroot.tkhs.work001.ReflectionRefrection");
            Method m[] = refClass2.getDeclaredMethods();
            for (Method mm : m) {
                System.out.println(m.toString());
            }

        } catch (ClassNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

        int mods = refClass.getModifiers();

        System.out.println(refClass.getName());
        System.out.println(Modifier.isPublic(mods));
        System.out.println(Modifier.isPrivate(mods));
        System.out.println(Modifier.toString(mods));

    }

}
