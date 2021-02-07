package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String firstName;
    private String schoolName;

    public Principal(String firstName, String schoolName) {
        this.firstName = firstName;
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, schoolName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getFirstname() {
        return firstName;
    }
}
