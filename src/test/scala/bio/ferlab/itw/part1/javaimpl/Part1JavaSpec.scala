package bio.ferlab.itw.part1.javaimpl

import bio.ferlab.itw.part1.javaimpl.Variant.{cancers, groupByGene, splitByImpact}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import java.util.Arrays
import java.util.HashSet

class Part1JavaSpec extends AnyFlatSpec with Matchers {

  "cancers" should "return cancer variants" in {
    val variants = Arrays.asList(
      new Variant("1", 1000, "A", "T", new Gene("BRAF", new HashSet[String](Arrays.asList("Ganglioma", "Neuroblastoma")))),
      new Variant("2", 2000, "C", "G", new Gene("ALF8", new HashSet[String]())),
      new Variant("3", 3000, "C", "G", new Gene("ORE5", new HashSet[String](Arrays.asList("Heart defects", "Neuroblastoma")))),
      new Variant("4", 4000, "C", "G", new Gene("PRED8", new HashSet[String](Arrays.asList("Heart defects"))))
    )
    val results = cancers(variants)
    results.size() shouldBe 2
    results.get(0) shouldBe "1_1000_A_T"
    results.get(1) shouldBe "3_3000_C_G"
  }

  "splitByImpact" should "return 2 collections in" in {
    val variants = Arrays.asList(
      new Variant("1", 1000, "A", "T", new Gene("BRAF", new HashSet[String](Arrays.asList("Ganglioma", "Neuroblastoma")))),
      new Variant("2", 2000, "C", "G", new Gene("ALF8", new HashSet[String]())),
      new Variant("3", 3000, "C", "G", new Gene("ORE5", new HashSet[String](Arrays.asList("Heart defects")))),
      new Variant("4", 4000, "C", "G", new Gene("PRED8", new HashSet[String]()))
    )

    val results = splitByImpact(variants)
    results.size() shouldBe 2

    val highImpactVariants = results.get(0)
    highImpactVariants.size() shouldBe 2
    highImpactVariants.get(0) shouldBe "1_1000_A_T"
    highImpactVariants.get(1) shouldBe "3_3000_C_G"

    val lowImpactVariants = results.get(1)
    lowImpactVariants.size() shouldBe 2
    lowImpactVariants.get(0) shouldBe "2_2000_C_G"
    lowImpactVariants.get(1) shouldBe "4_4000_C_G"


  }

  "groupByGene" should "return variant by gene" in {
    val variants = Arrays.asList(
      new Variant("1", 1000, "A", "T", new Gene("BRAF", new HashSet[String](Arrays.asList("Ganglioma", "Neuroblastoma")))),
      new Variant("2", 2000, "C", "G", new Gene("ALF8", new HashSet[String]())),
      new Variant("4", 4000, "C", "G", new Gene("ALF8", new HashSet[String]()))
    )


    val results = groupByGene(variants)
    results.size() shouldBe 2

    results.containsKey("BRAF") shouldBe true
    val brafVariants = results.get("BRAF")
    brafVariants.size() shouldBe 1
    brafVariants.get(0) shouldBe "1_1000_A_T"

    results.containsKey("ALF8") shouldBe true
    val alf8Variants = results.get("ALF8")
    alf8Variants.size() shouldBe 2
    alf8Variants.get(0) shouldBe "2_2000_C_G"
    alf8Variants.get(1) shouldBe "4_4000_C_G"

  }


}
