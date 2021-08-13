package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapOptions extends StObject {
  
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.native
  
  var imageOrientation: js.UndefOr[ImageOrientation] = js.native
  
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.native
  
  var resizeHeight: js.UndefOr[Double] = js.native
  
  var resizeQuality: js.UndefOr[ResizeQuality] = js.native
  
  var resizeWidth: js.UndefOr[Double] = js.native
}
object ImageBitmapOptions {
  
  @scala.inline
  def apply(
    colorSpaceConversion: ColorSpaceConversion = null,
    imageOrientation: ImageOrientation = null,
    premultiplyAlpha: PremultiplyAlpha = null,
    resizeHeight: js.UndefOr[Double] = js.undefined,
    resizeQuality: ResizeQuality = null,
    resizeWidth: js.UndefOr[Double] = js.undefined
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeHeight)) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeWidth)) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}
