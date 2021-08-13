package dom.std.global

import dom.std.BlobPart
import dom.std.BlobPropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Blob")
@js.native
class Blob ()
  extends StObject
     with dom.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
  def this(blobParts: Unit, options: BlobPropertyBag) = this()
}
