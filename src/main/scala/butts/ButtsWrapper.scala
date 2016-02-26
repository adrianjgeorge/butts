package butts

/**
  * Created by adrian on 2/26/16.
  */
class ButtsWrapper extends SpecButts with NoOpButtMutator {
  override def allOfThem(): String = super[SpecButts].allOfThem()
}
