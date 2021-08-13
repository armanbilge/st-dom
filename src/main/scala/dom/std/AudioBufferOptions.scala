package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioBufferOptions extends StObject {
  
  var length: Double = js.native
  
  var numberOfChannels: js.UndefOr[Double] = js.native
  
  var sampleRate: Double = js.native
}
object AudioBufferOptions {
  
  @scala.inline
  def apply(length: Double, sampleRate: Double, numberOfChannels: js.UndefOr[Double] = js.undefined): AudioBufferOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfChannels)) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferOptions]
  }
}
