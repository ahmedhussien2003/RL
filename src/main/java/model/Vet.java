package model;

import java.util.ArrayList;
import java.util.List;

public class Vet extends person{
    private int YearsOfExperience;

    public List<Pet> pets = new ArrayList<>();

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }
}
