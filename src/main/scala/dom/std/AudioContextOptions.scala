package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioContextOptions extends StObject {
  
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
}
object AudioContextOptions {
  
  @scala.inline
  def apply(
    latencyHint: AudioContextLatencyCategory | Double = null,
    sampleRate: js.UndefOr[Double] = js.undefined
  ): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    if (latencyHint != null) __obj.updateDynamic("latencyHint")(latencyHint.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextOptions]
  }
}
