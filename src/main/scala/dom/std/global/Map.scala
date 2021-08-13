package dom.std.global

import dom.std.Iterable
import dom.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends StObject
     with dom.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
object Map {
  
  @scala.inline
  def apply: MapConstructor = js.Dynamic.global.selectDynamic("Map").asInstanceOf[MapConstructor]
}
