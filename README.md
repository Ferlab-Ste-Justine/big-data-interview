Ferlab Big Data interview 
=============

# Part 1: Scala basics

**Objectif :** Faire passer les tests dans le fichier `bio.ferlab.itw.part1.Part1Spec`

# Part 2: Spark

**Objectif :** Ecrire une application qui à partir des vcf du repertoire `main/resources/vcf` genère une table `occurrences`.
Cette table a les particularités suivantes :
- Format Parquet
- Path local (ex.: `/home/ubutu/occurrences`)
- Partitionnée par `contigName` (chromosome)
- Ne contient que les variants avec la propriété `FILTER = PASS`
- Contient une colonne supplémentaire qui provient du fichier `clinvar` et qui donne la pathogénicité du variant
 
 *Tip :* Utiliser la librairie [Glow](https://glow.readthedocs.io/en/latest/getting-started.html) pour lire les vcf.
  
 **Question :** Comment packager cette application afin qu'elle s'execute dans un cluster spark.
 **Bonus :** Créer une autre table qui à partir de la table précédente, compte le nombre de variants par genes.
 
