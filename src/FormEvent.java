import java.util.EventObject;

public class FormEvent extends EventObject {

    private final String name;
    private final String occupation;
    private final int ageCategory;
    private final String empCat;
    private final String taxId;
    private final boolean usCitizen;
    private final String gender;

    public FormEvent(Object source, String name, String occupation, int ageCat, String empCat,
                     String taxId, boolean usCitizen, String gender) {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

    public String getTaxId() {
        return taxId;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getEmpCat() {
        return empCat;
    }

    public String getGender() { return gender; }
}
