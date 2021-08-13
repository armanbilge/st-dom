package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSFontFaceRule
  extends StObject
     with CSSRule {
  
  val style: CSSStyleDeclaration = js.native
}
object CSSFontFaceRule {
  
  @scala.inline
  def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    cssText: java.lang.String,
    style: CSSStyleDeclaration,
    `type`: Double,
    parentRule: CSSRule = null,
    parentStyleSheet: CSSStyleSheet = null
  ): CSSFontFaceRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("parentRule")(if (parentRule != null) parentRule.asInstanceOf[CSSRule].asInstanceOf[js.Any] else null)
    __obj.updateDynamic("parentStyleSheet")(if (parentStyleSheet != null) parentStyleSheet.asInstanceOf[CSSStyleSheet].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[CSSFontFaceRule]
  }
}
