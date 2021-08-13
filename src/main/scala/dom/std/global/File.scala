package dom.std.global

import dom.std.BlobPart
import dom.std.FilePropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("File")
@js.native
class File protected ()
  extends StObject
     with dom.std.File {
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String) = this()
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String, options: FilePropertyBag) = this()
}
