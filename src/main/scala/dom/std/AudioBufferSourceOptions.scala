package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioBufferSourceOptions extends StObject {
  
  var buffer: js.UndefOr[AudioBuffer | Null] = js.native
  
  var detune: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[scala.Boolean] = js.native
  
  var loopEnd: js.UndefOr[Double] = js.native
  
  var loopStart: js.UndefOr[Double] = js.native
  
  var playbackRate: js.UndefOr[Double] = js.native
}
object AudioBufferSourceOptions {
  
  @scala.inline
  def apply(
    buffer: js.UndefOr[Null | AudioBuffer] = js.undefined,
    detune: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    loopEnd: js.UndefOr[Double] = js.undefined,
    loopStart: js.UndefOr[Double] = js.undefined,
    playbackRate: js.UndefOr[Double] = js.undefined
  ): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(loopEnd)) __obj.updateDynamic("loopEnd")(loopEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(loopStart)) __obj.updateDynamic("loopStart")(loopStart.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
}
