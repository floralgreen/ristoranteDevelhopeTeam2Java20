public enum GenderEnum {

    MALE("maschio"),
    FEMALE("femmina"),
    UNSPECIFIED("non specificato");

    private String genderAsString;

    GenderEnum(String genderAsString){
        this.genderAsString = genderAsString;
    }

    public String getGenderAsString() {
        return genderAsString;
    }

    @Override
    public String toString() {
        return genderAsString;
    }
}
