package labo.isoroot.tkhs.work002;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FormBox {

    private List<Form> formList = null;

    Random random = new Random();

    private final static int FORM_NUM = 3;
    private final static int CIRCLE = 0;
    private final static int TRIANGLE = 1;
    private final static int RECTANGLE = 2;

    public FormBox() {
        formList = new ArrayList<Form>();
        init();
    }

    public FormBox(int num) {
        formList = new ArrayList<Form>(num);
        init();
    }

    public List<Form> getFormList() {

        return formList;
    }

    private void init() {
        for(int i = 0, max = formList.size(); i < max; i++) {
            formList.add(createForm());
        }
    }

    private Form createForm() {
        Form form = null;
        int formType = getFormType(FORM_NUM);
        switch (formType) {
        case CIRCLE:
            form=new Circle();

            break;

        case TRIANGLE:
            form=new Triangle();

            break;

        case RECTANGLE:
            form=new Rectangle();

            break;
        }

        if (form == null) {
            throw new IllegalArgumentException("[" + formType + "]");
        }

        return form;
    }

    private int getFormType(int size) {
        return random.nextInt(size);
    }
}
