package butts

/**
  * Created by adrian on 2/26/16.
  */
class ButtFactory {
  def wrapAButt(butt: SpecButtInterface): SpecButtInterface = {
    new ButtWrapper(butt) with NoButts
  }
}
