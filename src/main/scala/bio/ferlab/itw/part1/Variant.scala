package bio.ferlab.itw.part1

case class Variant(chromosome: String, start: Long, reference: String, alternate: String, gene: Gene)

case class Gene(name: String, diseases: Set[String])

object Variant {
  val Cancers: Set[String] = Set("Ganglioma", "Neuroblastoma")

  def splitByImpact(variants: Seq[Variant]): (Seq[String], Seq[String]) = ???

  def cancers(variants: Seq[Variant]): Seq[String] = ???

  def groupByGene(variants: Seq[Variant]): Map[String, Seq[String]] = ???
}
