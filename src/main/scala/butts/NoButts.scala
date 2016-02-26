package butts

/**
  * Created by adrian on 2/26/16.
  */
trait NoButts extends SpecButtInterface with ButtMutator{
  def moreButts(): String = "more butts"
  def becauseButts(): String = super.allOfThem()
  abstract override def allOfThem(): String = "No Butts"
}
