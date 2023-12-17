import java.util.ArrayList;
import java.util.List;

public class Vet extends person{
    private int YearsOfExperience;

    public List<Pet> pets = new ArrayList<>();

//    Pet pet1;
//    public List<Pet> setdata()
//    {
//        pet1=new Pet();
//        pet1.setName("Ahmed");
//        pet1.setAge(3);
//        pet1.setAdopted(false);
//        pet1.setId("753951");
//        pet1.setStatusOfAdoption("ready");
//        pet1.setType("dog");
//        pet1.setImage("no");
//        pets.add(pet1);
//
//        pet1=new Pet();
//        pet1.setName("Aya");
//        pet1.setAge(3);
//        pet1.setAdopted(false);
//        pet1.setId("753951");
//        pet1.setStatusOfAdoption("ready");
//        pet1.setType("dog");
//        pet1.setImage("no");
//        pets.add(pet1);
//
//        pet1=new Pet();
//        pet1.setName("Ali");
//        pet1.setAge(3);
//        pet1.setAdopted(false);
//        pet1.setId("753951");
//        pet1.setStatusOfAdoption("ready");
//        pet1.setType("dog");
//        pet1.setImage("no");
//        pets.add(pet1);
//
//        pet1=new Pet();
//        pet1.setName("Nada");
//        pet1.setAge(3);
//        pet1.setAdopted(false);
//        pet1.setId("753951");
//        pet1.setStatusOfAdoption("ready");
//        pet1.setType("dog");
//        pet1.setImage("no");
//        pets.add(pet1);
//
//        return pets;
//    }
//
//    public void display()
//    {
//        for (int i=0;i<pets.size();i++)
//        {
//            Pet pet2=new Pet();
//            pet2=pets.get(i);
//            System.out.println(pet2.getName());
//            System.out.println(pet2.getId());
//            System.out.println(pet2.getImage());
//            System.out.println(pet2.getAge());
//            System.out.println(pet2.getStatusOfAdoption());
//            System.out.println(pet2.getStatusOfTreatment());
//            System.out.println(pet2.getType());
//        }
//    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }
}
