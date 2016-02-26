package butts

/**
  * Created by adrian on 2/26/16.
  */
trait NoOpButtMutator extends ButtsMutatorTrait {
  def allOfThem(): String = throw new IllegalStateException("nope nope nope")
}
