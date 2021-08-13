package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAudioContextOptions extends StObject {
  
  var length: Double = js.native
  
  var numberOfChannels: js.UndefOr[Double] = js.native
  
  var sampleRate: Double = js.native
}
object OfflineAudioContextOptions {
  
  @scala.inline
  def apply(length: Double, sampleRate: Double, numberOfChannels: js.UndefOr[Double] = js.undefined): OfflineAudioContextOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfChannels)) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextOptions]
  }
}
