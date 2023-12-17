public class Pet {
    private String Name;
    private String Id;
    private String Image;
    private String Type;
    private int Age;
    private String StatusOfAdoption;
    private String StatusOfTreatment;
    private boolean Adopted;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getStatusOfAdoption() {
        return StatusOfAdoption;
    }

    public void setStatusOfAdoption(String statusOfAdoption) {
        StatusOfAdoption = statusOfAdoption;
    }

    public String getStatusOfTreatment() {
        return StatusOfTreatment;
    }

    public void setStatusOfTreatment(String statusOfTreatment) {
        StatusOfTreatment = statusOfTreatment;
    }

    public boolean isAdopted() {
        return Adopted;
    }

    public void setAdopted(boolean adopted) {
        Adopted = adopted;
    }
}
