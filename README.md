Ferlab Big Data interview 
=============

# Part 1: Scala basics

**Objectif :** Faire passer les tests dans le fichier `bio.ferlab.itw.part1.Part1Spec` (ou dans le fichier `bio.ferlab.itw.part1.javaimpl.Part1Spec`)

# Part 2: Spark

**Objectif :** Ecrire une application qui à partir des vcf du repertoire `main/resources/vcf` genère une table `occurrences`.
Cette table a les particularités suivantes :
- Format Parquet
- Path local (ex.: `/home/ubuntu/occurrences`)
- Renommer la colonne contigName par chromosome
- Partitionnée par `chromosome`
- Ne contient que les variants avec la propriété `FILTER = PASS`
- Contient une colonne supplémentaire qui provient du fichier `clinvar` et qui donne la pathogénicité du variant
 
 *Tip :* Utiliser la librairie [Glow](https://glow.readthedocs.io/en/latest/getting-started.html) pour lire les vcf.
  
 **Question :** Comment packager cette application afin qu'elle s'execute dans un cluster spark.
 **Bonus :** A partir de table précédente, combien il y a de variants par type de pathogénicité? Par genes?
 
