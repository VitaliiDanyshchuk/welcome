package dan.edu.welcome.form;

public class CafedraForm {


    private String id;
    private String name;
    private String desk;
    private String chief;


    public CafedraForm() {
    }

    public CafedraForm(String id, String name, String desk, String chief) {
        this.id = id;
        this.name = name;
        this.desk = desk;
        this.chief = chief;
    }


    public CafedraForm(String name, String desk, String chief) {
        this.name = name;
        this.desk = desk;
        this.chief = chief;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }
}
