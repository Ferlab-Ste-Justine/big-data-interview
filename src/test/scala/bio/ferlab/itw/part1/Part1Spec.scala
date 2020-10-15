package bio.ferlab.itw.part1

import bio.ferlab.itw.part1.Variant.{cancers, groupByGene, splitByImpact}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Part1Spec extends AnyFlatSpec with Matchers {

  "cancers" should "return cancer variants" in {
    val variants = Seq(
      Variant("1", 1000, "A", "T", Gene("BRAF", Set("Ganglioma", "Neuroblastoma"))),
      Variant("2", 2000, "C", "G", Gene("ALF8", Set.empty)),
      Variant("3", 3000, "C", "G", Gene("ORE5", Set("Heart defects", "Neuroblastoma"))),
      Variant("4", 4000, "C", "G", Gene("PRED8", Set("Heart defects")))
    )
    cancers(variants) shouldBe Seq("1_1000_A_T", "3_3000_C_G")
  }

  "splitByImpact" should "return 2 collections in" in {
    val variants = Seq(
      Variant("1", 1000, "A", "T", Gene("BRAF", Set("Ganglioma", "Neuroblastoma"))),
      Variant("2", 2000, "C", "G", Gene("ALF8", Set.empty)),
      Variant("3", 3000, "C", "G", Gene("TOT6", Set("Heart defects"))),
      Variant("4", 4000, "C", "G", Gene("POP4", Set.empty))
    )
    splitByImpact(variants) shouldBe(Seq("1_1000_A_T", "3_3000_C_G"), Seq("2_2000_C_G", "4_4000_C_G"))
  }

  "groupByGene" should "return variant by gene" in {
    val variants = Seq(
      Variant("1", 1000, "A", "T", Gene("BRAF", Set("Ganglioma", "Neuroblastoma"))),
      Variant("2", 2000, "C", "G", Gene("ALF8", Set.empty)),
      Variant("4", 4000, "C", "G", Gene("ALF8", Set.empty))
    )
    groupByGene(variants) shouldBe Map("BRAF" -> Seq("1_1000_A_T"), "ALF8" -> Seq("2_2000_C_G", "4_4000_C_G"))
  }


}
