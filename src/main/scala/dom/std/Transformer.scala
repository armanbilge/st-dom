package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer[I, O] extends StObject {
  
  var flush: js.UndefOr[TransformerFlushCallback[O]] = js.native
  
  var readableType: Unit = js.native
  
  var start: js.UndefOr[TransformerStartCallback[O]] = js.native
  
  var transform: js.UndefOr[TransformerTransformCallback[I, O]] = js.native
  
  var writableType: Unit = js.native
}
object Transformer {
  
  @scala.inline
  def apply[I, O](
    readableType: Unit,
    writableType: Unit,
    flush: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit] = null,
    start: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit] = null,
    transform: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit] = null
  ): Transformer[I, O] = {
    val __obj = js.Dynamic.literal(readableType = readableType.asInstanceOf[js.Any], writableType = writableType.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1(flush))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Transformer[I, O]]
  }
}
