package dom.std

import dom.std.stdStrings.midi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MidiPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  @JSName("name")
  var name_MidiPermissionDescriptor: midi = js.native
  
  var sysex: js.UndefOr[scala.Boolean] = js.native
}
object MidiPermissionDescriptor {
  
  @scala.inline
  def apply(sysex: js.UndefOr[scala.Boolean] = js.undefined): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = "midi")
    if (!js.isUndefined(sysex)) __obj.updateDynamic("sysex")(sysex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
}
