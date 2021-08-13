package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
@js.native
trait StyleSheet extends StObject {
  
  var disabled: scala.Boolean = js.native
  
  val href: java.lang.String | Null = js.native
  
  val media: MediaList = js.native
  
  val ownerNode: Element | ProcessingInstruction | Null = js.native
  
  val parentStyleSheet: CSSStyleSheet | Null = js.native
  
  val title: java.lang.String | Null = js.native
  
  val `type`: java.lang.String = js.native
}
object StyleSheet {
  
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    media: MediaList,
    `type`: java.lang.String,
    href: java.lang.String = null,
    ownerNode: Element | ProcessingInstruction = null,
    parentStyleSheet: CSSStyleSheet = null,
    title: java.lang.String = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("href")(if (href != null) href.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("ownerNode")(if (ownerNode != null) (ownerNode.asInstanceOf[Element | ProcessingInstruction]).asInstanceOf[js.Any] else null)
    __obj.updateDynamic("parentStyleSheet")(if (parentStyleSheet != null) parentStyleSheet.asInstanceOf[CSSStyleSheet].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("title")(if (title != null) title.asInstanceOf[java.lang.String].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[StyleSheet]
  }
}
