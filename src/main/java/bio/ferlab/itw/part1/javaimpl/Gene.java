package bio.ferlab.itw.part1.javaimpl;

import java.util.Set;

public class Gene {
    private String name;
    private Set<String> diseases;

    public Gene(String name, Set<String> diseases) {
        this.name = name;
        this.diseases = diseases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(Set<String> diseases) {
        this.diseases = diseases;
    }
}
