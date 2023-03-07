package bio.ferlab.itw.part1.javaimpl;

import java.util.*;

public class Variant {
    private String chromosome;
    private Long start;

    private String reference;

    private String alternate;

    private Gene gene;


    public Variant(String chromosome, Long start, String reference, String alternate, Gene gene) {
        this.chromosome = chromosome;
        this.start = start;
        this.reference = reference;
        this.alternate = alternate;
        this.gene = gene;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }

    public static Set<String> CANCERS = new HashSet<>(Arrays.asList("Ganglioma", "Neuroblastoma"));

    public static List<List<String>> splitByImpact(List<Variant> variants) {
        throw new IllegalStateException("Not yet implemented");
    }

    public static List<String> cancers(List<Variant> variants) {
        throw new IllegalStateException("Not yet implemented");
    }

    public static Map<String, List<String>> groupByGene(List<Variant> variants) {
        throw new IllegalStateException("Not yet implemented");
    }

    public String getAlternate() {
        return alternate;
    }

    public void setAlternate(String alternate) {
        this.alternate = alternate;
    }
}
